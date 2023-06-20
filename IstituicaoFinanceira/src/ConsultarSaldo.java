public class ConsultarSaldo extends Transacao{
    public ConsultarSaldo(Conta conta, String canal){
        super(conta, canal);
    }

    public void consultaSaldo(){
        if(super.solicitarSenha()){
            if(conta.getAtivo()){
                System.out.println("Saldo atual da conta: " + conta.getSaldoAtual());   
            }else{
                System.out.println("Conta inativa");
            }
        }else{
            System.out.println("Senha incorreta!");
        }
    }
}
