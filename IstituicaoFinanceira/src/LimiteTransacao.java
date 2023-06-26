public class LimiteTransacao extends Exception{
    public LimiteTransacao(){
        super();
    }

    public LimiteTransacao(String msg){
        super(msg);
    }
}
