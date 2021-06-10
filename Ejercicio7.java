import java.util.*;

public class Ejercicio7 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int numero;
		int pares = 0;
		int impares = 0;
		int ceros = 0;
		System.out.println("Se generaron 36 numeros aleatorios, de los cuales: ");
		for (int i = 0; i < 36; i++){
			numero = (int)(Math.random()*99)+1;

			if (numero == 0){
				ceros+=1;
			} 
			else if(numero%2==0){
				pares+=1;
			} 
			else {
				impares+=1;
			}
		}
		System.out.println("\t" +((ceros * 100)/36) +"% fueron ceros");
		System.out.println("\t" +((pares * 100)/36) +"% fueron pares");
		System.out.println("\t" +((impares * 100)/36) +"% fueron impares");
	}
}