public class Poupanca extends Conta{
    private double rendimentoMes;
    private static double taxaRendimento=0.0809;

    public Poupanca(){
        super();
        this.rendimentoMes=0.0;
    }

    public double getRendimentoMes() {
        return rendimentoMes;
    }

    public void setRendimentoMes() {
        this.rendimentoMes = getSaldoAtual()*(taxaRendimento/12);
        setSaldoAtual(getSaldoAtual()+this.rendimentoMes);
    }

    @Override
    public String toString() {
        return "Poupanca{" +
                "rendimentoMes=" + rendimentoMes +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", dataAbertura=" + dataAbertura +
                ", dataUltimaMovimetacao=" + dataUltimaMovimetacao +
                ", ativo=" + ativo +
                '}';
    }
}
