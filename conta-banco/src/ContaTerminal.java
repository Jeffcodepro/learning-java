import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por Favor, digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o valor do depósito:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está dsiponível para saque. ");

    }
}
