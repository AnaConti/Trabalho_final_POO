import java.util.ArrayList;

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

    public ArrayList<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "\nescolaridade='" + escolaridade + '\'' +
                ", \ncontas=" + contas +
                ", \ncpf='" + cpf + '\'' +
                ", \nnome='" + nome + '\'' +
                ", \nestadoCivil='" + estadoCivil + '\'' +
                ", \nendereco='" + endereco + '\'' +
                ", \ndataNascimento='" + dataNascimento + '\'' +
                "\n}";
    }

    @Override
    public void bonusAniversario() {
        if(verificarAniversario()){
            for(int i = 0; i<this.getContas().size(); i++){
                this.contas.get(i).setSaldoAtual(this.contas.get(i).getSaldoAtual()*1.001);
            }
        }
    }
}
