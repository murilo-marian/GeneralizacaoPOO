package PessoaAlunoProfessor;

public class Aluno extends Pessoa {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno{");
        sb.append("matricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }
}
