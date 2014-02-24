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
	   
	   public Produto buscaProdutoCompletoPorMajorIDeMinorID(Integer majorID,Integer minorID) throws Exception{
		   log.info("Buscando produto completo com major ID "+majorID);
		  Produto produto  =  buscaProdutoPorMajorMinor(majorID,minorID);		 
		  
		  produto.setPropagandas(buscaTodasPropandasPorMajor(majorID));

		  return produto;
	   }
	   
	   
	   
	   public  Produto buscaProdutoPorMajor(Integer major) throws Exception {
		   log.info("Buscando produto com major id " +major);
		   return (Produto)em.createNamedQuery("Produto.buscaProdutoPorMajor").setParameter("majorID",major).getSingleResult();
	   }
	   
	   public  Produto buscaProdutoPorMajorMinor(Integer major,Integer minor) throws Exception {
		   log.info("Buscando produto com major id " +major);
		   return (Produto)em.createNamedQuery("Produto.buscaProdutoPorMajorEMinor").setParameter("majorID",major).setParameter("minorID", minor).getSingleResult();
	   }
	   
	   
	   
	  
	   public List<Propaganda> buscaTodasPropandasPorMajor(Integer major) throws Exception{
		   final List<Propaganda> propagandas =em.createNamedQuery("Propaganda.buscaPropagandasPorMajor").setParameter("majorID", major).getResultList();
		   return propagandas;
	   }
	   
	   
	   public List<Propaganda> buscaTodasPropandasPorMajorEMinor(Integer major,Integer minorID) throws Exception{
		   final List<Propaganda> propagandas =em.createNamedQuery("Propaganda.buscaPropagandasPorMajorEMinor").setParameter("minorID", minorID).setParameter("majorID", major).getResultList();
		   return propagandas;
	   }
}
