public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100);


        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.trasferir(50,contaPoupanca);

        contaCorrente.imprimirExtrato();
        System.out.println("");
        contaPoupanca.imprimirExtrato();

    }
}