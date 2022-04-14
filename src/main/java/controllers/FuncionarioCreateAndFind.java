package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FuncionarioDao;
import model.Funcionario;

@WebServlet("/CreateAndFind")
public class FuncionarioCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FuncionarioCreateAndFind() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome(request.getParameter("nome"));
		funcionario.setCpf(request.getParameter("cpf"));
		funcionario.setItem(request.getParameter("item"));
	
		FuncionarioDao.create(funcionario);
		//doGet(request, response);
	}

}
