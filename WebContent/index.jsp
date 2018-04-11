<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Início</title>
<%@ include file="include/bootstrap.jsp"%>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark " role="navigation">

		<a class="navbar-brand" href="#"><img src="img/logo/logo.png" height="50px"></a>

		<div class="container">

			<a class="navbar-brand" href="#">Início</a>
			<button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">&#9776;</button>
			<div class="collapse navbar-collapse" id="exCollapsingNavbar">
				<ul class="nav navbar-nav">
					<li class="nav-item"><a href="#" class="nav-link">Masculino</a></li>
					<li class="nav-item"><a href="#" class="nav-link">Feminino</a></li>
					<li class="nav-item"><a href="#" class="nav-link">Infantil</a></li>
				</ul>
				
				<ul class="nav navbar-nav flex-row justify-content-between ml-auto">
					<li class="nav-item order-1 order-md-1"><a href="#" class="nav-link" title="settings"><i class="fa fa-cog fa-fw fa-lg"></i></a></li>
					<li class="dropdown order-1">
						<button type="button" id="dropdownMenu1" data-toggle="dropdown" class="btn btn-outline-secondary dropdown-toggle">
							Entrar <span class="caret"></span>
						</button>
						<ul class="dropdown-menu dropdown-menu-right mt-1">
							<li class="p-3">
								<form action="AutenticaUsuario.do" method="post" class="form"
									role="form">
									<div class="form-group">
										<input id="UsuarioInput" placeholder="Usuario"
											class="form-control form-control-sm" type="text" required="required">
									</div>
									<div class="form-group">
										<input id="SenhaInput" placeholder="Senha"
											class="form-control form-control-sm" type="password" required="required">
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
				&nbsp; &nbsp; &nbsp;
				<button onclick="window.location.href='cadastro.jsp'" type="button"
					class="btn btn-outline-secondary">Cadastre-se</button>
			</div>
		</div>
	</nav>
	
	
	<%@ include file="include/footer.jsp"%>
</body>
</html>