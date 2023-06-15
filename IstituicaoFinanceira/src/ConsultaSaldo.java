public class ConsultaSaldo extends Transacao{
    public ConsultaSaldo(Conta conta, String canal){
        super(conta, canal);
    }


    //mudar isso aqui
    public void consultaSaldo(){
        System.out.println("Saldo atual da conta: " +  conta.getSaldoAtual());
    }
}
