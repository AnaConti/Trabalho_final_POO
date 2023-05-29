import java.util.Date;

public class Funcionario extends Pessoa{
    private String carteiraTrabalho, rg, sexo, cargo;
    private double salario;
    private Date anoIngresso;

    public Funcionario(){
        super();
        this.carteiraTrabalho="";
        this.rg="";
        this.sexo="";
        this.cargo="";
        this.salario=0.0;
        this.anoIngresso= new Date();
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

    public Date getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(Date anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "carteiraTrabalho='" + carteiraTrabalho + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", anoIngresso=" + anoIngresso +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
