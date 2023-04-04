import java.util.Scanner;

public class ValorProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double produto;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o valor do produto:");
	produto= scanner.nextDouble();
	produto+= produto / 10;
    scanner.close();
    
    System.out.printf("O valor do produto acrescido de 10 por cento é: %2f", produto);
	}
}
