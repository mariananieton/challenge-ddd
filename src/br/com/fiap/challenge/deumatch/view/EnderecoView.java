package br.com.fiap.challenge.deumatch.view;

import br.com.fiap.challenge.deumatch.model.Endereco;
import br.com.fiap.challenge.deumatch.model.TipoEndereco;

import java.util.Scanner;

public class EnderecoView {

	public static Endereco criarEndereco() {
		Scanner scanner = new Scanner(System.in);
		Endereco endereco = new Endereco();
		System.out.println("CEP : ");
		endereco.setCep(scanner.nextLine());
		System.out.println("Estado : ");
		endereco.setEstado(scanner.nextLine());
		System.out.println("Cidade : ");
		endereco.setCidade(scanner.nextLine());
		System.out.println("Logradouro : ");
		endereco.setLogradouro(scanner.nextLine());
		System.out.println("Numero : ");
		endereco.setNumero(scanner.nextInt());
		System.out.println("Complemento : ");
		String complemento = scanner.nextLine();
		if (complemento != null) {
			endereco.setComplemento(scanner.nextLine());
		}
		System.out.println("Escolha o tipo do seu endereço : ");
		System.out.println("1 - Residencial");
		System.out.println("2 - Comercial");
		endereco.setTipo(scanner.nextInt() == 1 ? TipoEndereco.RESIDENCIAL : TipoEndereco.COMERCIAL);

		return endereco;
	}

}
