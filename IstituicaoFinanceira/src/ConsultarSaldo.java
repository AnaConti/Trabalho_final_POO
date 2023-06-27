public class ConsultarSaldo extends Transacao implements RealizaTransacao{
    public ConsultarSaldo(Conta conta, String canal){
        super(conta, canal);
    }

    @Override
    public void realizarTransacao(String senha) throws SaldoInsuficiente, SenhaInvalida, LimiteTransacao {
        if(super.solicitarSenha(senha)){
            if(conta.getAtivo()){
                System.out.println("Saldo atual da conta: " + conta.getSaldoAtual());
            }else{
                System.out.println("Conta inativa");
            }
        }else{
            throw new SenhaInvalida();
        }
    }
}
