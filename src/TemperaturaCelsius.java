import java.util.Scanner;

public class TemperaturaCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double tempFah;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite a temperatura em Fahrenheit:");
	tempFah= scanner.nextDouble();
	scanner.close();
    System.out.printf("A temperatura em graus Celsius é: %2f",(tempFah -32) / 1.8);
	}

}
