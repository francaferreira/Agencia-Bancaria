package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta{

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Idalice Fran�a");
		cc3.setSaldo(20000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();

	}

}
