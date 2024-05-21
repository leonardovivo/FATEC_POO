import javax.swing.JOptionPane;
public class TesteLivroDeNotas {
  public static void main(String[] args) {
    //java 10, inferência de tipo, feito pelo compilador
    //byte, short, int, long, float, double, boolean, char
    //var livroDeNotas = new LivroDeNotas();
    //var livroDeNotas2 = new LivroDeNotas();
    String nomeDaDisciplina = JOptionPane.showInputDialog("Prof, qual o nome da disciplina 1?");
    //livroDeNotas.nomeDaDisciplina = nomeDaDisciplina;
    nomeDaDisciplina = JOptionPane.showInputDialog("Prof, qual o nome da disciplina 2?");
    //livroDeNotas2.nomeDaDisciplina = nomeDaDisciplina;
    //livroDeNotas.exibirMensagem();
    //livroDeNotas2.exibirMensagem();
  }
}
