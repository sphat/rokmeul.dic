var AccordionObjectHeader;

var openMenu = function(num, taille){
	$('menu'+num).tween('height', taille);
};

var closeMenu = function(num){
	$('menu'+num).tween('height', '1px');
};

var changeImageMulti = function(num, dossier, nbImages){	
	if(dossier!=""){
		dossier=dossier+"/";
	}
	for(i=1;i<=nbImages;i++){
		if(document.getElementById('engag_'+i)){ 
		var elem = $('engag_'+i);
		if(num!=i){ 
		elem.className="menu";
		elem.onmouseover= function () {this.className='menu_on';}; 
		elem.onmouseout=function () {this.className='menu';}; 
		elem.onmousedown=function () {this.className='menu_on';}; 
		
		} else {
		elem.className="menu_on";
		elem.onmouseover= function () {this.className='menu_on';}; 
		elem.onmouseout=function () {this.className='menu_on';}; 
		elem.onmousedown=function () {this.className='menu_on';}; 
		}
		
		
		}
		
		if(document.getElementById('img'+i)){
			if(num!=i){
				image = document.getElementById('img'+i).src;
				longueur=image.length;
				pos = image.lastIndexOf('/');
				imageActuelle = image.substr( pos+1, longueur );
				if(imageActuelle=='btn_moins.gif'){
					document.getElementById('img'+i).src='/charte/'+dossier+'btn_plus.gif';
				}
			} else {
				image = document.getElementById('img'+num).src;
				longueur=image.length;
				pos = image.lastIndexOf('/');
				imageActuelle = image.substr( pos+1, longueur );
				if(imageActuelle=='btn_moins.gif'){
					document.getElementById('img'+num).src='/charte/'+dossier+'btn_plus.gif';
				} else {
					document.getElementById('img'+num).src='/charte/'+dossier+'btn_moins.gif';
				}
			}
		}
	}
};

var ouvertureDiv = function(sensOuverture, div, taille, duree){
	switch(sensOuverture) {
		case 'horizontale' :
			sensOuverture = 'width';
		break;
		case 'verticale' :
			sensOuverture = 'height';
		break;
	}
	myEffet = new Fx.Tween(div, { 
		link: 'cancel', 
		duration: duree, 
		transition: Fx.Transitions.Quart.easeOut, 
		onStart: $(div).setStyle('display', 'block') 
	});
	
	myEffet.start(sensOuverture, taille);
};

var fermetureDiv = function(sensOuverture, div, duree){
	switch(sensOuverture) {
		case 'horizontale' :
			sensOuverture = 'width';
		break;
		case 'verticale' :
			sensOuverture = 'height';
		break;
	}
	myEffet = new Fx.Tween(div, { 
		link: 'cancel', 
		duration: duree, 
		transition: Fx.Transitions.Quart.easeOut
	});
	
	myEffet.start(sensOuverture, '1px');
	setTimeout("$('"+div+"').setStyle('display', 'none')",duree);
};

var effetTransparence = function(effet,div){
	switch(effet){
		case 'disparition' :
			$(div).fade('1', '0');
		break;
		case 'apparition' :
			$(div).setStyle('display', 'block');
			$(div).fade('0', '1');
		break;
	}
};

var gestionAffichageDiv = function(div){
	if(document.getElementById(div).style.display=='none'){
		document.getElementById(div).style.display='block';
	} else {
		document.getElementById(div).style.display='none';
	}
};

var gestionAffichageDivMulti = function(div){ 
	for(i=1;i<=10;i++){
		if(document.getElementById('onglet'+i) && i!=div){
			document.getElementById('onglet'+i).style.display='none';
		} else if(document.getElementById('onglet'+i) && i==div){
			document.getElementById('onglet'+div).style.display='block';
		}
		if(document.getElementById('bouton_onglet'+i) && i!=div ){
			$('bouton_onglet'+i).className='detail_onglet_off';
			$('bouton_onglet'+i).onmouseover = function() {this.className='detail_onglet_on';}
			$('bouton_onglet'+i).onmouseout = function() {this.className='detail_onglet_off';}
		} else if(document.getElementById('bouton_onglet'+i) && i==div ){
			document.getElementById('bouton_onglet'+div).className='detail_onglet_select';
			$('bouton_onglet'+div).onmouseover = function() {void(0);}
			$('bouton_onglet'+div).onmouseout = function() {void(0);}
		}
	}
};


var afficheMultiDiv = function(sensOuverture, div, taille, nbDiv){
	var nbCar = div.length;
	var numDiv = div.substr(nbCar-1, nbCar);
	var nomDiv = div.substring(0, nbCar-1);
	
	switch(sensOuverture) {
		case 'horizontale' :
			sensOuverture = 'width';
		break;
		case 'verticale' :
			sensOuverture = 'height';
		break;
	}
	
	for(i=1;i<=nbDiv;i++){
		if($(nomDiv+''+i).getStyle('display')=='block'){
			$(nomDiv+''+i).tween(sensOuverture, '1px');
			setTimeout("$('"+nomDiv+""+i+"').setStyle('display', 'none')",500);
		}
	}
	
	if($(div).getStyle('display')=='none'){
		$(div).setStyle('display','block');
		$(div).tween(sensOuverture, taille);
	} else {
		$(div).tween(sensOuverture, '1px');
		setTimeout("$('"+div+"').setStyle('display', 'none')",500);
	}
};

window.addEvent('domready', function() {	
	
	var toggler2 = $$('.onglet_catalogue');
	var element2 = $$('.onglet_catalogue_detail');
	
	AccordionObjectHeader = new Accordion(toggler2, element2, {
	show:'none',
	height : true,
	width : false,
	opacity: true,
	trigger: 'click',
	fixedHeight: false, 
	fixedWidth: false,
	alwaysHide:false
	});	
	
	var toggler3 = $$('.div_header_general');
	var element3 = $$('.hd_panier');
	
	AccordionObjectHeader = new Accordion(toggler3, element3, {
	display: '',
	height : true,
	width : false,
	opacity: false,
	fixedHeight: false, 
	fixedWidth: false,
	alwaysHide:false
	});
	
	
	var toggler2 = $$('.b-avis');
	var element2 = $$('.avis_suite');
	
	AccordionObjectHeader = new Accordion(toggler2, element2, {
	show:'none',
	height : true,
	width : false,
	opacity: true,
	trigger: 'click',
	fixedHeight: false, 
	fixedWidth: false,
	alwaysHide:true
	});
	
	/*Lire la suite pour le site segment (Piscine Ronde)*/
	var toggler_lire_suite = $$('.lire-suite-plonger');
	var element_explicatif_plonger = $$('.explicatif_class');
	
	AccordionObjectHeader = new Accordion(toggler_lire_suite, element_explicatif_plonger, {
	show:'none',
	height : true,
	width : false,
	opacity: true,
	trigger: 'click',
	fixedHeight: false, 
	fixedWidth: false,
	alwaysHide:true
	});
	
	/*
	toggler3.addEvent('mouseenter', function() { this.fireEvent('click'); });
	*/
	
	
	
	//toggler3.addEvent('mouseleave', function() { this.fireEvent('click'); });	
	try {
	//var inputWord = $('recherche_ch');
	//new Autocompleter.Request.HTML(inputWord, '/ajax/query_produits.php', {
	//	'indicatorClass': 'autocompleter-loading',// class added to the input during request
	//	'postVar': 'recherche_ch','minLength' : 3,'width' : '195','emptyChoices' : $$('.cat'),'autoSubmit' : 'true'
	//});
	} catch (err) {}
	
});

var deroulerDiv = function(sensOuverture, div, taille, duree){
	switch(sensOuverture) {
		case 'horizontale' :
			sensOuverture = 'width';
		break;
		case 'verticale' :
			sensOuverture = 'height';
		break;
	}
	
	etatDiv=$(div).getStyle('display');
	
	myEffet = new Fx.Tween(div, { 
		link: 'cancel', 
		duration: duree, 
		transition: Fx.Transitions.Quart.easeOut 
	});
	
	if(etatDiv=="none"){
		$(div).setStyle('display', 'block');
		myEffet.start(sensOuverture, taille);
	} else if(etatDiv=="block"){
		myEffet.start(sensOuverture, '1px');
		setTimeout("$('"+div+"').setStyle('display', 'none')",duree);
	}
};


var faqalign =function(id){
	
	for(i=1;i<=30;i++){
		if(document.getElementById('faq_'+i)){ 
		var elem = $('faq_'+i);
		if(id!=i){ 
		elem.className="menu";
		elem.onmouseover= function () {this.className='menu_on';}; 
		elem.onmouseout=function () {this.className='menu';}; 
		elem.onmousedown=function () {this.className='menu_on';}; 
		
		} else {
		elem.className="menu_on";
		elem.onmouseover= function () {this.className='menu_on';}; 
		elem.onmouseout=function () {this.className='menu_on';}; 
		elem.onmousedown=function () {this.className='menu_on';}; 
		}
		
		
		}
	}
	
	};

var effetTransparence = function(effet,div){
	switch(effet){
		case 'disparition' :
			$(div).fade('1', '0');
		break;
		case 'apparition' :
			$(div).setStyle('opacity', '0');
			$(div).setStyle('display', 'block');
			$(div).fade('0', '1');
		break;
	}
};

function findMagasinsByDepartement(id) {
	new Request.HTML({
		url : "/ajax/find_magasins.php",
		method : 'post',
		async : false,
		update : $('magasins'),
		data : {
			'departement_id' : id
		}
	}).send();
}

function updatePays(id) {
	
	chPays = new Request.HTML({
		url : "/ajax/get_geoloc.php",
		method : 'post',
		async : false,
		evalScripts : true,
		update : $('region'),
		data : {
			'type' : 'region',
			'pays_id' : id
		},
		onSuccess : function() {
			/*
			$("select_region").addEvent('click', function(){                 
				if(this.getNext(".select_liste").isDisplayed()){
					this.getNext(".select_liste").hide(); 
				  }else{
					   $$(".select_liste").hide();
					  this.getNext(".select_liste").show(); 
				  }                       
				});
				
			*/
			resetSelectListe();
			$('input_region_nom').value="";
			$('input_region_id').value="";
			$('select_region').innerHTML="Choisissez une r&eacute;gion";
			$$('#select_region ul li a').addEvent('click',function(){
				updateRegion(this.id);
			});
			
			chDepart = new Request.HTML({
				url : "/ajax/get_geoloc.php",
				method : 'post',
				async : false,
				evalScripts : true,
				update : $('dept'),
				data : {
					'type' : 'departement',
					'pays_id' : id
				},
				onSuccess : function() {
					/*
					$("dept").setStyle('width','200px');        // gestion ouverture Select sujet 	  
					$("select_dept").addEvent('click', function(){                 
						  if(this.getNext(".select_liste").isDisplayed()){
							  this.getNext(".select_liste").hide(); 
						  }else{
							   $$(".select_liste").hide();
							  this.getNext(".select_liste").show(); 
						  }                       
						});
					*/
					resetSelectListe();
					$('input_dept_nom').value="";
					$('input_dept_id').value="";
					$('select_dept').innerHTML="Choisissez un d&eacute;partement";
					$$('#select_dept ul li a').each(function(){
						void(0);
					});
					
				}
				
			});
			
			chDepart.send();
			
		}
		
	});
	chPays.send();
	
}

function updateRegion(id) {
                    	
	new Request.HTML({
		url : "/ajax/get_geoloc.php",
		method : 'post',
		async : false,
		evalScripts : true,
		update : $('dept'),
		data : {
			'type' : 'departement',
			'region_id' : id
		},
		onSuccess : function() {
			
			//setTimeout(1000);
			//$("dept").setStyle('width','185px'); // gestion ouverture Select sujet
			
			/*
			$("select_dept").addEvent('click', function(){        
				  if(this.getNext(".select_liste").isDisplayed()){
					  this.getNext(".select_liste").hide(); 
				  }else{
					   $$(".select_liste").hide();
					  this.getNext(".select_liste").show(); 
				  }                       
				});
			*/
			
			resetSelectListe();
			$('input_dept_nom').value="";
			$('input_dept_id').value="";
			$('select_dept').innerHTML="Choisissez un d&eacute;partement";
			$$('#select_dept ul li').each(function(el){
				void(0);
			});
			
			
		}
	}).send();
}

function resetSelectListe() {
	$$(".select_liste").addEvent('mouseleave', function(){   
        $$(".select_liste").hide();
        
    });
    $$("input").addEvent('click', function(){   
        $$(".select_liste").hide();            
    });
    $$("textarea").addEvent('click', function(){   
        $$(".select_liste").hide();            
    });
    
    /*gestion de la liste des selects*/
           
   $$(".select_liste a").addEvent('click', function(){   
       var lienclasses=this.get("class").split(" ");  
       var idtype=lienclasses[0].split("-");  
        $("select_"+idtype[0]).set("html",this.get("html"));
        $("select_"+idtype[0]).setStyle('color', '#000');
        $("select_"+idtype[0]).setStyle('background-position', '0px 0px');             
        $("input_"+idtype[0]+"_id").set("value",idtype[1]);
        $("input_"+idtype[0]+"_nom").set("value",this.get("html"));
        $$(".select_liste").hide();
        
       /*pas de recharge de la page */
        //this.stop();
    });
}

/***
 * Generate HTML de pagination
 * @param page_nom (u = utilisateur, b=bricoleurs )
 * @param page_id (le mombre de page)
 * @returns HTML 
 */
var move_page = function(page_nom,page_id){
		//....
		var option = {
			url: "/pagination_votre_avis.htm",
			//update: $('div_avi_util'),
			method: 'post',
			data: {'page' : page_id, 'type' : page_nom}, 
			onSuccess: function(a,b,responseHTML,c){
				if(page_nom=='u'){
					$('div_avi_util').innerHTML = responseHTML;
				}
				if(page_nom=='b'){
					$('div_avi_brico').innerHTML = responseHTML;					
				}
			},
			evalScripts: true
			};
		//....
		var monObjetAjax= new Request.HTML(option);
		monObjetAjax.send();					
};

/* Affichage Bloc Etape Montage*/
function cacheEtape(){
	for(i=1;i<=5;i++){
		$('etape'+i).style.display='none';
		$('b-etape'+i).className='';
	}
}

function afficheEtape(num){
	$('etape'+num).style.display='block';
	$('b-etape'+num).className='select';
}

/* Affichage Bloc Reportage*/
function cacheReportage(){
	for(i=1;i<=4;i++){
		$('reportage'+i).style.display='none';
		$('b-reportage'+i).className='';
	}
}

function afficheReportage(num){
	$('reportage'+num).style.display='block';
	$('b-reportage'+num).className='select';
}

/**
 * Add slashes pour le string
 * @param str
 * @returns string
 * @author sphat
 */
var addslashes = function(str) {
	str=str.replace(/\\/g,'\\\\');
	str=str.replace(/\'/g,'\\\'');
	str=str.replace(/\"/g,'\\"');
	str=str.replace(/\0/g,'\\0');
	return str;
};

/**
 * Event mouse over 
 * Pour le : frm_type
 * @author sphat	
 */
var over_type_proj = function(id){
	var current_class = $(id).get('class').split(' ');
	if(current_class.length==1){
		$(id).addClass(id+'_ouver');
	}else if (current_class[1]==''){
		$(id).addClass(id+'_ouver');		
	}else if(current_class[1]==id+'_out'){
		$(id).removeClass(current_class[1]);
		$(id).addClass(id+'_ouver');
	}
};

/**
 * Event mouse out 
 * Pour le : frm_type
 * @author sphat	
 */
var out_type_proj = function(id){
	var current_class = $(id).get('class').split(' ');
	if(current_class.length==1){
		$(id).addClass(id+'_out');
	}else if (current_class[1]==''){
		$(id).addClass(id+'_out');		
	}else if(current_class[1]==id+'_ouver'){
		$(id).removeClass(current_class[1]);
		$(id).addClass(id+'_out');
	}
};

/**
 * Allow number only
 * @param evt
 * @returns
 * @author sphat
 */
var number_only = function(evt,id){
    var charCode = (evt.which) ? evt.which : event.keyCode;
    var test = false;
    	if (charCode > 31 && (charCode < 48 || charCode > 57)){
    		test = false;
    	}else{
    		test = true;
    	}
    return test;
};