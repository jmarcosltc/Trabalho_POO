package Implementacao;

public class JogoSingleplayer extends Jogo{
	
	public JogoSingleplayer(String titulo, String dataLancamento, double preco, String genero, int qtdeEstoque) {
		super(titulo, dataLancamento, preco, genero, qtdeEstoque);	
	}

	@Override
	public void visualizarJogo() {

		System.out.println("+-----------------------------------+");
		System.out.println("|                JOGO               |");
		System.out.println("+-----------------------------------+");
		System.out.print("|Nome: " + super.getTitulo());
		Organiza.espaco(super.getTitulo().length());
		
		System.out.print("|Genero: " + super.getGenero());
		Organiza.espaco(super.getGenero().length() + 2);
		
		System.out.println("|Modo: SINGLE PLAYER                |");

		System.out.print("|Ano de lan�amento: " + super.getDataLancamento());
		Organiza.espaco(super.getDataLancamento().length() + 13);
		
		System.out.printf("|Pre�o: R$%.2f", super.getPreco());
		Organiza.espaco(super.getPreco().toString().length() + 4);
		
		System.out.printf("|Avalia��o: %.2f", super.getAvaliacaoMedia());
		Organiza.espaco(super.getAvaliacaoMedia().toString().length() + 6);
		
		System.out.println("+-----------------------------------+");
		
	}
	
}
