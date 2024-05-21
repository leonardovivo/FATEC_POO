import java.util.Random;
public class TesteVetorDinamicoV2 {
  public static void main(String[] args) throws Exception{
    //construir um vetor dinamico
    var v = new VetorDinamico();
    var gerador = new Random();
    //fazer um loop infinito
    while(true){
      //adicionar um valor aleatório entre 1 e 10
      int meuNumero = 1 + gerador.nextInt(10);
      v.adicionar(meuNumero);
      System.out.println(v);
      System.out.println("************************");
      Thread.sleep(5000);
    }


  }
}
