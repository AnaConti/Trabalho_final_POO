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


}
