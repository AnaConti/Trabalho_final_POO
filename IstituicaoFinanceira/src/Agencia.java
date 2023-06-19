import java.util.ArrayList;

public class Agencia {
    private int numero;
    private String nome, endereco;

    private ArrayList<Conta> contas;
    private ArrayList<Funcionario> funcionarios;
    private Gerente gerente;

    public Agencia(){
        this.numero=000;
        this.nome="";
        this.endereco="";
        this.contas= new ArrayList<>();
        this.funcionarios= new ArrayList<>();
        this.gerente= new Gerente();
    }

     public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

     public String toString() {
        return "AgenciaBancaria{" + "numero=" + numero + "\n nome='" + nome + '\'' + "\n endereco" 
         + "\n contas=" + contas + "\n funcionarios=" + funcionarios + '}';
    }
}
