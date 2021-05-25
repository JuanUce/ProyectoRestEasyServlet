package com.programacion.productorRest;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.programacion.servicio.AutorServicio;

@ApplicationScoped
public class ClienteProducerProxy {
	public static final String path = "http://localhost:7001/autor";

//	@Produces
	// @ApplicationScoped
///	public AutorServicio getproxy() { 
	// System.out.println("INGRESO METODO PROXY 1");
	// ResteasyClient client = (ResteasyClient)ClientBuilder.newClient();
	// System.out.println("INGRESO METODO PROXY 2");
	// ResteasyWebTarget target = client.target(path);
	// System.out.println("INGRESO METODO PROXY 3");
	// AutorServicio proxy = target.proxy(AutorServicio.class);

	// return proxy;

	// }

	
	@ApplicationScoped
	@Produces
	public AutorServicio getProxy() {
		System.out.println("INGRESO METODO PROXY 1");
	ResteasyClient cliente = (ResteasyClient) ClientBuilder.newClient();
	System.out.println("INGRESO METODO PROXY 2");
	ResteasyWebTarget target = cliente.target(path);
	System.out.println("INGRESO METODO PROXY 3");
	return target.proxy(AutorServicio.class);
	}
	//@Produces
//	@ApplicationScoped
	//public AutorServicio getProxy() {
		//System.out.println("INGRESO METODO PROXY 1");
		//ResteasyClient client = new ResteasyClientBuilder().build();
		//System.out.println("INGRESO METODO PROXY 2");
		//ResteasyWebTarget target = client.target(UriBuilder.fromPath(path));
		//System.out.println("INGRESO METODO PROXY 3");
		//AutorServicio proxy = target.proxy(AutorServicio.class);
		//return proxy;
//	}

}
