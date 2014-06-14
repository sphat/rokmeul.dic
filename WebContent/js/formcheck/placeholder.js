 window.addEvent('domready', function(){      
    $$(".placeholder").each(function(el){  
        var label = el.getElement('label');
        var input = el.getElement('input,textarea');    
        if(input.get("value")!=""){
            label.hide();
        }  
        
        
        /* special ie le label peut etre cliquable */
        label.addEvent("click",function(){
             if(input.get("value")==""){
                label.morph({'opacity': 0.5});
            }
            input.focus();
        });
        /*--------------*/
                
       
           
        input.addEvent("change",function(){
           
            if(input.get("value")!=""){
               label.hide();  
            } 
       }); 
        input.addEvent("click",function(){           
            if(input.get("value")!=""){
               label.hide();  
            }
        }); 
        
        input.addEvent("focus",function(){
            if(input.get("value")==""){
                label.morph({'opacity': 0.5});
            }else{
               label.hide();  
            }
        });        
        input.addEvent("blur",function(){
            if(input.get("value")==""){ 
                label.show(); 
                label.morph({'opacity': 1});
            }else{
               label.hide();  
            }
        });        
        input.addEvent( 'keydown', function(){          
              label.hide();
        }); 
        
        input.addEvent("keypress",function(){   
            label.hide(); 
        });        
        
        
        input.addEvent("keyup",function(){                
           if(input.get("value")==""){
               label.show(); 
               label.morph({'opacity': 0.5});
           }
        });        
    });    
});