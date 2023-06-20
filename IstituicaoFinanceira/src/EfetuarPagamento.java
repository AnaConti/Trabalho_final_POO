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

    public void efetuarPagamento(double valor){
        if(solicitarSenha()){
            if(valor>0 && valor>super.conta.getSaldoAtual()){
                double saldo=super.conta.getSaldoAtual();
                saldo-=valor;
            
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
        return  super.toString() + "EfetuarPagamento{" +
                "valor=" + valor +
                '}';
    }
}
