import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Serlializador s = new Serlializador();

        try {
            Banco banco = s.desserializar("arq.ser");



            s.serializar("arq.ser", banco);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}