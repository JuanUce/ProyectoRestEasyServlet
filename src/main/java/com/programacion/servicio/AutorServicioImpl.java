package com.programacion.servicio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.programacion.db.Autor;

@ApplicationScoped
public class AutorServicioImpl  {

	@Inject
	private AutorServicio servicio;
	
	
	public ArrayList<Autor> listAutores()  {
		
		System.out.println("INGRESO METODO IMPL");
		return servicio.listAutores();
		 
	}

	
	public Autor buscarBAutores(int id) {
		return null;

	}


	public void insertar(Autor aut)  {
		

	}

	
	public void deleteAut(int id)  {


	}

	
	public void actualActor(Autor aut) {
		
	}

}
