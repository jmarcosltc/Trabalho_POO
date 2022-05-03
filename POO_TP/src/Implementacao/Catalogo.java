package Implementacao;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	private List<Jogo> jogos = new ArrayList<>();
	private Integer aux;

	public List<Jogo> getJogos() {
		return jogos;
	}
	
	// ok
	public void visualizarCatalogo() {
		
		aux = this.jogos.size();
		
		System.out.println("+-----------------------------------+");
		System.out.println("|             CATALOGO              | ");
		System.out.println("+-----------------------------------+");
		System.out.print("|Jogos disponíveis: #" + this.jogos.size());
		Organiza.espaco(this.aux.toString().length() + 14);
		System.out.println("+-----------------------------------+");
		for (Jogo jg : jogos) {
			System.out.println("+-----------------------------------+");
			System.out.print("|Jogo: " + jg.getTitulo());
			Organiza.espaco(jg.getTitulo().length());
			
			System.out.print("|Genero: " + jg.getGenero());
			Organiza.espaco(jg.getGenero().length() + 2);
			
			System.out.print("|Ano de lançamento: " + jg.getDataLancamento());
			Organiza.espaco(jg.getDataLancamento().length() + 13);
			
			System.out.printf("|Avaliação: %.1f", jg.getAvaliacaoMedia());
			if(jg.getAvaliacaoMedia() >= 10) {
				Organiza.espaco(9);
			} else {
				Organiza.espaco(8);
			}
			
			System.out.printf("|Preço: R$%.2f", jg.getPreco());
			Organiza.espaco(jg.getPreco().toString().length() + 4);
			
			System.out.println("+-----------------------------------+");
		}

	}

}

