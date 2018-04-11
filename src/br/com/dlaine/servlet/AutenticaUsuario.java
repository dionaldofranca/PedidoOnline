package br.com.dlaine.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import br.com.dlaine.dao.UsuarioDao;
import br.com.dlaine.model.Usuario;


@WebServlet(name = "/AutenticaUsuario.do", urlPatterns = { "/AutenticaUsuario.do" })
public class AutenticaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuarioAutenticado = usuarioDao.autenticaUsuario(usuario);
		// true, caso não exista, será criada uma sessão
		if (usuarioAutenticado != null) {
			HttpSession sessao = request.getSession(true);
			sessao.setAttribute("usuarioAutenticado", usuarioAutenticado);

			// 5 minutos para expirar a sessão (em segundos)
			sessao.setMaxInactiveInterval(60 * 5);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Login ou senha invalida!");
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
		}
	}
}