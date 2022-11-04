package PessoaAlunoProfessor;

public class Pessoa {
    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno{");
        sb.append("codigo=").append(codigo);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", endereco='").append(endereco).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
