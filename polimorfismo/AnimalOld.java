public class AnimalOld {
    private String nome;

    private int tipo;

    public void falar() {
        // Esse codigo viola o principio aberto/fechado
        if (getTipo() == 1) {
            System.out.println("Miau");
        } else if (getTipo() == 2) {
            System.out.println("Auau");
        } else if (getTipo() == 3) {
            System.out.println("Quack");
        }
    }

    public int getTipo() {
        return tipo;

    }

    public void setTipo(int tipo) {
        this.tipo = tipo;

    }
}