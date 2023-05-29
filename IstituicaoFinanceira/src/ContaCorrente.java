public class ContaCorrente extends Conta{
    private double limiteChequeEspecial, valorTaxaAdimin;

    public ContaCorrente(){
        super();
        this.limiteChequeEspecial=0.0;
        this.valorTaxaAdimin=0.0;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
        setValorTaxaAdimin(this.limiteChequeEspecial/10);
    }

    public double getValorTaxaAdimin() {
        return valorTaxaAdimin;
    }

    public void setValorTaxaAdimin(double valorTaxaAdimin) {
        this.valorTaxaAdimin = valorTaxaAdimin;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limiteChequeEspecial=" + limiteChequeEspecial +
                ", valorTaxaAdimin=" + valorTaxaAdimin +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", dataAbertura=" + dataAbertura +
                ", dataUltimaMovimetacao=" + dataUltimaMovimetacao +
                ", ativo=" + ativo +
                '}';
    }
}
