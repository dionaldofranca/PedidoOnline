package br.com.dlaine.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dlaine.dao.UsuarioDao;
import br.com.dlaine.model.Usuario;

@WebServlet(name = "CadastrarUsuario.do", urlPatterns = { "/CadastrarUsuario.do" })
public class CadastrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nome = request.getParameter("nome");
		String cpfcnpj = request.getParameter("cpfcnpj");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String celular = request.getParameter("celular");
		int tipousuario = Integer.parseInt(request.getParameter("tipousuario"));
		String email = request.getParameter("email");

		Usuario usuario = new Usuario (login, senha, nome, cpfcnpj, endereco, telefone, celular, tipousuario, email);

		UsuarioDao usuarioDao = new UsuarioDao();

		usuarioDao.insert(usuario);
		
		
	}

}
