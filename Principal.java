public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leo", 17, "De baixo da terra", "5º Semestre", "Info");
        Professor professor = new Professor("Isaque", 39, "Palmital", 12000, "PW2");
        FuncAdm funcAdm = new FuncAdm("Leila", 42, "Palmital", 1333, "biblioteca", "Bibliotecaria");

        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Idade do aluno: " + aluno1.getIdade());
        System.out.println("Endereço do aluno: " + aluno1.getEndereco());
        System.out.println("Semestre do aluno: " + aluno1.getSemestre());
        System.out.println("Curso do aluno: " + aluno1.getCurso() + "\n");
    
        
        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Idade do professor: " + professor.getIdade());
        System.out.println("Endereço do professor: " + professor.getEndereco());
        System.out.println("Salário do professor: " + professor.getSalario());
        System.out.println("Endereço do professor: " + professor.getEndereco());
        System.out.println("Diciplina do professor: " + professor.getDisciplina() + "\n" );

        System.out.println("Nome do funcionário: " + funcAdm.getNome());
        System.out.println("Idade do funcionário: " + funcAdm.getIdade());
        System.out.println("Endereço do funcionário: " + funcAdm.getEndereco());
        System.out.println("Salário do funcionário: " + funcAdm.getSalario());
        System.out.println("Setor do funcionário: " + funcAdm.getSetor());
        System.out.println("Cargo do funcionário: " + funcAdm.getCargo());

        
    }
}
