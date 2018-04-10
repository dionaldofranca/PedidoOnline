<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastre-se</title>
<%@ include file="include/bootstrap.jsp"%>
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
					<li class="nav-item"><a href="index.jsp" class="nav-link">Início</a>
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
										<input id="UsuarioInput" placeholder="Usuario"
											class="form-control form-control-sm" type="text" required="">
									</div>
									<div class="form-group">
										<input id="SenhaInput" placeholder="Senha"
											class="form-control form-control-sm" type="text" required="">
									</div>
									<div class="form-group">
										<button type="submit" class="btn btn-primary btn-block">Entrar</button>
									</div>
									<div class="form-group text-xs-center">
										<small><a href="#">Esqueci minha senha</a></small>
									</div>
								</form>

							</li>

						</ul>

					</li>
				</ul>
			</div>
		</div>
	</nav>

	<form action="CadastrarUsuario.do" method="post">

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
							<label class="col-lg-3 col-form-label form-control-label">Usuário:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="login">
							</div>
						</div>
						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Senha:</label>
							<div class="col-lg-9">
								<input class="form-control" type="password" name="senha">
							</div>
						</div>
						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Digite
								novamente:</label>
							<div class="col-lg-9">
								<input class="form-control" type="password" name="repetesenha">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Nome:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="nome">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">CPF
								ou CNPJ:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="cpfcnpj"
									pattern="[0-9]+$" required="required">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Endereço:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="endereco">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Bairro:</label>
							<div class="col-lg-3">
								<input class="form-control" type="text" name="telefone">
							</div>
							<label class="col-lg-1 col-form-label form-control-label">Cidade:</label>
							<div class="col-lg-3">
								<input class="form-control" type="text" name="telefone">
							</div>	
						</div>
					

						<div class="form-group row">
						<label class="col-lg-3 col-form-label form-control-label">Estado:</label>
						<div class="col-lg-9">
						<select id="estado">
							<option value="">Selecione</option>
							<option value="AC">Acre</option>
							<option value="AL">Alagoas</option>
							<option value="AP">Amapá</option>
							<option value="AM">Amazonas</option>
							<option value="BA">Bahia</option>
							<option value="CE">Ceará</option>
							<option value="DF">Distrito Federal</option>
							<option value="ES">Espirito Santo</option>
							<option value="GO">Goiás</option>
							<option value="MA">Maranhão</option>
							<option value="MS">Mato Grosso do Sul</option>
							<option value="MT">Mato Grosso</option>
							<option value="MG">Minas Gerais</option>
							<option value="PA">Pará</option>
							<option value="PB">Paraíba</option>
							<option value="PR">Paraná</option>
							<option value="PE">Pernambuco</option>
							<option value="PI">Piauí</option>
							<option value="RJ">Rio de Janeiro</option>
							<option value="RN">Rio Grande do Norte</option>
							<option value="RS">Rio Grande do Sul</option>
							<option value="RO">Rondônia</option>
							<option value="RR">Roraima</option>
							<option value="SC">Santa Catarina</option>
							<option value="SP">São Paulo</option>
							<option value="SE">Sergipe</option>
							<option value="TO">Tocantins</option>
						</select>
						<label class="col-lg-1 col-form-label form-control-label">Cep:</label>
							<div class="col-lg-">
								<input class="form-control" type="text" name="cep">
							</div>
						
							</div>
						</div>
						
						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Cep:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="telefone">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Celular:</label>
							<div class="col-lg-9">
								<input class="form-control" type="text" name="celular">
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">E-mail:</label>
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

</body>
</html>