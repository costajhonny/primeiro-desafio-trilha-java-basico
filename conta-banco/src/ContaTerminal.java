import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    
   
    public static void main(String[] args) throws Exception {      
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numeroDaConta;
        double saldo;
        String agencia,nomeDoCliente;
        saldo = 237.48;

        System.out.print("Por favor, digite o seu nome  !");
        nomeDoCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta !");
        numeroDaConta = sc.nextInt();

        System.out.printf(" Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + " Conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque " );
  
       
    }
}
