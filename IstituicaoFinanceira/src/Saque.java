public class Saque extends Transacao {
    private float valor;

    public Saque( Conta conta, float valor, String canal){
        super(conta, canal);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Saque{" +
                "valor=" + valor +
                '}';
    }
}