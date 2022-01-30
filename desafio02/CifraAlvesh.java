package desafio02;

public class CifraAlvesh {
	
	public String encrypt(String string, int param) {
		string = formatarString(string);
		StringBuilder sb = new StringBuilder(string);
		StringBuilder sbr = new StringBuilder();
		StringRandoms sr = new StringRandoms();

		int i = 0;
		int length = string.length() * param;
		
		while (i < length) {
			int s = 1;
			sbr = new StringBuilder();
			while(s < param) {
				String letras = new String(sr.random().toString());
				sbr.append(letras);
				s++;
			}
			sb.insert(i, sbr);
			i = i + param;
		} ;
		
		return sb.toString();
	}
	
	public String decrypt(String string, int param) {
		string = formatarString(string);
		int i = param - 1;
		int length = string.length();
		StringBuilder sb = new StringBuilder();
		
		while (i < length) {
			char letraChar = string.charAt(i);
			String letraStr = String.valueOf(letraChar);
			
			sb.append(letraStr);
			i = i + param;
		} ;
		
		return sb.toString();
	}
	
	public String formatarString(String string) {
		String formatada = string.toLowerCase();
		formatada = string.replaceAll(" ", "");
		return formatada;
	}
}
