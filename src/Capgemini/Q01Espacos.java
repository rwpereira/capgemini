package Capgemini;
import java.util.Scanner;


public class Q01Espacos {

	public static void main(String[] args) {

		System.out.print("Quantidade de vezes: ");		
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();

		/*
		   Composto por dois la�os onde:
		    - O 1� vai percorrer a quantidade de desejada para formar as linhas
		    - O 2� vai percorrer a quantidade para formar a string onde a cada la�o � 
		       incluido um * e diminuido um espa�o em branco
		 */
		
		for (int i = 1; i <= n; i++) {
			for (int x = n; x >= 1; x--) {
				if (x > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if(i < n) {
				System.out.println("");
			}
		}
	}
}
