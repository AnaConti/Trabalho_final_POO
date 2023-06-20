import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            Cliente cliente = new Cliente();
            Conta conta;
            String cpf, nome, estadoCivil, endereco, dataNascimento, senha;
            String escolaridade;
            int op, tipoConta, transacao = 0;
            double valor;

            System.out.print("Deseja continuar(0) ou parar(-1)?: ");
            op = sc.nextInt();
            sc.nextLine();
            if(op==-1)
                return;

            System.out.println("Insira os dados para cadastrar um cliente:");
            System.out.print("Insira seu nome: ");
            nome = sc.nextLine();
            System.out.print("Insira seu CPF: ");
            cpf = sc.nextLine();
            System.out.print("Insira seu estado civil: ");
            estadoCivil = sc.nextLine();
            System.out.print("Insira seu endereco: ");
            endereco = sc.nextLine();
            System.out.print("Insira sua data de nascimento: ");
            dataNascimento = sc.nextLine();
            System.out.print("Insira sua escolaridade: ");
            escolaridade = sc.nextLine();
            System.out.println("Insira sua senha: ");
            senha = sc.nextLine();

            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setEstadoCivil(estadoCivil);
            cliente.setEndereco(endereco);
            cliente.setDataNascimento(dataNascimento);
            cliente.setEscolaridade(escolaridade);

            System.out.println("\nInsira qual tipo de conta deseja abrir:");
            System.out.println("[1]: Conta Corrente");
            System.out.println("[2]: Conta Salário");
            System.out.println("[3]: Conta Poupança");
            System.out.print("Insira a opção desejada: ");
            tipoConta = sc.nextInt();
            sc.nextLine();

            switch(tipoConta){
                case 1:
                    conta = new ContaCorrente();
                    break;

                case 2:
                    conta = new ContaSalario();
                    break;

                case 3:
                    conta = new Poupanca();
                    break;
                default:
                    System.out.println("Tipo de conta inválido.");
                    return;
            }
            conta.setSenha(senha);
            cliente.getAgencia().adicionarConta(conta);

            cliente.setConta(conta);
            while(transacao!=5){
                System.out.println("\nQual transacao deseja realizar?");
                System.out.println("[1]Saque");
                System.out.println("[2]Depósito");
                System.out.println("[3]Consultar saldo");
                System.out.println("[4]Pagar uma conta");
                System.out.println("[5]Parar de realizar transações");
                System.out.print("Digite a opção desejada: ");
                transacao = sc.nextInt();
                sc.nextLine();

                switch (transacao){
                    case 1:
                        System.out.print("Digite o valor a ser sacado: ");
                        valor =sc.nextDouble();
                        sc.nextLine();
                        Saque saque= new Saque(cliente.getConta(), valor, "Internet Banking");
                        saque.saque(valor);
                        break;

                    case 2:
                        System.out.print("Digite o valor a ser depositado: ");
                        valor =sc.nextDouble();
                        sc.nextLine();
                        Deposito dep = new Deposito(cliente.getConta(), valor, "Internet Banking");
                        dep.deposito(valor);

                    case 3:
                        ConsultarSaldo saldo = new ConsultarSaldo(cliente.getConta(), "Internet Banking");
                        saldo.consultaSaldo();
                        break;

                    case 4:
                        System.out.print("Digite o valor para efetuar o pagamento: ");
                        valor =sc.nextDouble();
                        sc.nextLine();
                        EfetuarPagamento pag = new EfetuarPagamento(cliente.getConta(), valor, "Internet Banking");
                        pag.efetuarPagamento(valor);
                        break;

                    case 5:
                        break;
                    default:
                        System.out.println("Operação inválida.");
                        return;
                }
                if(transacao==5)
                    break;
            }
        }

    }
}