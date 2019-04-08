package br.com.cursojava.aula011web.cliente;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ClienteBean {

	private FacadeCliente facade = new FacadeCliente();
	private List<Cliente> clientes = null;
	private Cliente cliente = facade.novoCliente();
	private String oid = "";

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
		if (oid != null) {
			if ("".equals(oid) || "novo".equals(oid)) {
				novoCliente();
			} else {
				carregarCliente(Integer.parseInt(oid));
			}
		}
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private void novoCliente() {
		cliente = facade.novoCliente();
	}

	private void carregarCliente(Integer id) {
		cliente = facade.buscarPorId(id);
	}
	
	public List<Cliente> getClientes() {
		if (clientes == null) {
			clientes = facade.carregarTodos();
		}
		return clientes;
	}
	
	public String salvar() {
		boolean ok = facade.salvar(cliente);
		FacesMessage msg;
		if (ok) {
			msg = new FacesMessage("Cliente " + cliente.getId() + " salvo com sucesso!");
		} else {
			msg = new FacesMessage("Não foi possível salvar o cliente " + cliente.getId() + "!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage(null, msg);
		return null;
	}

	public String remover() {
		boolean ok = facade.remover(cliente);
		FacesMessage msg;
		if (ok) {
			msg = new FacesMessage("Cliente " + cliente.getId() + " removido com sucesso!");
		} else {
			msg = new FacesMessage("Não foi possível remover o cliente " + cliente.getId() + "!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage(null, msg);
		return null;
	}
}