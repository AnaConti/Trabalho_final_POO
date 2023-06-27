import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Serlializador s = new Serlializador();

        try {
            Banco banco = s.desserializar("arq.ser");

            Gerente gerente[]           = new Gerente[2];
            Agencia agencia[]           = new Agencia[2];
            Cliente clientes []         = new Cliente[10];
            Funcionario funcionarios [] = new Funcionario[10];
            Conta contas []             = new Conta[4];
            Transacao transacoes[]      = new Transacao[10];

            //Criando o gerente e a agencia numero 0
            gerente[0]  = new Gerente( "67108199068", "Gabriel Couto de Freitas", "94755582908", "487302989", "Masculino", "Gerente", 5903.78, LocalDate.now(), false, LocalDate.now());
            agencia[0] = new Agencia("Caixa Econômica Federal (Centro)", "R. Cel. Antônio Alves Pereira, 390", "0161-9", gerente[0]);
            gerente[0].setAgencia(agencia[0]);

            //Criando o gerente e a agencia numero 1
            gerente[1] = new Gerente("16266065010", "Ana Bárbara Campos Conti", "27340226139", "321022956", "Feminino", "Gerente", 10000.00, LocalDate.now(), true, LocalDate.now());
            agencia[1] = new Agencia("Banco do Brasil", "AV JOAO NAVES DE AVILA 264", "4165", gerente[1]);
            gerente[1].setAgencia(agencia[1]);

            //Criação dos clientes da agencia 0
            clientes[0] = new Cliente(agencia[0], "Ensino médio completo", "João Gomes", "91055126031");
            clientes[1] = new Cliente(agencia[0], "Ensino médio imcompleto", "Eurípedes Júnior", "46009275083");
            clientes[2] = new Cliente(agencia[0], "Ensino superior incompleto", "Thiago Luis", "40448064030");
            clientes[3] = new Cliente(agencia[0], "Ensino médio completo", "Henrique Couto", "00902731092");
            clientes[4] = new Cliente(agencia[0], "Mestrado completo", "Maria Fernanda", "37491850006");

            //Criação dos clientes da agencia 1
            clientes[5] = new Cliente(agencia[1], "Ensino médio completo", "Anna Júlia", "47296073098");
            clientes[6] = new Cliente(agencia[1], "Doutorado", "Ana Laura", "45326755025");
            clientes[7] = new Cliente(agencia[1], "Ensino fundamental", "Tiago Lopes", "49414512012");
            clientes[8] = new Cliente(agencia[1], "Doutorando", "João Lopes", "10988067005");
            clientes[9] = new Cliente(agencia[1], "Ensino médio incompleto", "Maria Joana", "68609486044");

            //Criação dos funcionarios da agencia 0
            funcionarios[0] = new Funcionario(agencia[0], "12090791608", "Joao de Deus", "236637113", "444624909", "Masculino", "Bancário", 3400.00, LocalDate.now());
            funcionarios[1] = new Funcionario(agencia[0], "12090791608", "Junior Sandy", "42860925760", "207861079", "Masculino", "Segurança", 2000, LocalDate.now());
            funcionarios[2] = new Funcionario(agencia[0], "12090791608", "Gustavo Reis", "06140546498", "466717350", "Masculino", "Limpeza", 1900, LocalDate.now());
            funcionarios[3] = new Funcionario(agencia[0], "12090791608", "Maria Aparecida", "85192315004", "337357031", "Feminino", "Bancária", 2400, LocalDate.now());
            funcionarios[4] = new Funcionario(agencia[0], "12090791608", "Felipe Luis", "18524183980", "372409921", "Masculino", "Segurança", 1800, LocalDate.now());

            //Criação dos funcionarios da agencia 1
            funcionarios[5] = new Funcionario(agencia[1], "12090791608", "Joao Kleber", "96222479757", "350025757", "Masculino", "Segurança", 1900, LocalDate.now());
            funcionarios[6] = new Funcionario(agencia[1], "12090791608", "Giovanni junior", "91273024977", "113987845", "Masculino", "Limpeza", 1600, LocalDate.now());
            funcionarios[7] = new Funcionario(agencia[1], "12090791608", "Maria Eugenia", "70350316407", "486042789", "Feminino", "Contadora", 7900, LocalDate.now());
            funcionarios[8] = new Funcionario(agencia[1], "12090791608", "Henrique Dourado", "64501501998", "170397658", "Masculino", "Segurança", 8000, LocalDate.now());
            funcionarios[9] = new Funcionario(agencia[1], "12090791608", "Marlon Cruz", "49374792081", "295483106", "Masculino", "Bancário", 4800.98, LocalDate.now());

            //Criando contas
            contas[0] = new ContaCorrente();
            contas[1] = new ContaSalario();
            contas[2] = new Poupanca();
            contas[3] = new ContaCorrente();

            //Adicionando senha padrao para todas as contas
            for(int i = 0; i<contas.length; i++)
                contas[i].setSenha("senha");

            //Fazendo algumas transacoes
            transacoes[0] = new Deposito(contas[0], 10000.90, "Internet Banking");
            ((Deposito)transacoes[0]).deposito();

            transacoes[1] = new ConsultarSaldo(contas[0], "Internet Banking");
            ((ConsultarSaldo)transacoes[1]).consultaSaldo();

            transacoes[2] = new ConsultarSaldo(contas[1], "Internet Banking");
            ((ConsultarSaldo)transacoes[2]).consultaSaldo();

            transacoes[3] = new Deposito(contas[1], 200, "Internet Banking");
            ((Deposito)transacoes[3]).deposito();

            transacoes[4] = new ConsultarSaldo(contas[1], "Internet Banking");
            ((ConsultarSaldo)transacoes[4]).consultaSaldo();

            transacoes[5] = new EfetuarPagamento(contas[1],150,  "Internet Banking");
            ((EfetuarPagamento)transacoes[5]).efetuarPagamento();

            transacoes[6] = new Saque(contas[1], 20, "Internet Banking");
            ((Saque)transacoes[6]).saque();

            transacoes[7] = new Deposito(contas[2], 100.80, "Internet Banking");
            ((Deposito)transacoes[7]).deposito();

            transacoes[8] = new ConsultarSaldo(contas[2], "Internet Banking");
            ((ConsultarSaldo)transacoes[8]).consultaSaldo();

            transacoes[9] = new ConsultarSaldo(contas[3], "Internet Banking");
            ((ConsultarSaldo)transacoes[9]).consultaSaldo();

            //Adicionando as transacoes a cada conta
            for(int i = 0; i<transacoes.length; i++)
                transacoes[i].getConta().addTransacao(transacoes[i]);

            //Adicionando cada funcionario a sua respectiva agencia
            for(int i = 0; i<funcionarios.length; i++)
                funcionarios[i].getAgencia().addFuncionario(funcionarios[i]);

            //Adicionando cada cliente a sua respectiva agencia
            for(int i = 0; i<clientes.length; i++)
                clientes[i].getAgencia().addCliente(clientes[i]);

            //Adicionando as contas aos clientes
            clientes[0].addConta(contas[0]);
            clientes[0].addConta(contas[1]);
            clientes[5].addConta(contas[2]);
            clientes[6].addConta(contas[3]);

            s.serializar("arq.ser", banco);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}