package Implementacao;

public class JogoMultiplayer extends Jogo{
	
	private Integer numMaxDeJogadores;

	public JogoMultiplayer(String titulo, String dataLancamento, double preco, String genero, int qtdeEstoque, int numMaxDeJogadores) {
		super(titulo, dataLancamento, preco, genero, qtdeEstoque);
		this.numMaxDeJogadores = numMaxDeJogadores;
	}

	public int getNumMaxDeJogadores() {
		return numMaxDeJogadores;
	}

	//ok
	@Override
	public void visualizarJogo() {

		System.out.println("+-----------------------------------+");
		System.out.print("|Nome: " + super.getTitulo());
		Organiza.espaco(super.getTitulo().length());
		
		System.out.print("|Genero: " + super.getGenero());
		Organiza.espaco(super.getGenero().length() + 2);
		
		System.out.print("|Ano de lan�amento: " + super.getDataLancamento());
		Organiza.espaco(super.getDataLancamento().length() + 13);
		
		System.out.println("|Modo: MULTIPLAYER                  |");
		System.out.print("|N�mero m�ximo de jogadores: " + this.numMaxDeJogadores);
		Organiza.espaco(this.numMaxDeJogadores.toString().length() + 22);
		
		System.out.printf("|Pre�o: R$%.2f", super.getPreco());
		Organiza.espaco(super.getPreco().toString().length() + 4);
		
		System.out.printf("|Avalia��o: %.2f", super.getAvaliacaoMedia());
		Organiza.espaco(super.getAvaliacaoMedia().toString().length() + 6);
		
		System.out.println("+-----------------------------------+");
		
	}
	
}
