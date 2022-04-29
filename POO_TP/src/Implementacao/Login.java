package Implementacao;

public class Login {
	
	public int logar(String login, String senha) {
		if(login.equals("admin") && senha.equals("admin")) {
			return 1;
		}
		else if(login.equals("user") && senha.equals("user")) {
			return 2;
		}
		else {
			return -1;
		}
	}
}
