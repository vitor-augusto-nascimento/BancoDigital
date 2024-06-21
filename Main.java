public class Main {
	public static void main(String[] args) {
		Cliente vitor = new Cliente();
		vitor.setNome("Vitor Augusto do Nascimento");
		Conta cc = new ContaCorrente(vitor);
		Conta poupanca = new ContaPoupanca(vitor);
		cc.depositar(1300);
		cc.transferir(600, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
