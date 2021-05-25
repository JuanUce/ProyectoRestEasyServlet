package com.programacion.servicio;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.programacion.db.Autor;

@Consumes(value= MediaType.APPLICATION_JSON)
@Produces(value=MediaType.APPLICATION_JSON)
public interface AutorServicio {

	@GET
	@Consumes(value= MediaType.APPLICATION_JSON)
	public ArrayList<Autor> listAutores()  ;
	
	@GET
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Autor buscarBAutores(int id);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void insertar(Autor aut);
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteAut(@PathParam("id") int id);
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public void actualActor(Autor aut);
	
	
	
}
