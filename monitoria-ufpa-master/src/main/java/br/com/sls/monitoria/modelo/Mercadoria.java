package br.com.sls.monitoria.modelo;

public class Mercadoria {
	private double preco;
	private String descricao;
	
	public Mercadoria (double precoTemp, String descricaoTemp) {
		this.preco = precoTemp;
		this.descricao = descricaoTemp;
	}
	
	public double getPreco () {
		return preco;
	}
	
	public void setPreco (double precoTemp) {
		this.preco = precoTemp;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public void setDescricao (String descricaoTemp) {
		this.descricao = descricaoTemp;
	}
}
