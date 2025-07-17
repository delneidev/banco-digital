public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.depositar(2);
        cc.transferir(cp, 2);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
