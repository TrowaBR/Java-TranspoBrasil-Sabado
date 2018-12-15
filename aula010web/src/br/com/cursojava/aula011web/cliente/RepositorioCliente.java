package br.com.cursojava.aula011web.cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula010web.utils.JPAUtil;

public class RepositorioCliente {

	public List<Cliente> buscarTodos() {
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c order by id", Cliente.class);
		List<Cliente> lista = query.getResultList();
		em.close();
		return lista;
	}
	
	public Cliente buscarPorId(Integer id) {
		EntityManager em = JPAUtil.createEntityManager();
		Cliente c = em.find(Cliente.class, id);
		em.close();
		return c;
	}
	
	public Cliente salvar(Cliente cliente) {
		if (cliente != null) {
			if (cliente.getId() == null) {
				cliente = inserir(cliente);
			} else {
				cliente = atualizar(cliente);
			}
		}
		return cliente;
	}

	private Cliente inserir(Cliente cliente) {
		EntityManager em = JPAUtil.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			cliente = null;
		}
		em.close();
		return cliente;
	}

	private Cliente atualizar(Cliente cliente) {
		EntityManager em = JPAUtil.createEntityManager();
		try {
			em.getTransaction().begin();
			cliente = em.merge(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			cliente = null;
		}
		em.close();
		return cliente;
	}
	
	public Cliente remover(Cliente cliente) {
		EntityManager em = JPAUtil.createEntityManager();
		try {
			em.getTransaction().begin();
			cliente = em.merge(cliente);
			em.remove(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			cliente = null;
		}
		em.close();
		return cliente;
	}
}