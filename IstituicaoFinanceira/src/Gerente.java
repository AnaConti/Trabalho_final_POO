import java.time.LocalDate;
import java.util.Date;

public class Gerente extends Funcionario{
    private LocalDate dataInicioGerencia;
    private Agencia agencia;
    private boolean curso;

    public Gerente(){
        super();
        this.dataInicioGerencia= LocalDate.now();
        this.agencia= new Agencia();
        this.curso=true;
    }

    public LocalDate getDataInicioGerencia() {
        return dataInicioGerencia;
    }

    public void setDataInicioGerencia(LocalDate dataInicioGerencia) {
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

    //metodo para ajustar salario do gerente 
    public void calculaSalario(double comissao){
        double novoSalario= super.getSalario()+comissao;
        super.setSalario(novoSalario);
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
