package br.com.fiap.challenge.deumatch.view;

import br.com.fiap.challenge.deumatch.model.Candidato;
import br.com.fiap.challenge.deumatch.model.Email;
import br.com.fiap.challenge.deumatch.model.Endereco;
import br.com.fiap.challenge.deumatch.model.Telefone;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CandidatoView {

	public static Candidato criarCandidato() {
		Scanner scanner = new Scanner(System.in);
		Candidato candidato = new Candidato();
		System.out.println("Nome : ");
		candidato.setNome(scanner.nextLine());
		System.out.println("Data de Nascimento (aaaa-mm-dd) : ");
		candidato.setDataNascimento(LocalDate.parse(scanner.nextLine()));
		System.out.println("Email : ");
		final Email email = new Email();
		email.setEmail(scanner.nextLine());
		email.setStatus('A');
		candidato.setEmail(email);
		System.out.println("Cpf : ");
		candidato.setCpf(scanner.nextLine());

		System.out.println("-------------- Sobre Telefone --------------");
		Telefone telefone = TelefoneView.criarTelefone();
		candidato.setTelefone(telefone);

		System.out.println("-------------- Sobre Endereço --------------");
		Endereco endereco = EnderecoView.criarEndereco();
		candidato.setEndereco(endereco);

		return candidato;
	}

	public static void listarCandidatos(List<Candidato> candidatoList) {
		for (int i = 0; i < candidatoList.size(); i++) {
			Candidato candidato = candidatoList.get(i);
			System.out.println((i + 1) + " - " + candidato);
		}
	}

}
