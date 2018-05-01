package br.com.sls.monitoria.principal;

import br.com.sls.monitoria.modelo.CartaoRefeicao;
import br.com.sls.monitoria.modelo.Mercadoria;
import java.util.Scanner;

public class TestaCriacaoDeObjetos {
	
	public static void main(String [] args){
		//01 Criar no pacote modelo uma classe chamada CartaoRefeicao
		//02 Criar no pacote modelo uma classe chamada PessoaFisica que vai utilizar o cartao
		//03 Criar no pacote modelo uma classe chamada Mercadoria
		
		//Obs 01 A classe CartaoRefeicao Deve ter como atributos privados numeracao, nome, senha, saldo
		//Obs 02 A classe CartaoRefeicao Deve ter como metodos publicos os metodos para acessar os seus atributos
		
		//Obs 03 A classe PessoaFisica Deve ter como atributos privados nome, cpf, cartaoRefeicao
		//Obs 04 A classe PessoaFisica Deve ter como metodos publicos os metodos para acessar os seus atributos
		
		//Obs 05 A classe Mercadoria deve ter como atributos privados preco e descricao
		//Obs 06 A classe Mercadoria Deve ter como metodos publicos os metodos para acessar os seus atributos
		
		/*
		 * Tarefa 01 - Implementar um programa que possa realizar a compra de TRÊS mercadorias atraves do cartao 
		 * refeicao	de uma pessoa física. O processo de compra deve solicitar o numero do cartao, a senha 
		 * do cartao, o valor da mercadoria e verificar se a pessoa possui saldo suficiente para realizar 
		 * a compra, caso nao possua saldo o programa deve exibir uma mensagem informando saldo insuficiente.
		 * 
		 * No final do processo deve aparecer uma mensagem informando o nome e cpf da pessoa assim como o 
		 * saldo atual do cartao. */
		
		/** Comece aqui sua classe Principal*/
		Scanner scanner = new Scanner (System.in);
		int cartaoTemp;
		String senhaTemp;
		double valorTemp;
		
		Mercadoria arroz = new Mercadoria (5, "1kg de arroz");
		Mercadoria trigo = new Mercadoria (3, "1kg de trigo");
		Mercadoria manteiga = new Mercadoria (6, "500g de manteiga");
		
		CartaoRefeicao cartao1 = new CartaoRefeicao();
		cartao1.setNome("Giovani");
		cartao1.setNumeracao(12345);
		cartao1.setSaldo(420.15);
		cartao1.setSenha("9999");
		
		
		
		System.out.println("\nInsira o numero do cartao: ");
		cartaoTemp = scanner.nextInt();
		System.out.println("\nInsira a senha do cartao: ");
		senhaTemp = scanner.nextLine();
		System.out.println("\nInsira o valor da mercadoria: ");
		valorTemp = scanner.nextDouble();
		
		
	}

}
