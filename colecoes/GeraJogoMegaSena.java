import java.util.Random;

public class GeraJogoMegaSena {
  public static void main(String[] args) {
    //exiba um jogo da mega sena, gerado com VetorDinamico
    //claro, monte usando o método de adição sem repetição
    //classe interna anônima
    var v = new VetorDinamico(){
      public String toString() {
        var sb = new StringBuilder("Eis o seu jogo: ");
        for (int i = 0; i < tamanho(); i++){
          sb.append(getElementos()[i]).append(" ");
        }
        // int [] teste = getElementos();
        return sb.toString();
      }
    };
    var gerador = new Random();
    while (v.tamanho() < 6){
      v.adicionarSemRepeticao(1 + gerador.nextInt(60));
    }
    System.out.println(v);
  }
}
