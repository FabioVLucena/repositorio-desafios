package desafio01;

public class execute {

	public static void main(String [] args) {
		descrypt desc = new descrypt();
		String usuario = new String("hEzAdCfHzAhAiJzAeIaDjBcBhHgAzAfHfN");
		
		String login = desc.descryptografar(usuario);
		
		System.out.println(login);
	}
}
