package com.distribuida.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.programacion.db.Autor;
import com.programacion.servicio.AutorServicio;
import com.programacion.servicio.AutorServicioImpl;

@WebServlet(urlPatterns = "/autores")
public class AutorServlet extends HttpServlet {

	private static final long serialVersionUID= 1L;
	
	@Inject
	private AutorServicioImpl servicio;; 

	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("/servlet autor");
	//	ArrayList<Autor> autor;
		//try {
			//autor = servicio.listAutores();
			//req.setAttribute("autores", autor);
		//	req.getRequestDispatcher("/Autor.jsp").forward(req, resp);
		//} catch (Exception e) {
			
			//e.getMessage();
	//	}
		String action = req.getServletPath();

		switch (action) {
		case "/new":
			showNewForm(req, resp);
			break;

		case "/insert":
			try {
				insertAutor(req, resp);
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case "/delete":
			try {
				deleteAutor(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/edit":
			try {
				ByAutor(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/update":
			try {
				updateAutor(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:

			try {
				System.out.println("INGRESA LISTAR AUTOR");
				listAutor(req, resp);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
    
		
		
	}


	public void listAutor(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		 List<Autor> autor = servicio.listAutores();
		 System.out.println("INGRESO METODO LISTAROO");
		 System.out.println(autor.toString());
	        request.setAttribute("autor", autor);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("AutorList.jsp");
	        dispatcher.forward(request, response);
		

	}
	
	
	public void deleteAutor(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		
		
		int id = Integer.parseInt(request.getParameter("id"));	 
		servicio.deleteAut(id);
        response.sendRedirect("list");

	}
	
	public void updateAutor(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
        int edad = Integer.parseInt(request.getParameter("edad"));
        String genero = request.getParameter("genero");
        String nombre = request.getParameter("nombre");
 
        Autor aut = new Autor();
        aut.setId(id);
        aut.setEdad(edad);
        aut.setGenero(genero);
        aut.setNombre(nombre);
        
        servicio.actualActor(aut);
        response.sendRedirect("list");

	}
	
	public void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("FormAutor.jsp");
        dispatcher.forward(request, response);

	}
	
	public void insertAutor(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		int edad = Integer.parseInt(request.getParameter("edad"));
		String genero = request.getParameter("genero");
		String nombre = request.getParameter("nombre");

		Autor aut = new Autor();
		aut.setId(id);
		aut.setEdad(edad);
		aut.setGenero(genero);
		aut.setNombre(nombre);
		servicio.insertar(aut);
		response.sendRedirect("list");
	}
	
	public void ByAutor(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		Autor autor=servicio.buscarBAutores(id);
		RequestDispatcher ds = request.getRequestDispatcher("FormAutor.jsp");
		request.setAttribute("autor", autor);
		ds.forward(request, response);
	}
	
	
	

}
