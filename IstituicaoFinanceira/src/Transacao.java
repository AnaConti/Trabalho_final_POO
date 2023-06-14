import java.time.LocalDate;
import java.util.Date;

public abstract class Transacao {
    private Conta conta;
    private String canal;
    private LocalDate data;

    public Transacao(Conta conta,  String canal){
        this.data  = LocalDate.now();
        this.canal = canal;
        this.conta = conta;
    }

    public LocalDate getData() {
        return data;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "conta=" + conta.getNumeroConta() +
                ", canal='" + canal + '\'' +
                ", data=" + data +
                '}';
    }
}
