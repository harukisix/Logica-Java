package br.com.logica.inicio;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		
		double preço, taxa, valor, total;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Preço do Produto: ");
		preço = entrada.nextDouble();
				
		System.out.println("Digite a Taxa de Desconto sem o simbolo de %: ");
		taxa = entrada.nextDouble();
        
	    valor = preço * (taxa / 100);
		
		total = preço - valor;
		
		System.out.println("O Valor de Desconto é: "+valor);
        System.out.println("O Valor final é: "+total);
        
	}

}
