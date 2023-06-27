import java.time.LocalDate;
import java.util.Date;

public class Gerente extends Funcionario{
    private LocalDate dataInicioGerencia;
    private Agencia agencia;
    private boolean curso;
    private static double comissao;

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

    public static double getComissao() {
        return Gerente.comissao;
    }

    public void setComissao(double comissao) {
        Gerente.comissao = comissao;
    }

    //metodo para ajustar salario do gerente
    public void calculaSalario(){
        double novoSalario= super.getSalario()+this.comissao;
        super.setSalario(novoSalario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "\ndataInicioGerencia=" + dataInicioGerencia +
                ", \ncurso=" + curso +
                ", \ncpf='" + cpf + '\'' +
                ", \nnome='" + nome + '\'' +
                ", \nestadoCivil='" + estadoCivil + '\'' +
                ", \nendereco='" + endereco + '\'' +
                ", \ndataNascimento='" + dataNascimento + '\'' +
                "\n}";
    }


}
