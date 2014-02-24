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

import com.adhub.model.Produto;
import com.adhub.service.ProdutoService;
@Path("/produto")
@Stateless
public class ProdutoRESTService {
	
	@Inject
	ProdutoService produtoService;
   
   @Inject
   Logger log;
	
	   @GET
	    @Path("/busca/por/id/{id}")
		@Produces("application/json")	
	    public Produto buscaProdutosESuasPropagandas(@PathParam("id")  int id) {
	    	  log.info("buscando o produto com IdUsuario "+id); 
	    	
	    	  Produto prod = null;
	    	  
	    	  try {
	    		  produtoService.buscaProdutoCompletoPorMajorID(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
	    	  return prod;
	    	
		}
	   @GET
	    @Path("/busca/por/majorid/{idmajor}/minorid/{minorid}")
		@Produces("application/json")	
	    public Produto buscaProdutosESuasPropagandas(@PathParam("idmajor")  int idMajor, @PathParam("minorid")  int idMinor) {
	    	  log.info("buscando o produto com major ID"+ idMajor + "idMinor "+idMinor);
	    	
	    	  Produto prod = null;
	    	  
	    	  try {
	    		  produtoService.buscaProdutoCompletoPorMajorIDeMinorID(idMajor,idMinor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
	    	  return prod;
	    	
		}
	   
}
