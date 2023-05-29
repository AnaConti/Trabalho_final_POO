import java.util.Date;

public class Salario extends Conta{
    private int limteTransferencia;
    private int limiteSaque;

    public Salario(){
        super();
        this.limiteSaque=0;
        this.limteTransferencia=0;

    }

    public void resetLimite(){
        Date data = new Date();
        if(data.getDate()==1){
            this.limiteSaque=5;
            this.limteTransferencia=2;
        }
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public int getLimteTransferencia() {
        return limteTransferencia;
    }
}
