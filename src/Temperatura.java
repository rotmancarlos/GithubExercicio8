import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double Celsius, Fahrenheit;

        System.out.print("Conversor de temperatura: Graus Celsius -> Farehrenheit\n\n");

        System.out.print("Digite a temperatura em Celsius: ");
        Celsius = entrada.nextDouble();

        Fahrenheit = (9 * Celsius + 160 ) / 5;

       System.out.print("\n A medida convertida é " + Fahrenheit + "°F");

    }



}



