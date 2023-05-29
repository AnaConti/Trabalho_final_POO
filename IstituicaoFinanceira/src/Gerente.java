import java.util.Date;

public class Gerente extends Funcionario{
    private Date dataInicioGerencia;
    private Agencia agencia;
    private boolean curso;

    public Gerente(){
        super();
        this.dataInicioGerencia= new Date();
        this.agencia= new Agencia();
        this.curso=true;
    }

    public Date getDataInicioGerencia() {
        return dataInicioGerencia;
    }

    public void setDataInicioGerencia(Date dataInicioGerencia) {
        this.dataInicioGerencia = dataInicioGerencia;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setCurso(boolean curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "dataInicioGerencia=" + dataInicioGerencia +
                ", agencia=" + agencia +
                ", curso=" + curso +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
