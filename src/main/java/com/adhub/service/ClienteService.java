package com.adhub.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import com.adhub.model.Cliente;


@Stateless
public class ClienteService {

	@Inject
	   private EntityManager em;
	
	   public void registra(Cliente cliente) throws Exception {
		   em.persist(cliente);
	   }
	   
	   public Cliente buscaClientePorMajor(Integer major) throws Exception{
		   return em.find(Cliente.class, major);
	}
	   
	   public Cliente updateCliente(Cliente clienteUpdate) throws Exception{
		   return em.merge(clienteUpdate);
	}
	   
	   
	   
}
