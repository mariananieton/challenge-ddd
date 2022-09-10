package br.com.fiap.challenge.deumatch.view;

import br.com.fiap.challenge.deumatch.model.Skill;
import br.com.fiap.challenge.deumatch.model.Vaga;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VagaView {

	public static Vaga criarVaga() {
		Scanner scanner = new Scanner(System.in);
		Vaga vaga = new Vaga();
		System.out.println("Titulo : ");
		vaga.setTitulo(scanner.nextLine());
		System.out.println("Data da Publicação (aaaa-mm-dd) : ");
		vaga.setDataInicioPublicacao(LocalDate.parse(scanner.nextLine()));
		System.out.println("Nível : ");
		vaga.setNivel(scanner.nextLine());
		vaga.setStatus('A');
		System.out.println("Descrição : ");
		vaga.setDescricao(scanner.nextLine());
		System.out.println("Salário : ");
		vaga.setSalario(scanner.nextDouble());
		System.out.println("Deseja adicionar uma skill? (1 -> Sim / 2 -> Não)");
		if (scanner.nextInt() == 1) {
			List<Skill> skillList = new ArrayList<>();
			skillList.add(ViewSkill.criarSkill());
			System.out.println("Deseja adicionar uma skill? (1 -> Sim / 2 -> Não)");
			while (scanner.nextInt() == 1) {
				skillList.add(ViewSkill.criarSkill());
				System.out.println("Deseja adicionar uma skill? (1 -> Sim / 2 -> Não)");
			}
			vaga.setSkillList(skillList);
		}
		return vaga;
	}

	public static void listarVagas(List<Vaga> vagaList) {
		for (int i = 0; i < vagaList.size(); i++) {
			Vaga vaga = vagaList.get(i);
			System.out.println((i + 1) + " - " + vaga);
		}
	}

}
