<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastre-se</title>
<%@ include file="include/bootstrap.jsp"%>

 <script type="text/javascript" src="js/js.js"></script>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark "
		role="navigation">
		<a class="navbar-brand" href="#"><img src="img/logo/logo.png"
			height="50px"></a>
		<button class="navbar-toggler border-0" type="button"
			data-toggle="collapse" data-target="#exCollapsingNavbar">
			&#9776;</button>

		<div class="container">

			<div class="collapse navbar-collapse" id="exCollapsingNavbar">
				<ul class="nav navbar-nav">
					<li class="nav-item"><a href="index.jsp" class="nav-link">In�cio</a>
					</li>
					<li class="nav-item"><a href="masculino.jsp" class="nav-link">Masculino</a></li>
					<li class="nav-item"><a href="feminino.jsp" class="nav-link">Feminino</a></li>
					<li class="nav-item"><a href="infantil.jsp" class="nav-link">Infantil</a></li>
				</ul>


				<ul class="nav navbar-nav flex-row justify-content-between ml-auto">
					<li class="nav-item order-1 order-md-1"><a href="#"
						class="nav-link" title="settings"><i
							class="fa fa-cog fa-fw fa-lg"></i></a></li>
					<li class="dropdown order-1">
						<button type="button" id="dropdownMenu1" data-toggle="dropdown"
							class="btn btn-outline-secondary dropdown-toggle">
							Entrar <span class="caret"></span>
						</button>
						<ul class="dropdown-menu dropdown-menu-right mt-1">
							<li class="p-3">
							
							
								<form action="AutenticaUsuario.do" method="post" class="form"
									role="form">
									<div class="form-group">
										<input name="usuario" placeholder="Usuario"
											class="form-control form-control-sm" type="text"
											required="required">
									</div>
									<div class="form-group">
										<input name="senha" placeholder="Senha"
											class="form-control form-control-sm" type="text"
											required="required">
									</div>
									<div class="form-group">
										<button type="submit" class="btn btn-primary btn-block">Entrar</button>
									</div>
									<div class="form-group text-xs-center">
										<small><a href="esqueciSenha.jsp">Esqueci minha senha</a></small>
									</div>
								</form>
								
								
							</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<form name="cadastro" action="CadastrarUsuario.do" method="post" >

		<div class="col-md-8 offset-md-2">
			<span class="anchor" id="formUserEdit"></span>
			<hr class="my-5">

			<!-- form user info -->
			<div class="card card-outline-secondary">
				<div class="card-header">
					<h3 class="mb-0">Cadastro</h3>
				</div>
				<div class="card-body">
					<form class="form" role="form" autocomplete="off">

						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">Usu�rio:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="login" minlength="5" maxlength="10">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">Senha:</label>
							<div class="col-lg-3">
								<input onkeyup="validarSenha()" class="form-control" type="password" name="senha" minlength="6" maxlength="8">
							</div>
							<label class="col-lg-2 col-form-label form-control-label">
								Repetir Senha:</label>
							<div class="col-lg-3">
								<input onkeyup="validarSenha()" class="form-control" type="password" name="repetesenha" minlength="6" maxlength="8">
							</div>
						</div>
						
						<div class="form-group row">
							
							<div class="col-lg-9">
								<p id="resultado"></p>
							</div>
						</div>
					
						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">Nome:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="nome">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">CPF
								ou CNPJ:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="cpfcnpj" pattern="[0-9]+$" required="required" minlength="11" maxlength="13">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">Endere�o:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="endereco">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">Bairro:</label>
							<div class="col-lg-3">
								<input class="form-control" type="text" name="bairro">
							</div>
							<label class="col-lg-2 col-form-label form-control-label">Cidade:</label>
							<div class="col-lg-4">
								<input class="form-control" type="text" name="cidade">
							</div>
						</div>


						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">Estado:</label>

							<div class="col-lg-3">
								<select class="form-control" type ="text" name="estado">
									<option value="">Selecione</option>
									<option value="AC">Acre</option>
									<option value="AL">Alagoas</option>
									<option value="AP">Amap�</option>
									<option value="AM">Amazonas</option>
									<option value="BA">Bahia</option>
									<option value="CE">Cear�</option>
									<option value="DF">Distrito Federal</option>
									<option value="ES">Espirito Santo</option>
									<option value="GO">Goi�s</option>
									<option value="MA">Maranh�o</option>
									<option value="MS">Mato Grosso do Sul</option>
									<option value="MT">Mato Grosso</option>
									<option value="MG">Minas Gerais</option>
									<option value="PA">Par�</option>
									<option value="PB">Para�ba</option>
									<option value="PR">Paran�</option>
									<option value="PE">Pernambuco</option>
									<option value="PI">Piau�</option>
									<option value="RJ">Rio de Janeiro</option>
									<option value="RN">Rio Grande do Norte</option>
									<option value="RS">Rio Grande do Sul</option>
									<option value="RO">Rond�nia</option>
									<option value="RR">Roraima</option>
									<option value="SC">Santa Catarina</option>
									<option value="SP">S�o Paulo</option>
									<option value="SE">Sergipe</option>
									<option value="TO">Tocantins</option>
								</select>
							</div>

							<label class="col-lg-2 col-form-label form-control-label">Cep:</label>
							<div class="col-lg-4">
								<input class="form-control" type="text" name="cep">
							</div>

						</div>

						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">Telefone:</label>
							<div class="col-lg-3">
								<input class="form-control" type="text" name="telefone">
							</div>
							<label class="col-lg-2 col-form-label form-control-label">Celular:</label>
							<div class="col-lg-4">
								<input class="form-control" type="text" name="celular">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-2 col-form-label form-control-label">E-mail:</label>
							<div class="col-lg-9">
								<input class="form-control" type="email" name="email">
							</div>
						</div>

						<div>
							<input type="hidden" name="tipousuario" value="3">
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label"></label>
							<div class="col-lg-9">
								<input type="button" class="btn btn-secondary" value="Cancelar"
									onclick="window.location.href='index.jsp'"> <input
									type="submit" class="btn btn-primary" value="Cadastre-se">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</form>
	<%@ include file="include/footer.jsp"%>	
</body>
</html>