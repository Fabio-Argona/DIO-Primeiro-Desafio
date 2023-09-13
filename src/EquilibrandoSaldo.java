import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o saldo atual da conta bancária: ");
            double saldoAtual = scanner.nextDouble();

            System.out.println("Informe o valor a ser depositado na conta: ");
            double valorDeposito = scanner.nextDouble();

            System.out.println("Informe o valor a ser retirado da conta: ");
            double valorRetirada = scanner.nextDouble();

            double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Saldo atualizado na conta: " + saldoAtualizado);
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|   Entrada    |    Valor Depositado   | Valor Retirada | Saldo Atualizado |");
            System.out.println("--------------------------------------------------");
            System.out.printf("|    %.2f   |        %.2f         |     %.2f     |     %.2f      |%n",
                saldoAtual, valorDeposito, valorRetirada, saldoAtualizado);
            System.out.println("----------------------------------------------------------------------------");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir números decimais válidos.");
        }

        scanner.close();
    }
}
