public class TesteCalculadora {
  public static void main(String[] args) {
    //byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes)
    System.out.println("A coisa começa aqui");
    Calculadora calc = new Calculadora();
    int soma = calc.somar(7, 8);
    soma = soma + calc.somar(2, 2);
    soma = soma + calc.somar(-15, 17);
    System.out.println(soma);
    System.out.println("Até mais");  
  }
}
