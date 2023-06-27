public interface RealizaTransacao {
    void realizarTransacao(String senha) throws SaldoInsuficiente, SenhaInvalida, LimiteTransacao;
}
