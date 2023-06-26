import java.util.ArrayList;

public class Extrato extends Transacao {
    private double valor;

    public Extrato( Conta conta, double valor, String canal){
        super(conta, canal);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void extrato(double valor) throws SenhaInvalida{
        if(solicitarSenha()){
            ArrayList<Transacao> tr= this.conta.getTransacoes();

            for(int i = 0; i<tr.size(); i++){
                tr.get(i).toString();
            }
        }else{
            throw new SenhaInvalida();
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "Saque{" +
                "valor=" + valor +
                '}';
    }
}
