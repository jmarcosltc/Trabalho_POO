package Implementacao;

public class Login {
	
	public int logar(String usuario, String senha) {
		if(usuario.equals("admin") && senha.equals("admin")) {
			return 1;
		}
		else if (usuario.equals("user") && senha.equals("user")){
			return 2;
		}
		else {
			return -1;
		}
		
	}
}
