import java.util.Scanner;

//Pratica 01
//número 02

public class Main {
  public static void main(String[] args) {

    Scanner num1 = new Scanner(System.in);
    System.out.println("Informe a temperatura em Celsius: ");
    double celsius = num1.nextInt();

    double fahrenheit = (celsius * 1.8) + 32;
    System.out.println("A temperetura informada em Fahrenheit é: " + fahrenheit);

  }
}