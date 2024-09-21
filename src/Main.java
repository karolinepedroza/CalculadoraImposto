
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("CALCULADORA DE TAXAS DA HOLANDA");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        double salario = scanner.nextDouble();
        double imposto = 0;


        if (salario > 0 && salario <= 34.712) {
            imposto = salario * 0.970;
        } else if (salario >= 34713 && salario <= 68507) {
            imposto = salario * 0.3735;
        } else if (salario >= 68.508) {
            imposto = salario * 0.4950;
        } else {
            System.out.println("Salário inválido.");
        }

        System.out.printf("Imposto a pagar: %.2f%n", +imposto);

        scanner.close();


    }
}
