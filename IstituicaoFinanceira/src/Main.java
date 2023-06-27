import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Serlializador s = new Serlializador();
        int agenciaIndex;
        Conta conta;
        Cliente cl;
        Agencia agencia;

        try {
            Banco banco = s.desserializar("arq.ser");

            while(true){
                System.out.println("\nInsira uma opcao: ");
                System.out.println("[1]- Imprimir todos dados do banco;");
                System.out.println("[2]- Cadastrar um cliente e uma conta para ele;");
                System.out.println("[3]- Cadastrar um funcionario;");
                System.out.println("[4]- Realizar alguma transacao;");
                System.out.println("[5]- Sair.");

                System.out.print("Digite a opcao: ");
                int op = sc.nextInt();
                sc.nextLine();

                if(op==5)
                    break;

                switch (op){
                    case 1:
                        banco.printBanco();
                        break;

                    case 2:
                        System.out.println("Qual agência deseja criar sua conta?");
                        for(int i = 0;i<banco.getAgencias().size();i++){
                            System.out.print("["+ i + "] -" + banco.getAgencias().get(i).getNome()+"\n");
                        }
                        System.out.print("Digite uma opção: ");
                        agenciaIndex = sc.nextInt();
                        sc.nextLine();

                        try{
                            agencia = banco.getAgencias().get(agenciaIndex);

                            System.out.print("Digite seu nome: ");
                            String nome = sc.nextLine();

                            System.out.print("Digite sua escolaridade: ");
                            String escolaridade = sc.nextLine();

                            System.out.print("Digite seu CPF: ");
                            String cpf = sc.nextLine();
                            cl = new Cliente(agencia, escolaridade, nome, cpf);

                            System.out.println("\nQual tipo de conta deseja criar?");
                            System.out.println("[1]-Conta Corrente");
                            System.out.println("[2]-Conta Poupança");
                            System.out.println("[3]-Conta Salário");
                            System.out.print("Digite a opcao de conta: ");
                            int opConta = sc.nextInt();
                            sc.nextLine();

                            switch (opConta){
                                case 1:
                                    conta = new ContaCorrente();
                                    System.out.println("Informações da sua nova conta corrente: ");
                                    System.out.println(conta.toString());
                                    cl.addConta(conta);
                                    break;

                                case 2:
                                    conta = new Poupanca();
                                    System.out.println("Informações da sua nova conta poupanca: ");
                                    System.out.println(conta.toString());
                                    cl.addConta(conta);
                                    break;

                                case 3:
                                    conta = new ContaSalario();
                                    System.out.println("Informações da sua nova conta Salário: ");
                                    System.out.println(conta.toString());
                                    cl.addConta(conta);
                                    break;

                                default:
                                    System.out.println("Tipo de conta inválida.");
                                    break;
                            }

                            agencia.addCliente(cl);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        break;

                    case 3:
                        System.out.println("\nQual agência deseja cadastrar o funcionario?");
                        for(int i = 0;i<banco.getAgencias().size();i++){
                            System.out.print("["+ i + "] -" + banco.getAgencias().get(i).getNome()+"\n");
                        }
                        System.out.print("Digite uma opção: ");
                        agenciaIndex = sc.nextInt();
                        sc.nextLine();

                        try{
                            agencia = banco.getAgencias().get(agenciaIndex);

                            System.out.print("Insira o nome: ");
                            String nome = sc.nextLine();

                            System.out.print("Insira o cpf: ");
                            String cpf = sc.nextLine();

                            System.out.print("Insira a carteira de trabalho: ");
                            String carteiraTrabalho = sc.nextLine();

                            System.out.print("Insira o RG: ");
                            String rg = sc.nextLine();

                            System.out.print("Insira o cargo: ");
                            String cargo = sc.nextLine();

                            System.out.print("Insira o sexo: ");
                            String sexo = sc.nextLine();

                            System.out.print("Insira o nome: ");
                            double salario = sc.nextDouble();
                            sc.nextLine();

                            Funcionario funcionario = new Funcionario(agencia, cpf, nome, carteiraTrabalho, rg, sexo, cargo, salario, LocalDate.now());

                            agencia.addFuncionario(funcionario);
                            System.out.println("Funcionario adicionado com sucesso à agencia!");
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    case 4:
                        System.out.println("\nO cliente que deseja operar está em qual agência?");
                        for(int i = 0;i<banco.getAgencias().size();i++)
                            System.out.print("["+ i + "] -" + banco.getAgencias().get(i).getNome()+"\n");

                        System.out.print("Digite uma opção: ");
                        agenciaIndex = sc.nextInt();
                        sc.nextLine();

                        try{
                            agencia = banco.getAgencias().get(agenciaIndex);

                            System.out.println("\nQual cliente deseja operar?");
                            for(int i = 0;i<agencia.getClientes().size();i++)
                                System.out.println("["+i+"] -"+agencia.getClientes().get(i).getNome());

                            int clienteIndex = sc.nextInt();
                            sc.nextLine();

                            cl = agencia.getClientes().get(clienteIndex);

                            if(cl.getContas().size()==0){
                                System.out.println("O cliente nao possui contas cadastradas.");
                                break;
                            }

                            System.out.println("Qual conta deseja operar?");
                            for(int i = 0;i<cl.getContas().size();i++)
                                System.out.println("["+i+"] "+cl.getContas().get(i).getNumeroConta());

                            int contaIndex = sc.nextInt();
                            sc.nextLine();

                            conta = cl.getContas().get(contaIndex);

                            while(true){
                                Transacao tr;
                                System.out.println("\nQual operação deseja realizar?");
                                System.out.println("[1] - Consultar Saldo;");
                                System.out.println("[2] - Depositar;");
                                System.out.println("[3] - Efetuar Pagamento;");
                                System.out.println("[4] - Sacar;");
                                System.out.println("[5] - Extrato de todas transacoes da conta");
                                System.out.println("[6] - Sair;");
                                System.out.print("Digite a operação: ");

                                op = sc.nextInt();
                                sc.nextLine();

                                if(op==6)
                                    break;

                                System.out.print("Digite sua senha: ");
                                String senha = sc.nextLine();
                                double valor;

                                switch (op){
                                    case 1:
                                        tr = new ConsultarSaldo(conta, "Internet Banking");
                                        ((ConsultarSaldo)tr).consultaSaldo(senha);

                                        conta.addTransacao(tr);
                                        break;

                                    case 2:
                                        System.out.print("Digite o valor do depósito: ");
                                        valor = sc.nextDouble();
                                        sc.nextLine();

                                        tr = new Deposito(conta, valor, "Internet Banking");
                                        ((Deposito)tr).deposito(senha);

                                        conta.addTransacao(tr);
                                        break;

                                    case 3:
                                        System.out.print("Digite o valor do pagamento: ");
                                        valor = sc.nextDouble();
                                        sc.nextLine();

                                        tr = new EfetuarPagamento(conta, valor, "Internet Banking");
                                        ((EfetuarPagamento)tr).efetuarPagamento(senha);

                                        conta.addTransacao(tr);
                                        break;

                                    case 4:
                                        System.out.print("Digite o valor do saque: ");
                                        valor = sc.nextDouble();
                                        sc.nextLine();

                                        tr = new Saque(conta, valor, "Internet Banking");
                                        ((Saque)tr).saque(senha);

                                        conta.addTransacao(tr);
                                        break;
                                    case 5:
                                        conta.extrato();
                                        break;

                                    default:
                                        System.out.println("Operação invalida");
                                        break;
                                }
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    default:
                        System.out.println("Opcao invalida.");
                        break;
                }
            }


            s.serializar("arq.ser", banco);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}