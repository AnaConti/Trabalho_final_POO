import java.io.Serializable;
import java.util.ArrayList;

public class Banco implements Serializable {
    private ArrayList<Cliente> clientes;
    private ArrayList<Agencia> agencias;

    public Banco(){
        this.clientes = new ArrayList<>();
        this.agencias = new ArrayList<>();
    }

    public void cadastraClienteNovo(Cliente cliente){
        clientes.add(cliente);
    }

    public void getClientes(){
        for (int i = 0; i<5; i++){
            System.out.println(clientes.get(i).toString());
        }
    }
}
