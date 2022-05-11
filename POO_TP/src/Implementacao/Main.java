package Implementacao;

//import java.util.Scanner;

public class Main {

//	public void menuUser() {
//		System.out.println("+-----------------------------------+");
//		System.out.println("|               MENU                |");
//		System.out.println("+-----------------------------------+");
//		System.out.println("|1 - Visualizar catalogo            |");
//		System.out.println("|2 - Comprar jogos                  |");             
//		System.out.println("|3 - Meus pedidos                   |");
//		System.out.println("|4 -                                |");
//		System.out.println("|5 - Sair da Conta                  |");
//		System.out.println("+-----------------------------------+");
//	}
//	
//	public void menuAdmin() {
//		System.out.println("+-----------------------------------+");
//		System.out.println("|               MENU                |");
//		System.out.println("+-----------------------------------+");
//		System.out.println("|1 - Cadastrar Cliente              |");
//		System.out.println("|2 - Visualizar catalogo            |");
//		System.out.println("|3 - Adicionar jogo                 |");             
//		System.out.println("|4 - Remover Jogo                   |");
//		System.out.println("|5 - Relatórios                     |");
//		System.out.println("|6 - Sair da Conta                  |");
//		System.out.println("+-----------------------------------+");
//	}
//	
//	public void menuRelatorio() {
//		System.out.println("+-----------------------------------+");
//		System.out.println("|          GERAR RELATÓRIO          |");
//		System.out.println("+-----------------------------------+");
//		System.out.println("|1 - Dados do Cliente               |");
//		System.out.println("|2 - Jogos de Determinado Ano       |");             
//		System.out.println("|3 - Jogos Com Preço Abaixo de X    |");
//		System.out.println("|4 - Jogos de Um Determinado Gênero |");
//		System.out.println("|5 - Dados de Jogos à Venda         |");
//		System.out.println("+-----------------------------------+");
//	}
	
	public static void main(String[] args) {
		
		Loja lj1 = new Loja();	
		
		Jogo j1 = new JogoSingleplayer("Grand Theft Auto","2002",150 ,"Estrategia", 10); 
		Jogo j11 = new JogoSingleplayer("Grand Theft Auto","2002",150 ,"Estrategia", 10);
		Jogo j2 = new JogoMultiplayer("NFS","2022",50 ,"Corrida", 5, 1);
		Jogo j3 = new JogoMultiplayer("GOW","2010", 250 ,"RPG", 7, 5);
		Jogo j4 = new JogoSingleplayer("CSGO","2022", 80 ,"FPS", 11);
		Jogo j5 = new JogoMultiplayer("FIFA 22","2022", 300 ,"Esporte", 1, 12);
		Jogo j6 = new JogoSingleplayer("PES 21","2021", 200 ,"Esporte", 6);
		
		lj1.adicionarJogo(j1);
		lj1.adicionarJogo(j11);
		lj1.adicionarJogo(j2);
		lj1.adicionarJogo(j3);
		lj1.adicionarJogo(j4);
		lj1.adicionarJogo(j5);
		lj1.adicionarJogo(j6);	
		
		lj1.getCatalogo().visualizarCatalogo();
		
		System.out.println("\n **************************** \n\n");
		
		lj1.cadastrarCliente("Victor Adriel", "70070193665", "vabp", "k90");
//		lj1.cadastrarCliente("Gustavo Souza", "65214852365", "gust", "gus200");
//		lj1.cadastrarCliente("Ben Dez", "95874584587", "bd10", "ben10");
		
//		lj1.gerarListaCliente();
		
		Item item1 = new Item(j1);
		Item item2 = new Item(j5);
		Item item3 = new Item(j6);
		
		Pedido p1 = new Pedido();
		
		p1.adicionarItem(item1);
		p1.adicionarItem(item2);
		p1.adicionarItem(item3);
		lj1.getClientes().get(0).finalizarPedido(p1);
		
		String testee = lj1.getClientes().get(0).getLogin().getUsuario();
		System.out.println(testee);
		
	    lj1.getClientes().get(0).avaliarJogo(j1, 5);
	    lj1.getClientes().get(0).avaliarJogo(j5, 8.8);
	
		lj1.getCatalogo().visualizarCatalogo();
		
		p1.visualizarPedido();
		System.out.println("\n **************************** \n\n");
		
		p1.removerItem(item2);
		
		p1.visualizarPedido();
		System.out.println("\n **************************** \n\n");
		System.out.println(lj1.getCatalogo().getJogos().get(0).getQtdeEstoque());
		System.out.println("\n **************************** \n\n");
		
		System.out.println(lj1.getCatalogo().getJogos().get(0).getQtdeEstoque());
		System.out.println("\n **************************** \n\n");
		
		lj1.getClientes().get(0).visualizarJogosAdquiridos();
		System.out.println("\n **************************** \n\n");
		
		lj1.gerarRelCliente(0);
		System.out.println("\n **************************** \n\n");
		
		lj1.gerarRelDataLancamento("2022");
		System.out.println("\n **************************** \n\n");
		
		lj1.gerarRelPrecoAbaixo(1000.0);
		System.out.println("\n **************************** \n\n");
		
		lj1.gerarRelGeneroJogo("esporte");
		System.out.println("\n **************************** \n\n");
		
		lj1.gerarRelJogosAVenda();
		
		lj1.visualizarLoja();
		
		// Testar estoque de jogos (ver se o numero esta se alterando)
		// 
		

	}

}
