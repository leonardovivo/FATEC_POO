public class TestePolimorfismo {
    public static void main(String[] args){
        // Gato g = new Gato();
        // g.falar();

        // Cachorro c = new Cachorro();
        // c.falar();

        // Pato p = new Pato();
        // p.falar();

        // Variaveis polimorficas:

        Animal a1 = new Gato();
        Animal a2 = new Cachorro();
        Animal a3 = new Pato();

        a1.falar();
        a2.falar();
        a3.falar();
    }
}
