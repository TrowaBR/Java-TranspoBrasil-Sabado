package br.com.cursojava.aula010web.produto;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ProdutoBean {

	private FacadeProduto facade = new FacadeProduto();
	private List<Produto> produtos = null;
	private Produto produto = facade.novoProduto();
	private String oid = "";
	
	public void setOid(String oid) {
		this.oid = oid;
		if (oid != null) {
			if ("".equals(oid.trim()) || "novo".equals(oid)) {
				novo();
			} else {
				carregarProduto(Integer.parseInt(oid));
			}
		}
	}
	
	public String getOid() {
		return oid;
	}
	
	private void novo() {
		this.produto = facade.novoProduto();
	}

	private void carregarProduto(Integer id) {
		this.produto = facade.buscarProdutoPorId(id);
		if (this.produto == null) {
			System.out.println("Preciso avisar o usuário!!!");
		}
	}

	public List<Produto> getProdutos() {
		if (produtos == null || produtos.isEmpty()) {
			produtos = facade.carregarProdutos();
		}
		return this.produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String salvar() {
		boolean ok = facade.salvar(produto);
		FacesMessage msg;
		if (ok) {
			msg = new FacesMessage("Produto " + produto.getId() + " salvo com sucesso!");
		} else {
			msg = new FacesMessage("Não foi possível salvar o produto!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage(null, msg);

		return null;
	}
	
	public String remover() {
		boolean ok = facade.remover(produto);
		FacesMessage msg;
		if (ok) {
			msg = new FacesMessage("Produto " + produto.getId() + " removido com sucesso!");
		} else {
			msg = new FacesMessage("Não foi possível remover o produto!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage(null, msg);

		return null;
	}
}