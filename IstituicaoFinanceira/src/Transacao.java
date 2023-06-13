import java.time.LocalDate;
import java.util.Date;

public class Transacao {
    private Conta conta;
    private String canal;
    private LocalDate data;
    private float valor;

    public Transacao(Conta conta, float valor, String canal){
        this.data  = LocalDate.now();
        this.valor = valor;
        this.canal = canal;
        this.conta = conta;
    }

    public float getValor() {
        return valor;
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

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "conta=" + conta.getNumeroConta() +
                ", canal='" + canal + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
