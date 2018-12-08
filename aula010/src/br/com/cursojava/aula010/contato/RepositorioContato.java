package br.com.cursojava.aula010.contato;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula010.utils.JPAUtil;

public class RepositorioContato {
	
	public List<Contato> buscarTodos() {
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("select c from Contato c", Contato.class);
		List<Contato> lista = query.getResultList();
		em.close();
		return lista;
	}
	
	public Contato buscarPorId(Integer id) {
		EntityManager em = JPAUtil.createEntityManager();
		Contato c = em.find(Contato.class, id);
		em.close();
		return c;
	}

	public Contato buscarPorTelefone(String telefone) {
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("select c from Contato c where c.telefone = :telefone", Contato.class);
		query.setParameter("telefone", telefone);
		
		Contato c;
		try {
			c = query.getSingleResult();
		} catch (Exception e) {
			c = null;
		}
		em.close();
		return c;
	}

	public List<Contato> buscarPorNome(String nome) {
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("select c from Contato c where upper(c.nome) like upper(:nome)", Contato.class);
		query.setParameter("nome", "%" + nome + "%");
		
		List<Contato> lista = query.getResultList();
		em.close();

		return lista;
	}
	
	public Contato salvar(Contato contato) {
		if (contato != null) {
			if (contato.getId() == null) {
				return inserir(contato);
			} else {
				return atualizar(contato);
			}
		}
		return contato;
	}

	private Contato atualizar(Contato contato) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		contato = em.merge(contato);
		em.getTransaction().commit();
		em.close();
		return contato;
	}

	private Contato inserir(Contato contato) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		em.close();
		return contato;
	}
	
	public void remover(Contato contato) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(contato));
		em.getTransaction().commit();
		em.close();
	}
}