import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa implements Serializable {
    protected String cpf, nome, estadoCivil, endereco, dataNascimento;

    public Pessoa(){
        this.cpf = " ";
        this.nome = " ";
        this.endereco = " ";
        this.estadoCivil= " ";
        this.dataNascimento = " ";
    }

    public Pessoa(String cpf, String nome){
        if(this.isCPF(cpf))
            this.cpf = cpf;
        else
            throw new RuntimeException("CPF invalido");

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(this.isCPF(cpf))
            this.cpf = cpf;
        else
            throw new RuntimeException("CPF invalido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public static boolean isCPF(String CPF) {
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") ||
            CPF.equals("33333333333") ||
            CPF.equals("44444444444") ||
            CPF.equals("55555555555") ||
            CPF.equals("66666666666") ||
            CPF.equals("77777777777") ||
            CPF.equals("88888888888") ||
            CPF.equals("99999999999") ||
            CPF.length() != 11) {
           return false;
        }

        char digit10, digit11;
        int sum, i, resto, num, peso;

        sum = 0;
        peso = 10;
        for (i = 0; i < 9; i++) {
            num = (int) (CPF.charAt(i) - 48);
            sum = sum + (num * peso);
            peso = peso - 1;
        }

        resto = 11 - (sum % 11);
        if (resto == 10 || resto == 11) {
            digit10 = '0';
        } else {
            digit10 = (char) (resto + 48);
        }

        sum = 0;
        peso = 11;
        for (i = 0; i < 10; i++) {
            num = (int) (CPF.charAt(i) - 48);
            sum = sum + (num * peso);
            peso = peso - 1;
        }

        resto = 11 - (sum % 11);
        if (resto == 10 || resto == 11) {
            digit11 = '0';
        } else {
            digit11 = (char) (resto + 48);
        }

        return digit10 == CPF.charAt(9) && digit11 == CPF.charAt(10);
}

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public boolean verificarAniversario() {
        DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAtual = new Date();

        try {
            Date dataAniversario = formatoData.parse(dataNascimento);

            dataAniversario.setYear(dataAtual.getYear());

            return dataAniversario.equals(dataAtual);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    public abstract void bonusAniversario();
}