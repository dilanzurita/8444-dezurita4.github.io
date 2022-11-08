const form = document.getElementById("FormContacto");
const expresion = {
	email:  /^[a-z][\w.-]+@\w[\w.-]+\.[\w.-]*[a-z][a-z]$/i, // Correo Electronico.
	
}

function validarEmail() {
	var valor = document.getElementById("email").value;
	var vlce = false;
	if (!expresion.email.test(valor)){
		alert('Direccion de Correo No valida...!!!');
		vlce = false;
	}
	else{
		console.log("Direccion de Correo Correcta");
		vlce = true;
	}
	return vlce;
}

function validarTelefono(){
	var valor = document.getElementById("telefono").value;
	var vltl = false;
	if(valor.length == 10 && !isNaN(valor)){
		vltl = true;
	}else{
		alert('El Numero de telefono ingresado es Incorrecto');
	}
	return vltl;
}

async function deshabilitar(){
	if(validarEmail() && validarTelefono()){
		var btn = document.getElementById('btn');
		btn.disabled = true;
		btn.value = 'Enviando datos ..........';
		btn.form.submit();
	}
}