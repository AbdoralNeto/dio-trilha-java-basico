import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importa classe scanner

        //Exibir as mensagens para o usuário

        //Obter pela scanner os valores digitados no terminal
        
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.err.println("Digite o número da Agencia: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        double saldoConta = 100.0;
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta no nosso banco.");
        System.out.println("Sua Agencia é: "+numeroAgencia);
        System.out.println("Sua Conta é: "+numeroConta);

        if (saldoConta <= 0.0){
            System.out.println("Seu saldo é: R$ "+saldoConta+", você não tem saldo disponivel para saque!");
        }else{
            System.out.println("Seu saldo é: R$ "+saldoConta+", seu saldo já está disponivel para saque!");
        }
    }
}
