function validarSenha() {
	
	var senha = cadastro.senha.value;
	var repetesenha = cadastro.repetesenha.value;
	
	if (senha != repetesenha) {
		document.getElementById('resultado').style.color = "#FF6347" 
		document.getElementById('resultado').innerHTML = "&#88 - As senhas não correspondem!";
	}else{
		document.getElementById('resultado').style.color = "#008B45"
		document.getElementById('resultado').innerHTML = "&#10003 - Senhas Confirmada!";	
	}
}

