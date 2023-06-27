import java.io.Serializable;
import java.util.ArrayList;

public class Agencia implements Serializable {
    private String nome, endereco, numero;

    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private Gerente gerente;

    public Agencia(){
        this.numero       ="";
        this.nome         ="";
        this.endereco     ="";
        this.clientes     = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.gerente      = null;
    }

    public Agencia(String nome, String endereco, String numero, Gerente gerente){
        this.numero       =numero;
        this.nome         =nome;
        this.endereco     =endereco;
        this.clientes     = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.gerente      = gerente;
    }


    
     public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void printClientes(){
        for (int i = 0; i<5; i++){
            System.out.println(clientes.get(i).toString());
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }



    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void printFuncionarios(){
        for (int i = 0; i<5; i++){
            System.out.println(funcionarios.get(i).toString());
        }
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }



    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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
        return "Agencia{" + "\nnumero=" + numero + "\n nome='" + nome + '\'' + "\n endereco"
         + endereco+ "\n}";
    }
}
