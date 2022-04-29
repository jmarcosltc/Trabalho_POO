package Implementacao;

import java.util.Scanner;

public class Main {

	public void menuUser() {
		System.out.println("+-----------------------------------+");
		System.out.println("|               MENU                |");
		System.out.println("+-----------------------------------+");
		System.out.println("|1 - Visualizar catalogo            |");
		System.out.println("|2 - Comprar jogos                  |");             
		System.out.println("|3 - Meus pedidos                   |");
		System.out.println("|4 -                                |");
		System.out.println("|5 - Sair da Conta                  |");
		System.out.println("+-----------------------------------+");
	}
	
	public void menuAdmin() {
		System.out.println("+-----------------------------------+");
		System.out.println("|               MENU                |");
		System.out.println("+-----------------------------------+");
		System.out.println("|1 - Cadastrar Cliente              |");
		System.out.println("|2 - Visualizar catalogo            |");
		System.out.println("|3 - Adicionar jogo                 |");             
		System.out.println("|4 - Remover Jogo                   |");
		System.out.println("|5 - Relatórios                     |");
		System.out.println("|6 - Sair da Conta                  |");
		System.out.println("+-----------------------------------+");
	}
	
	// criar menu de relatorios
	public void menuRelatorio() {
		System.out.println("+-----------------------------------+");
		System.out.println("|          GERAR RELATÓRIO          |");
		System.out.println("+-----------------------------------+");
		System.out.println("|1 - Dados do Cliente               |");
		System.out.println("|2 - Jogos de Determinado Ano       |");             
		System.out.println("|3 - Jogos Com Preço Abaixo de X    |");
		System.out.println("|4 - Jogos de Um Determinado Gênero |");
		System.out.println("|5 - Dados de Jogos à Venda         |");
		System.out.println("+-----------------------------------+");
	}
	
	public static void main(String[] args) {
		
		Loja lj1 = new Loja();	
		
		Jogo j1 = new JogoSingleplayer("Grand Theft Auto","2002",150 ,"Estrategia", 10);
		Jogo j2 = new JogoMultiplayer("NFS","2022",50 ,"Corrida", 5, 1);
		Jogo j3 = new JogoMultiplayer("GOW","2010", 250 ,"RPG", 7, 5);
		Jogo j4 = new JogoSingleplayer("CSGO","2022", 80 ,"FPS", 11);
		Jogo j5 = new JogoMultiplayer("FIFA 22","2022", 300 ,"Esporte", 1, 12);
		Jogo j6 = new JogoSingleplayer("PES 21","2021", 200 ,"Esporte", 6);
		
		lj1.adicionarJogo(j1);
		lj1.adicionarJogo(j2);
		lj1.adicionarJogo(j3);
		lj1.adicionarJogo(j4);
		lj1.removerJogo(j1);
		lj1.removerJogo(j3);
		lj1.removerJogo(j2);
		lj1.adicionarJogo(j5);
		lj1.adicionarJogo(j6);
		
		lj1.getCatalogo().visualizarCatalogo();
		
		lj1.cadastrarCliente("Victor Adriel", "70070193665");
		
		lj1.gerarListaCliente();
		
		// Testar estoque de jogos (ver se o numero esta se alterando)
		//
		
		lj1.getClientes();
		
		lj1.gerarRelCliente(0);
		
		
		
		
		
		
		
		
		
		
		
//		Item it1 = new Item(j1, 2);
//		Item it2 = new Item(j3, 15);
//		Item it3 = new Item(j6, 1);
//		Item it4 = new Item(j4, 1);
//		
//		Pedido p1 = new Pedido();
//		p1.adicionarItem(it1);
//		p1.adicionarItem(it2);
//		p1.adicionarItem(it3);
//		p1.adicionarItem(it4);
//		
//		p1.visualizarPedido();
//		
//		lj1.adicionarJogo(j1);
//		lj1.adicionarJogo(j2);
//		lj1.adicionarJogo(j3);
//		lj1.adicionarJogo(j4);
//		lj1.adicionarJogo(j5);
//		lj1.adicionarJogo(j6);
//		
//		lj1.cadastrarCliente("Victor Adriel", "700.701.936-65");
//		lj1.cadastrarCliente("Gustavo Souza", "845.701.471-78");
//		lj1.cadastrarCliente("Valeria Silva", "458.236.452-14");
//		lj1.cadastrarCliente("João Vinicius", "746.859.321-75");
		
//		lj1.getCatalogo().visualizarCatalogo();
//		Scanner entrada = new Scanner(System.in);
//		
//		lj1.gerarListaCliente();
//		System.out.print("Gerar relatório de cliente de ID: ");
//		int x = entrada.nextInt();
//		
//		lj1.gerarRelCliente(x - 1);
//		lj1.gerarRelCliente(1);	
		
		
//		lj1.getCatalogo().visualizarCatalogo();
		
	
	}

}
