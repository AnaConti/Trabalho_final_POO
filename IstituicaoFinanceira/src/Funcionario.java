import java.time.LocalDate;
import java.util.Date;

public class Funcionario extends Pessoa{
    private String carteiraTrabalho, rg, sexo, cargo;
    private double salario;
    private LocalDate anoIngresso;
    private Agencia agencia;

    public Funcionario(){
        carteiraTrabalho = "";
        this.agencia     = null;
        this.rg               = "";
        this.sexo             = "";
        this.cargo            = "";
        this.salario          = 0.0;
        this.anoIngresso      = LocalDate.now();
    }

    public Funcionario(Agencia agencia, String cpf, String nome, String carteiraTrabalho, String rg, String sexo, String cargo, double salario, LocalDate anoIngresso){
        super(cpf, nome);

        this.agencia         = agencia;
        this.carteiraTrabalho = carteiraTrabalho;
        this.rg               = rg;
        this.sexo             = sexo;
        this.cargo            = cargo;
        this.salario          = salario;
        this.anoIngresso      = anoIngresso;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(LocalDate anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "\ncarteiraTrabalho='" + carteiraTrabalho + '\'' +
                ", \nrg='" + rg + '\'' +
                ", \nsexo='" + sexo + '\'' +
                ", \ncargo='" + cargo + '\'' +
                ", \nsalario=" + salario +
                ", \nanoIngresso=" + anoIngresso +
                ", \ncpf='" + cpf + '\'' +
                ", \nnome='" + nome + '\'' +
                ", \nestadoCivil='" + estadoCivil + '\'' +
                ", \nendereco='" + endereco + '\'' +
                ", \ndataNascimento='" + dataNascimento + '\'' +
                "\n}";
    }

    @Override
    public void bonusAniversario() {
        if(verificarAniversario()){
            this.salario*=1.001;
        }
    }

    public void calculaSalario(){
        int anosTrabalhados = LocalDate.now().getYear()-this.anoIngresso.getYear();

        if(anosTrabalhados>=15){
            double novoSalario = getSalario()*1.1;
            this.setSalario(novoSalario);
        }
    }


}
