package app;

import java.util.Locale;
import java.util.Scanner;

import util.Conversao;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Preço do dólar: ");
		double moedaDolar = sc.nextDouble();
		System.out.printf("Valor a ser convertido: ");
		double moedaReal = sc.nextDouble();
		
		System.out.println("Conversão do valor para real: "+String.format("%.2f", Conversao.conversao(moedaDolar, moedaReal)));

	}

}
