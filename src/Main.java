public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente1.setNome("Rafael");
        cliente2.setNome("Lidianne");

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(250);
        ContaPoupanca poupanca = new ContaPoupanca(cliente2);
        cc.transferir(100, poupanca);
        poupanca.rendimento();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
