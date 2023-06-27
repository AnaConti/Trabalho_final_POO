import java.time.LocalDate;
import java.util.Date;

public class Gerente extends Funcionario{
    private LocalDate dataInicioGerencia;
    private Agencia agencia;
    private boolean curso;
    private double comissao;

    public Gerente(){
        super();

        this.dataInicioGerencia = LocalDate.now();;
        this.curso              = true;
    }

    public Gerente(String cpf, String nome, String carteiraTrabalho, String rg, String sexo, String cargo, double salario, LocalDate anoIngresso, boolean curso, LocalDate dataInicioGerencia){
        super(null, cpf, nome, carteiraTrabalho, rg, sexo, cargo, salario, anoIngresso);

        this.dataInicioGerencia = dataInicioGerencia;
        this.curso              = curso;
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

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    //metodo para ajustar salario do gerente
    public void calculaSalario(){
        double novoSalario= super.getSalario()+this.comissao;
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
