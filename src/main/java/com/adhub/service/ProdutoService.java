package com.adhub.service;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.adhub.model.Produto;
import com.adhub.model.Propaganda;


public class ProdutoService {
	
	@Inject
	   private EntityManager em;

	@Inject
	  private Logger log;
	   
	public void registra(Produto produto) throws Exception {
		   em.persist(produto);
	   }
	   
	  
	   
	   public Produto buscaProdutoCompletoPorMajorID(Integer majorID) throws Exception{
		   log.info("Buscando produto completo com major ID "+majorID);
		  Produto produto  =  buscaProdutoPorMajor(majorID);		 
		  
		  produto.setPropagandas(buscaTodasPropandasPorMajor(majorID));

		  return produto;
	   }
	   
	   
	   public  Produto buscaProdutoPorMajor(Integer major) throws Exception {
		   log.info("Buscando produto com major id " +major);
		   return (Produto)em.createNamedQuery("Produto.buscaProdutoPorMajor").setParameter("majorID",major).getSingleResult();
	   }
	   
	   
	   
	  
	   public List<Propaganda> buscaTodasPropandasPorMajor(Integer major) throws Exception{
		   final List<Propaganda> propagandas =em.createNamedQuery("Propaganda.buscaPropagandasPorMajor").setParameter("majorID", major).getResultList();
		   return propagandas;
	   }
	   
}
