import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaProdutos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<String> listaProdutos = new ArrayList<String>();
		
		System.out.print("Digite seu item: ");
		
		listaProdutos.add(entrada.nextLine());
		
		Arrays.toString(listaProdutos.toArray());
		
		System.out.println(Arrays.toString(listaProdutos.toArray()));
		
	}

}
