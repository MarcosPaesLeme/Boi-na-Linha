package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Mercadoria;
import service.MercadoriaService;

/**
 * Servlet implementation class ListarMercadoria
 */
@WebServlet("/ListarMercadoria")
public class ListarMercadoria extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListarMercadoria() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String chave = request.getParameter("data[search]");
		String acao = request.getParameter("acao");
		boolean a = request.getParameter("tipo") != null;
		RequestDispatcher dispatcher = null;
		MercadoriaService service = new MercadoriaService();
		Mercadoria mer = new Mercadoria();
		mer.setTipo_negocio(a);
		ArrayList<Mercadoria> lista = null;
		HttpSession session = request.getSession();
		
		lista = service.listarMercadoria(mer);
		request.setAttribute("lista", lista);
		dispatcher = request.getRequestDispatcher("ListaConjuntos.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
