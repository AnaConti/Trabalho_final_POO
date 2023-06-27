import java.io.*;
import java.util.concurrent.ExecutionException;

public class Serlializador implements Serializable {
    public void serializar(String arq, Banco instituicaoFinanceira) throws IllegalArgumentException{

        if(arq == null || arq.isEmpty())
            throw new IllegalArgumentException("Nome de arqivo inválido!");
        else if(instituicaoFinanceira==null)
            throw new IllegalArgumentException("Insituição financeira vazia");

        try {
            FileOutputStream file    = new FileOutputStream(arq);
            ObjectOutputStream banco = new ObjectOutputStream(file);

            banco.writeObject(instituicaoFinanceira);

            banco.close();
            file.close();

            System.out.println("Banco salvo!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Banco desserializar(String arq) throws IllegalArgumentException{
        if(arq==null||arq.isEmpty())
            throw new IllegalArgumentException("Nome de arquivo inválido!");

        try {
            FileInputStream file = new FileInputStream(arq);
            ObjectInputStream banco = new ObjectInputStream(file);
            Banco obj = (Banco) banco.readObject();
            banco.close();
            file.close();
            System.out.println("Banco carregado!");
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
