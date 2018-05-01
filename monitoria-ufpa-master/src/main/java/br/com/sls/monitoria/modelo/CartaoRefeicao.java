package br.com.sls.monitoria.modelo;

public class CartaoRefeicao {
	private int numeracao;
	private String nome;
	private String senha;
	private double saldo;
	
	public int getNumeracao () {
		return numeracao;
	}
	
	public void setNumeracao (int numTemp) {
		this.numeracao = numTemp;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nomeTemp) {
		this.nome = nomeTemp;
	}
	
	public String getSenha () {
		return senha;
	}
	
	public void setSenha (String senhaTemp) {
		this.senha = senhaTemp;
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	public void setSaldo (double saldoTemp) {
		this.saldo = saldoTemp;
	}
	
	public void realizarCompra(double valor) {
		if (autorizar(valor)) {
        	saldo -= valor;
        }	else {
        		System.out.println("Nao autorizado.");
        	}
	}
    
	private boolean autorizar (double valor) {
        if(saldo>=valor){
            return true;
        }	else {
        		return false;
        	}
    }
}
