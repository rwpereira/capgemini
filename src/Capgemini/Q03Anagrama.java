package Capgemini;
import java.util.Arrays;
import java.util.Scanner;

public class Q03Anagrama {

	public static void main(String[] args) {
		System.out.print("Informe a string: ");
		Scanner ler = new Scanner(System.in);
		String texto = ler.next();
		int qtdAnagrama = 0;

		/*Composto por 3 laços onde:
		    - O 1º será para determinar a qtd de caracteres que será avaliado em cada rodada
		    - O 2º será para separar a primeira substring de N caracteres até o final (cuidando para nao estourar o tamanho)
		    - O 3º será para separar a segunda substring, sendo que vai começar da primeira substring para frente
		    - identificado as duas substring, é testado para ver se é anagrama, e caso positivo incrementa a variavel qtdAnagrama
		 */
		for (int caracteres = 1; caracteres < texto.length(); caracteres++) {     

			for (int x = 0; x <= (texto.length() - caracteres); x++) {

				String s1 = texto.substring(x, caracteres + x);       			       

				for (int z = x + 1; z <= (texto.length() - caracteres); z++) {

					String s2 = texto.substring(z, caracteres + z);

					if (ehAnagrama(s1, s2)) {
						qtdAnagrama++;
					}
				}

			}
		}
		System.out.println(qtdAnagrama);
	}

	
	// Identifica se é Anagrama, pegando as strings, colocando num array, depois ordenando o Array e voltando para
	// string, e por fim compara se as duas strings são iguais.
	public static boolean ehAnagrama(String texto1, String texto2) {
		if (texto1.length() != texto2.length()) {
			return false;
		}
		char[] c1 = texto1.toCharArray();
		char[] c2 = texto2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		String sc1 = new String(c1);
		String sc2 = new String(c2);
		return sc1.equals(sc2);
	}

}
