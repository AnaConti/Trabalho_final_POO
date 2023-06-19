import java.util.Date;

public abstract class Conta {
    protected String numeroConta;
    protected double saldoAtual;
    protected Date dataAbertura, dataUltimaMovimetacao;
    protected boolean ativo;
    private String senha;


    public Conta(){
        this.numeroConta=numeroConta;
        this.saldoAtual=0.0;
        this.dataAbertura= new Date();
        this.dataUltimaMovimetacao= new Date();
        this.ativo=true;

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public Date getDataUltimaMovimetacao() {
        return dataUltimaMovimetacao;
    }

    public void updateUltimaMovimentacao(){
        this.dataUltimaMovimetacao=new Date();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo=ativo;
    }
    
    public boolean senhaCorreta(String senhaDigitada){
        if(this.senha.equals(senhaDigitada))
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", dataAbertura=" + dataAbertura +
                ", dataUltimaMovimetacao=" + dataUltimaMovimetacao +
                ", ativo=" + ativo +
                '}';
    }

    // public void realizarTransacao(float valor){
    //     Transacao tr = new Transacao(this, valor);
    // }
}
