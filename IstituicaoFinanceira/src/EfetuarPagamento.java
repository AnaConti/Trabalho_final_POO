public class EfetuarPagamento extends Transacao{
    public double valor;

    public EfetuarPagamento( Conta conta, double valor, String canal){
        super(conta, canal);
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "EfetuarPagamento{" +
                "valor=" + valor +
                '}';
    }
}
