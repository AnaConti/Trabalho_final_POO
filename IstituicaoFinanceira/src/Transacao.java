import java.io.Serializable;
import java.time.LocalDate;

public class Transacao implements Serializable {
    protected Conta conta;
    protected String canal;
    protected LocalDate data;

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

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "\nconta=" + conta.getNumeroConta() +
                ",\n canal='" + canal + '\'' +
                ",\n data=" + data +
                "\n}";
    }

    public boolean solicitarSenha(String senha){
        if(conta.senhaCorreta(senha)){
            return true;
        }else{
            return false;
        }
    }

    
}
