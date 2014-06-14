<link href="styles/formcheck.css" rel="stylesheet" type="text/css" />
<link href="styles/placeholder.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/mootools-core-1.3.2.js"></script>
<script type="text/javascript" src="js/mootools-more-1.3.2.1.js"></script>
<script type="text/javascript" src="js/mootools.js"></script>
<script type="text/javascript" src="js/formcheck/fr.js"></script>
<script type="text/javascript" src="js/formcheck/formcheck.js"></script>
<script type="text/javascript" src="js/formcheck/fauxselect.js"></script>
<script type="text/javascript" src="js/formcheck/placeholder.js"></script>
<script type="text/javascript">
window.addEvent('domready',function(){
    if ($('AddWordForm')) {
    	console.log("Found AddWordForm");
    new FormCheck('AddWordForm',{
        fieldErrorClass : 'erreur',
        display : {
            scrollToFirst : true,
            addClassErrorToField : true },
        regexp : {
        	alpha: /^[^0-9!"#$%&()*+,./:;<>?@[\\\]_`{|}~]+$/ 
        	},
        onValidateSuccess : function() {
        	console.log("Validate->Ok");
        }
       });
	};
});
</script>