public class Teste {
    public static void main(String[] args){
        ProfessorHorista ph = new ProfessorHorista();
        ph.setNome("Ana");
        ProfessorPesquisador pp = new ProfessorPesquisador();
        pp.setNome("João");
        ph.lecionar();
        pp.lecionar();
    }
}
