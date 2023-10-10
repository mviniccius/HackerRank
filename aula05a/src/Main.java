import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //criando menu para manupular o objeto

        ContaBanco conta = new ContaBanco(); // criando o objeto banco
        int menu; // variavel para controlar a saido do programa
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n\nSistema bancario");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Conferir status da conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Consultar saldo");
            System.out.println("0 - Sair");

            menu = scanner.nextInt();

            switch(menu){
                case 0:
                    break;
                case 1:
                    conta.setStatus(true);
                    String tipo;
                    tipo = scanner.nextLine();
                    System.out.println("Digite o tipo de conta! \nCC - Conta Corrente\nCP - Conta Poupanca\n");
                    tipo = scanner.nextLine();
                    conta.abrirConta(tipo);

                    System.out.println("conta criada com sucesso!");
                    break;
                case 2:
                    System.out.println("Status da conta: " + conta.getStatus());
                    break;

                case 3:
                    float valor;

                    System.out.println("Digite o valor para depositar\n");
                    valor = scanner.nextFloat();
                    conta.depositar(valor);

                    break;
                case 5:
                    float saldo;
                    saldo = conta.getSaldo();

                    System.out.println("Seu sadlo: R$" + saldo);
                    break;
                default:
                    System.out.println("\nOpcao invalida");
                    break;
            }
        }while (menu != 0);

    }
}