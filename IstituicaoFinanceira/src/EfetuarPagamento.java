public class EfetuarPagamento extends Transacao implements RealizaTransacao{
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
        return  super.toString() + "EfetuarPagamento{" +
                "valor=" + valor +
                '}';
    }

    @Override
    public void realizarTransacao(String senha) throws SaldoInsuficiente, SenhaInvalida, LimiteTransacao {
        if(valor>this.conta.getLimiteTransacao())
            throw new LimiteTransacao("Tentativa de saque maior que o limite estabelecido na conta.");

        if(solicitarSenha(senha)){
            if(valor>0 && valor<super.conta.getSaldoAtual()){
                double saldo=super.conta.getSaldoAtual();
                saldo-=valor;

                super.conta.setSaldoAtual(saldo);
                super.conta.updateUltimaMovimentacao();
            }else{
                throw new SaldoInsuficiente(this.conta.getSaldoAtual());
            }
        }else{
            throw new SenhaInvalida();
        }
    }
}
