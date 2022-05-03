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
//		System.out.println("|5 - Relat�rios                     |");
//		System.out.println("|6 - Sair da Conta                  |");
//		System.out.println("+-----------------------------------+");
//	}
//	
//	public void menuRelatorio() {
//		System.out.println("+-----------------------------------+");
//		System.out.println("|          GERAR RELAT�RIO          |");
//		System.out.println("+-----------------------------------+");
//		System.out.println("|1 - Dados do Cliente               |");
//		System.out.println("|2 - Jogos de Determinado Ano       |");             
//		System.out.println("|3 - Jogos Com Pre�o Abaixo de X    |");
//		System.out.println("|4 - Jogos de Um Determinado G�nero |");
//		System.out.println("|5 - Dados de Jogos � Venda         |");
//		System.out.println("+-----------------------------------+");
//	}
	
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
		lj1.adicionarJogo(j5);
		lj1.adicionarJogo(j6);					
		
		lj1.cadastrarCliente("Victor Adriel", "70070193665", "user", "user");
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
		
		p1.visualizarPedido();
		
		p1.removerItem(item2);
		
		p1.visualizarPedido();
		
		lj1.getClientes().get(0).finalizarPedido(p1);
		
		
		
//		lj1.getClientes().get(0).visualizarJogosAdquiridos();
		
//		
//		lj1.gerarRelCliente(0);
//		
//		lj1.gerarRelDataLancamento("2022");
//		
//		lj1.gerarRelPrecoAbaixo(1000.0);
//		
//		lj1.gerarRelGeneroJogo("esporte");
//		
//		lj1.gerarRelJogosAVenda();
		
		// Testar estoque de jogos (ver se o numero esta se alterando)
		// 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
//		lj1.cadastrarCliente("Jo�o Vinicius", "746.859.321-75");
		
//		lj1.getCatalogo().visualizarCatalogo();
//		Scanner entrada = new Scanner(System.in);
//		
//		lj1.gerarListaCliente();
//		System.out.print("Gerar relat�rio de cliente de ID: ");
//		int x = entrada.nextInt();
//		
//		lj1.gerarRelCliente(x - 1);
//		lj1.gerarRelCliente(1);	
		
		
//		lj1.getCatalogo().visualizarCatalogo();
		
	
	}

}
