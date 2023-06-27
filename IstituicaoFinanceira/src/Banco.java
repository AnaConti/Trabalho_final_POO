import java.io.Serializable;
import java.util.ArrayList;

public class Banco implements Serializable {
    private ArrayList<Agencia> agencias;

    public Banco(){
        this.agencias = new ArrayList<>();
    }
  
    public void addAgencia(Agencia agencia){
        this.agencias.add(agencia);
    }

    public Agencia getAgencia(int num){
        return agencias.get(num);
    }

    public void printBanco(){
        for(int i = 0;i<agencias.size();i++){
            System.out.println("\nAgencia "+i);
            System.out.println(agencias.get(i).toString());
            System.out.println("Gerente:");
            System.out.println(agencias.get(i).getGerente().toString());
            System.out.println("Funcionarios: ");
            agencias.get(i).printFuncionarios();
            System.out.println("Clientes");
            agencias.get(i).printClientes();
            System.out.println();
        }

    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "agencias=" + agencias +
                '}';
    }
}
