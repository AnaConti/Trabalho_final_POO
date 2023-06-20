public class Deposito extends Transacao{
    private float valor;

    public Deposito(Conta conta, float valor, String canal){
        super(conta, canal);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void deposito(double valor){
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
            System.out.println("Senha incorreta");
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
