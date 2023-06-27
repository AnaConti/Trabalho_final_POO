public class Deposito extends Transacao implements RealizaTransacao{
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

    @Override
    public String toString() {
        return super.toString()+
                "Deposito{" +
                "valor=" + valor +
                '}';
    }

    @Override
    public void realizarTransacao(String senha) throws SaldoInsuficiente, SenhaInvalida, LimiteTransacao {
        if(this.valor> Conta.getLimiteTransacao()){
            throw new LimiteTransacao("Tentativa de deposito maior que o limite estabelecido na conta.");
        }
        if(solicitarSenha(senha)){
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
}
