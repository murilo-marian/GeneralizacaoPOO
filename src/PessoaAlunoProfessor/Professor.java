package PessoaAlunoProfessor;

public class Professor extends Pessoa {
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Professor{");
        sb.append("disciplina='").append(disciplina).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
