package Pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaFisica{");
        sb.append("cpf='").append(cpf).append('\'');
        sb.append(", estadoCivil='").append(estadoCivil).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
