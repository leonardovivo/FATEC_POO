public class TesteLivroDeNotasV2 {
  public static void main(String[] args) {
    //inferência de tipo (Java 10+)
   var meuLivro = new LivroDeNotas("POO");
  //  meuLivro.nomeDisciplina = "POO";4
  //meuLivro.nomeDisciplina = "P";
  // meuLivro.setNomeDisciplina("POO");
   System.out.println(meuLivro.getNomeDisciplina());
  }
}
