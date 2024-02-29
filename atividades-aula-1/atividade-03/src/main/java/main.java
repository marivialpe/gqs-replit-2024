import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    System.out.println("Informe o valor do salario minimo: ");
    double minimo = console.nextDouble();

    System.out.println("Informe o valor do salario do funcionario: ");
    double salario = console.nextDouble();

    double total = salario / minimo;
    System.out.println("O funcionario recebe: " + total + "salarios minimos ");

  }

}