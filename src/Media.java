import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double n1, n2;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o primeiro número:");
	n1= scanner.nextDouble();
	System.out.println("Digite o segundo número:");
	n2= scanner.nextDouble();
    scanner.close();
    
    System.out.printf("A média dos dois numero é: %2f",(n1+n2) / 2);
	}
}
