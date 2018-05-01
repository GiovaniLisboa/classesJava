package br.com.sls.monitoria.modelo;

public class PessoaFisica {
	private String nome;
	private int cpf;
	private CartaoRefeicao cartaoRefeicao;
	
	public PessoaFisica (String nomeTemp, int cpfTemp, CartaoRefeicao cartaoTemp) {
		this.nome = nomeTemp;
		this.cpf = cpfTemp;
		this.cartaoRefeicao = cartaoTemp;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nomeTemp) {
		this.nome = nomeTemp;
	}
	
	public int getCpf () {
		return cpf;
	}
	
	public void setNumeracao (int cpfTemp) {
		this.cpf = cpfTemp;
	}
	
	public void getCartaoRefeicao () {
		this.cartaoRefeicao.getNumeracao();
		this.cartaoRefeicao.getNome();
		this.cartaoRefeicao.getSaldo();
	}
	
	//public void setCartaoRefeicao () {
	//	this.cartaoRefeicao.setNumeracao();
	//	this.cartaoRefeicao.setNome();
	//	this.cartaoRefeicao.setSaldo();
	//}
	
}
