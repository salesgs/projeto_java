import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Por favor, informe o seu nome !");
     String nome = scan.nextLine();
     
     System.out.println("Por favor, digite  o número do cpf");
     String cpf = scan.nextLine();
        
     Cliente cliente1 = new Cliente(nome,cpf);
     
     System.out.println("Informe o número da conta");
     int numeroConta = scan.nextInt();

     System.out.println("Informe o número da agência");
     String numeroAgencia = scan.next();
     scan.close();
     
     ContaTerminal conta1 = new ContaTerminal(numeroConta,numeroAgencia,cliente1);
     conta1.dados();
     
    }
}
