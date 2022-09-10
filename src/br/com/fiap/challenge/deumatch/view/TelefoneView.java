package br.com.fiap.challenge.deumatch.view;

import br.com.fiap.challenge.deumatch.model.Telefone;
import br.com.fiap.challenge.deumatch.model.TipoTelefone;

import java.util.Scanner;

public class TelefoneView {

	public static Telefone criarTelefone() {
		Scanner scanner = new Scanner(System.in);
		Telefone telefone = new Telefone();
		System.out.println("Informe o DDI: ");
		telefone.setDdi(scanner.nextInt());
		System.out.println("Informe o DDD : ");
		telefone.setDdd(scanner.nextInt());
		System.out.println("Informe o numero: ");
		telefone.setNumero(scanner.nextInt());
		System.out.println("Seu telefone é:");
		System.out.println("1 - Fixo");
		System.out.println("2 - Movel");
		telefone.setTipo(scanner.nextInt() == 1 ? TipoTelefone.FIXO : TipoTelefone.MOVEL);
		return telefone;
	}

}
