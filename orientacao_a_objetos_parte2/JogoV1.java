public class JogoV1 {
  public static void main(String[] args) {
    //garbage collector
    //Java 10+: operador de inferência de tipo
    var p = new Personagem();
    p.nome = "Rodolfo";
    p.cacar();
    System.out.printf("%s\n", p.toString());
    System.out.println("**********************");
    p.comer();
    System.out.println(p);
    System.out.println("**********************");
    p.dormir();
    System.out.println(p);
    System.out.println("**********************");
    p.comer();
    System.out.println(p);
    System.out.println("**********************");
    p.dormir();
    System.out.println(p);
    System.out.println("**********************");
    p.cacar();
    System.out.println(p);
    System.out.println("**********************");

  }
}
