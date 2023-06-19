import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Transacao {
    Scanner sc = new Scanner(System.in);
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

    public void solicitarSenha(){
        System.out.println("Insira a senha para prosseguir: ");
        String senha = sc.nextLine();

        
    }
    //colocar a senha
    public void consultaSaldo(){
         System.out.println("Saldo atual da conta: " + conta.getSaldoAtual());
    }
}
