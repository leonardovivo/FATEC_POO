import javax.swing.JOptionPane;
public class SomaDoisNumerosV2{
  public static void main(String x []){
    //float (Float), double (Double)
    //byte (Byte), short (Short), int (Integer), long (Long)
    //boolean (Boolean)
    //classes empacotadoras
    //auto empacotamento
    //auto desempacotamento
    // int a = 1;
    // // Integer b = 2;
    // Integer b = new Integer(2);
    // int c = b;
    // Integer a = 2;

    Integer v1 = Integer.parseInt(
      JOptionPane.showInputDialog("Digite o valor 1")
    );

    Integer v2 = Integer.parseInt(
      JOptionPane.showInputDialog("Digite o valor 2")
    );

    int resultado = v1 + v2;

    JOptionPane.showMessageDialog(null, resultado);

    //exibir assim: 2 + 3 = 5, usando o método format da classe String
    JOptionPane.showMessageDialog(
      null, 
      String.format("%d + %d = %d", v1, v2, resultado )
    );    


  }
}