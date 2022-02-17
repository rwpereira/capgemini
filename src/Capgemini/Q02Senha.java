package Capgemini;
import java.util.Scanner;

public class Q02Senha {

	public static void main(String[] args) {
		System.out.print("Informe a senha: ");
		Scanner ler = new Scanner(System.in);
		String senha = ler.next();

		int numeroMinimo = 6;
		int qtdCaracterFaltante = numeroMinimo - senha.length();   
		int qtdValidacaoFaltante;
		int faltaNumero = 1;
		int faltaMinusculo = 1;
		int faltaMaiusculo = 1;
		int faltaCaracterEspecial = 1;
		
		
        //Laço para identificar se foi preenchido os 4 requisitos da senha (Digito, Minusculo, Maiuscula, carac. Especial) 
		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				faltaNumero = 0;
			} else if (c >= 'a' && c <= 'z') {
				faltaMinusculo = 0;
			} else if (c >= 'A' && c <= 'Z') {
				faltaMaiusculo = 0;
			} else if ("!@#$%^&*()-+".indexOf(c) >= 0) {
				faltaCaracterEspecial = 0;
			}
		}
		qtdValidacaoFaltante = faltaNumero + faltaMinusculo + faltaMaiusculo + faltaCaracterEspecial;
		

		//Verificação se não tem a qtd minima ou os requisitos minimos, e o que foi maior, será apresentado
		
		if (qtdCaracterFaltante > 0 || qtdValidacaoFaltante > 0) {
			if (qtdCaracterFaltante > qtdValidacaoFaltante) {
				System.out.println(qtdCaracterFaltante);
			} else {
				System.out.println(qtdValidacaoFaltante);
			}
		} else {
			System.out.println("0");
		}

	}

}
