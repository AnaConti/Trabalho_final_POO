public class Deposito extends Transacao{
    private double valor;

    public Deposito(Conta conta, double valor, String canal){
        super(conta, canal);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void deposito(double valor) throws SenhaInvalida{
        if(solicitarSenha()){
            if(valor>0){
                double saldo=super.conta.getSaldoAtual();
                saldo+=valor;
            
                super.conta.setSaldoAtual(saldo);
                super.conta.updateUltimaMovimentacao();
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            throw new SenhaInvalida();
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+
                "Deposito{" +
                "valor=" + valor +
                '}';
    }
}
