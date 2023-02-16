lad1=document.getElementById("lado_1");
lad2=document.getElementById("lado_2");
lad3=document.getElementById("lado_3");

function validarLados(){
    var TipoFigura=document.getElementById("tipo");
    //console.log(TipoFigura);

    if(TipoFigura.value=="cuadrado"){
       document.getElementById("lado_1").disabled=false;
       document.getElementById("lado_2").disabled=true;
       document.getElementById("lado_3").disabled=true;
    }else if (TipoFigura.value=="rectangulo"){
        document.getElementById("lado_1").disabled=false;
        document.getElementById("lado_2").disabled=false;
        document.getElementById("lado_3").disabled=true;
    }
    else if (TipoFigura.value=="triangulo"){
        document.getElementById("lado_1").disabled=false;
        document.getElementById("lado_2").disabled=false;
        document.getElementById("lado_3").disabled=false;
    }
    
}