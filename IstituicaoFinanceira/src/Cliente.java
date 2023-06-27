import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa{
    private String escolaridade;
    private Agencia agencia;
    private ArrayList<Conta> contas;

    public Cliente(){
        super();
        this.escolaridade="";
        agencia = null;
        this.contas       = new ArrayList<>();
    }

    public Cliente(Agencia agencia, String escolaridade, String nome, String cpf){
        super(cpf, nome);

        this.escolaridade = escolaridade;
        this.agencia      = agencia;
        this.contas       = new ArrayList<>();
    }

    public Cliente(String cpf, String nome){
        super(cpf, nome);
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public Conta getConta() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<contas.size();i++){
            System.out.println("Conta numero "+(i+1));
            this.contas.get(i).toString();
        }

        System.out.print("Insira qual conta deseja operar: ");
        int op = sc.nextInt();
        sc.nextLine();
        op--;

        try{
            return this.contas.get(op);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Você escolheu uma conta inexistente.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "escolaridade='" + escolaridade + '\'' +
                ", agencia=" + agencia +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    @Override
    public void bonusAniversario() {

    }
}
