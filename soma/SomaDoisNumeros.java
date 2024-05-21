import java.util.Scanner;
public class SomaDoisNumeros{
  static public void main(String... args){
    // Scanner leitor = new Scanner(System.in);
    //java 10: inferência de tipo
    var leitor = new Scanner(System.in);
    //declaração de variáveis
    //estaticamente tipo (feito pelo compilador)
    double primeiroNumero, segundoNumero;
    // double segundoNumero;
    double resultado;
    // entrada de dados
    System.out.println("Digite o primeiro valor");
    primeiroNumero = leitor.nextDouble();
    System.out.println("Digite o segundo valor");
    segundoNumero = leitor.nextDouble();
    //processamento
    resultado = primeiroNumero + segundoNumero;
    //saída
    //com printf: 2 + 3 = 5
    System.out.printf(
      "O resultado da soma eh: %f\n",
      resultado
    );
    System.out.printf(
      "%.2f + %.2f = %.2f\n",
      primeiroNumero,
      segundoNumero,
      resultado
    );

    System.out.println(
      primeiroNumero + " + " + segundoNumero + " = " + resultado
    );  

    // System.out.printf()


  }  
}