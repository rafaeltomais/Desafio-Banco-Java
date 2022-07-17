public class ContaPoupanca extends Conta {
    public double rendimento;
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void rendimento(){
        this.rendimento = saldo * 0.05;
        this.saldo += rendimento;
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato conta poupanca ===" );
        super.imprimirInfosComuns();
        System.out.println(String.format("Rendimento: R$%.2f", this.rendimento));
    }
}
