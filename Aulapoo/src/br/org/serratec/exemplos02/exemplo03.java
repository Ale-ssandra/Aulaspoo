package br.org.serratec.exemplos02;

import java.time.LocalDate;

public class exemplo03 {

	public static void main(String[] args) {
		int preco = 100;
		preco = 300;
		// alt+shift+ aletrar nome de variaveis
		// metododos
		// crtl+shift+f - identacao
		LocalDate data = LocalDate.now();
		System.out.println("Hoje é dia:" + data);
		System.out.println(preco);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		// ctrl+ shift=o - importacao de pacotes
	}

}
