import java.util.Scanner;

//Pratica 01
//número 01

public class Main {
  public static void main(String[] args) {

    Scanner num1 = new Scanner(System.in);
    System.out.println("Informe a diagonal menor: ");
    double menor = num1.nextInt();

    System.out.println("Informe a diagonal maior: ");
    double maior = num1.nextInt();

    double area = (menor * maior) / 2;
    System.out.println("A área do losango é: " + area);

  }
}