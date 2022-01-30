package desafio02;

import java.util.Scanner;

public class Execute {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("String para traduzir: ");
		String string = s.nextLine();

		System.out.println("(d)Decrypt ou (e)Encrypt? ");
		String tipo = s.next();

		System.out.println("Parametro para Decrypt/Encrypt: ");
		String paramStr = s.next();
		int param = Integer.valueOf(paramStr);

		tipo = tipo.toLowerCase();
		String frase = "";
		CifraAlvesh cifra = new CifraAlvesh();
		if(tipo.equals("d")) {
			frase = cifra.decrypt(string, param);
		} else if(tipo.equals("e")) {
			frase = cifra.encrypt(string, param);
		} else {
			frase = "Digite um parametro valido";
		}

		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(frase);
		System.out.println("------------------------------------------------------------------------------------------");
	}
}
