  window.addEvent('domready', function(){
  
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
               
       $$(".select_liste a").addEvent('click', function(e){
           var lienclasses=this.get("class").split(" ");  
           var idtype=lienclasses[0].split("-");  
            $("select_"+idtype[0]).set("html",this.get("html"));
            $("select_"+idtype[0]).setStyle('color', '#000');
            $("select_"+idtype[0]).setStyle('background-position', '0px 0px');             
            $("input_"+idtype[0]+"_id").set("value",idtype[1]);
            $("input_"+idtype[0]+"_nom").set("value",this.get("html"));
                      
            $$(".select_liste").hide();             
           /*pas de recharge de la page */
            e.stop();
        });
       
       $$(".select_liste_").addEvent('mouseleave', function(){   
           $$(".select_liste_").hide();
           
       });
       $$("input").addEvent('click', function(){   
           $$(".select_liste_").hide();            
       });
       $$("textarea").addEvent('click', function(){   
           $$(".select_liste_").hide();            
       });
       
       /*gestion de la liste des selects*/
              
      $$(".select_liste_ a").addEvent('click', function(e){
          var lienclasses=this.get("class").split(" ");  
          var idtype=lienclasses[0].split("-");  
           $("select_"+idtype[0]).set("html",this.get("html"));
           $("select_"+idtype[0]).setStyle('color', '#000');
           $("select_"+idtype[0]).setStyle('background-position', '0px 0px');             
           $("input_"+idtype[0]+"_id").set("value",idtype[1]);
           $("input_"+idtype[0]+"_nom").set("value",this.get("html"));
                     
           $$(".select_liste_").hide();             
          /*pas de recharge de la page */
           e.stop();
       });       
});