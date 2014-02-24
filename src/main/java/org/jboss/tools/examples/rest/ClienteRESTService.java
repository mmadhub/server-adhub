package org.jboss.tools.examples.rest;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.adhub.model.Cliente;
import com.adhub.service.ClienteService;






/**
 * JAX-RS Example
 * 
 * This class produces a RESTful service to read the contents of the Agendamentos table.
 */
@Path("/cliente")
@Stateless
public class ClienteRESTService {
  
	@Inject
	ClienteService clienteService;
   
   @Inject
   Logger log;
   

 
    @GET
    @Path("/busca/por/id/{id}")
	@Produces("application/json")	
    public Cliente buscaCliente(@PathParam("id")  int id) {
    	  log.info("buscando o agendamento com IdUsuario "+id); 
    	
    	  Cliente cliente = null;
    	  
    	  try {
			clienteService.buscaClientePorMajor(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    	  return cliente;
    	
	}
//
    @POST
    @Path("/update")
    @Consumes("application/json")
    public void  update(Cliente clienteModificado ) {
    	 log.info("Update Cliente" + clienteModificado.getNome() + " idUsuario " + clienteModificado.getMajorID());
    	 try{
    		 clienteService.updateCliente(clienteModificado);
    	 }catch (Exception e) {
    		 e.printStackTrace();
    	
		}
    	
	}
    
  
    
	@POST
	@Path("/cadastra")
    @Consumes("application/json")
	public void cadastraCliente(Cliente cliente) {
		log.info("Cadastrando cliente " + cliente.getNome() + " idCliente " + cliente.getMajorID());
		try {
			clienteService.registra(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
	
	 
    
}
