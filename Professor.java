public class Professor extends Funcionario {

    private String disciplina;

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Professor(String nome, int idade, String endereco, double salario, String disciplina) {
        super(nome, idade, endereco, salario);
        this.disciplina = disciplina;
        // limpa o pc isaque </3
    }
}