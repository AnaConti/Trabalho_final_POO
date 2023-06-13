import java.time.LocalDate;

public class Salario extends Conta{
    private int limiteTransferencia;
    private int limiteSaque;

    public Salario(){
        super();
        this.limiteSaque=0;
        this.limiteTransferencia=0;

    }

    public void resetLimite(){
        LocalDate data = LocalDate.now();
        if(data.getDayOfMonth()==1){
            this.limiteSaque=5;
            this.limiteTransferencia=2;
        }
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public int getLimiteTransferencia() {
        return limiteTransferencia;
    }
}
