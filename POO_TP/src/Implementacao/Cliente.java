package Implementacao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private static int contador = 0;
	private Integer idCliente;
	private String nome;
	private String cpf;
	private List<Pedido> pedidos = new ArrayList<>();
	private List<Jogo> jogosAdquiridos = new ArrayList<>();

	public Cliente(String nome, String cpf) {
		contador++;
		this.idCliente = contador;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public List<Jogo> getJogosAdquiridos() {
		return jogosAdquiridos;
	}

	public void setJogosAdquiridos(Jogo jogoAdquirido) {
		this.jogosAdquiridos.add(jogoAdquirido);
	}
	
	public int avaliarJogo(Jogo jogo, double nota) {
		
		boolean entrou = false;
		
		for(Jogo jg: jogosAdquiridos) {
			if(jg.getTitulo().equalsIgnoreCase(jogo.getTitulo())) {
				entrou = true;
			}
		}
		
		if(entrou && nota >= 0 && nota <= 10) {
			jogo.setAvaliacaoMedia(nota);
			return 1;
		} else {
			return -1;
		}
	}
	
	public void finalizarPedido(Pedido pedido) {
		System.out.println("Pagamento efetuado com sucesso!");
		for (Item item : pedido.getItens()) {
			Jogo jg = item.getJogo();
			setJogosAdquiridos(jg);
			jg.setQtdeEstoque(jg.getQtdeEstoque() - item.getQuantidade());
		}
		this.pedidos.add(pedido);
		pedido.setStatus("PAGO");
	}
	
	public void visualizarCliente() {
		System.out.println("+-----------------------------------+");
		System.out.println("|               CLIENTE             |");
		System.out.println("+-----------------------------------+");
		System.out.print("|Id do cliente: " + this.idCliente);
		Organiza.espaco(this.idCliente.toString().length() + 9);

		System.out.print("|Nome do cliente: " + this.nome);
		Organiza.espaco(this.nome.length() + 11);

		System.out.print("|CPF do cliente: " + this.cpf);
		Organiza.espaco(this.cpf.length() + 10);

		visualizarJogosAdquiridos();
	}
	
	public void visualizarJogosAdquiridos() {
		System.out.println("+-----------------------------------+");
		System.out.println("|          JOGOS ADQUIRIDOS         |");
		System.out.println("+-----------------------------------+");

		if (jogosAdquiridos.size() == 0) {
			System.out.println("|       nenhum jogo adquirido!      |");
			System.out.println("+-----------------------------------+");
		} else {
			for (Jogo jg : jogosAdquiridos) {
				System.out.printf("|Jogo: %s", jg.getTitulo());
				Organiza.espaco(jg.getTitulo().length());

				System.out.printf("|Gênero: %s", jg.getGenero());
				Organiza.espaco(jg.getGenero().length() + 2);

				System.out.printf("|Lançamento: %s", jg.getDataLancamento());
				Organiza.espaco(jg.getDataLancamento().length() + 6);

				System.out.printf("+-----------------------------------+\n");
			}
		}
	}
}
