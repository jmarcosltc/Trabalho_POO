package Implementacao;

public class Login {
	private String usuario;
	private String senha;
	
	public Login() {
		this("user", "user");
	}
	
	public Login(String usuario, String senha) {
		this.senha = senha;
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}
	
	public int logar(String usuario, String senha) {
		if(usuario.equals("admin") && senha.equals("admin")) {
			return 1;
		}
		else if (usuario.equals("user") && senha.equals("user")) {
			return 2;
		}
		else {
			return -1;
		}	
	}
}
