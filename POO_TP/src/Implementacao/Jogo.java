package Implementacao;

public class Jogo {
	private static int contador = 0;
	private int idJogo;
	private String genero;
	private String dataLancamento;
	private String titulo;
	private Double preco;
	private Double avaliacaoMedia;
	private double somaAvaliacao;
	private int qtdeDeAvaliacoes;
	private int qtdeEstoque;
	// teste
	
	
	
	public Jogo(String titulo, String dataLancamento, double preco
			, String genero, int qtdeEstoque) {
		contador++;
		this.idJogo = contador;
		this.genero = genero;
		this.dataLancamento = dataLancamento;
		this.preco = preco;
		this.titulo = titulo;
		this.avaliacaoMedia = 0.0;
		this.somaAvaliacao = 0;
		this.qtdeDeAvaliacoes = 0;
		this.qtdeEstoque = qtdeEstoque;
	}

	public int getIdJogo() {
		return idJogo;
	}

	public String getGenero() {
		return genero;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public Double getPreco() {
		return preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getAvaliacaoMedia() {
		return avaliacaoMedia;
	}

	public int getQtdeDeAvaliacoes() {
		return qtdeDeAvaliacoes;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public void setAvaliacaoMedia(double nota) {
		this.qtdeDeAvaliacoes++;
		this.somaAvaliacao += nota;
		this.avaliacaoMedia = this.somaAvaliacao / this.qtdeDeAvaliacoes;
	}
	
	public void visualizarJogo() {
		System.out.println("+-----------------------------------+");
		System.out.println("|                JOGO               |");
		System.out.println("+-----------------------------------+");
		System.out.print("|Nome: " + this.titulo);
		Organiza.espaco(this.titulo.length());
		
		System.out.print("|Genero: " + this.genero);
		Organiza.espaco(this.genero.length() + 2);
		
		System.out.print("|Ano de lan�amento: " + this.dataLancamento);
		Organiza.espaco(this.dataLancamento.length() + 13);
		
		System.out.printf("|Avalia��o: %.1f", this.avaliacaoMedia);
		if(this.avaliacaoMedia >= 10) {
			Organiza.espaco(9);
		} else {
			Organiza.espaco(8);
		}
		
		System.out.printf("|Pre�o: R$%.2f", this.preco);
		Organiza.espaco(this.preco.toString().length() + 4);
		
		System.out.println("+-----------------------------------+");
		
	}
}
