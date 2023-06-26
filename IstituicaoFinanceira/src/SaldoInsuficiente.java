public class SaldoInsuficiente extends Exception{
    public SaldoInsuficiente(){
        super("Saldo insuficiente para a operação.");
    }

    public SaldoInsuficiente(double saldo){
        super("Saldo insuficiente para a operação ("+ saldo + ").");
    }
}
