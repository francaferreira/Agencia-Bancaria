package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("jefferson Fran�a"); 
		cc1.setSaldo(1000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(2000);
		cc1.exibirSaldo();
		System.out.println("--------------------------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Eva Pereira"); 
		cc2.setSaldo(15000);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(1000);
		cc2.exibirSaldo();
		System.out.println("--------------------------------------");
		System.out.println("Transfer�ncia");
		System.out.println("Cliente: " + cc1.getCliente());
		System.out.println("Favorecido: " + cc2.getCliente());
		cc1.trasnferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: " + cc2.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("--------------------------------------");
		System.out.println("Relat�rio gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total das contas: R$ " + relatorio);
	}

}
