package desafio01;

public class descrypt {
	
	public String descryptografar(String cryptografia) {
		StringBuilder sb = new StringBuilder();
		
		int letrasQuant = cryptografia.length();
		
		for(int i=0 ;i < letrasQuant ;i++) {
			char char1 = cryptografia.charAt(i);
			i++;
			char char2 = cryptografia.charAt(i);
		
			String string1 = String.valueOf(char1);
			String string2 = String.valueOf(char2);
			
			sb.append(descryptografarCaracter(string1, string2));
		}
		
		return sb.toString();
	}
	
	public String descryptografarCaracter(String string1, String string2) {
		
		alfabeto alfabeto = new alfabeto();
		Integer value1 = alfabeto.getNumero(string1);
		Integer value2 = alfabeto.getNumero(string2);

		Integer value = value1 + value2;
		Integer v1 = value%26;
		
		numero numero = new numero();
		String letra = numero.getLetra(v1);
		
		return letra;
	}
}
