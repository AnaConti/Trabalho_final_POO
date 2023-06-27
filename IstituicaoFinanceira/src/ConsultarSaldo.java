public class ConsultarSaldo extends Transacao{
    public ConsultarSaldo(Conta conta, String canal){
        super(conta, canal);
    }

    public void consultaSaldo(String senha) throws SenhaInvalida{
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
