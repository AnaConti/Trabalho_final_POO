public class Cliente extends Pessoa{
    private String escolaridade;
    private Agencia agencia;
    private Conta conta;

    public Cliente(){
        super();
        this.escolaridade="";
        agencia = new Agencia();
    }

    public Cliente(String cpf, String nome){
        super(cpf, nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
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

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
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
}
