import java.util.Date;

public class Conta {
    protected String numeroConta;
    protected double saldoAtual;
    protected Date dataAbertura, dataUltimaMovimetacao;
    protected boolean ativo;

    public Conta(String numeroConta, double saldoAtual){
        this.numeroConta=numeroConta;
        this.saldoAtual=saldoAtual;
        this.dataAbertura= new Date();
        this.dataUltimaMovimetacao= new Date();
        this.ativo=true;
    }
    
}
