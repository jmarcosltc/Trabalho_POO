package Implementacao;

public class Item {
		private static int contador = 0;
		private int idItem;
		private Integer quantidade;
		private Jogo jogo;
		
		public Item(Jogo jogo, int quantidade) {
			contador++;
			this.idItem = contador;
			this.quantidade = quantidade;
			this.jogo = jogo;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public int getIdItem() {
			return idItem;
		}

		public Jogo getJogo() {
			return jogo;
		}

		public void visualizarItem() {
			System.out.println("+-----------------------------------+");
			System.out.println("|                ITEM               |");
			System.out.println("+-----------------------------------+");
			System.out.print("|Jogo: " + this.jogo.getTitulo());
			Organiza.espaco(this.jogo.getTitulo().length());
			
			System.out.print("|Quantidade: " + this.quantidade);
			Organiza.espaco(this.quantidade.toString().length() + 6);
			
			System.out.println("+-----------------------------------+");
		}
 
}
