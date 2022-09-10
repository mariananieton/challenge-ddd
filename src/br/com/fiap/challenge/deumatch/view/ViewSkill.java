package br.com.fiap.challenge.deumatch.view;

import br.com.fiap.challenge.deumatch.model.Skill;
import br.com.fiap.challenge.deumatch.model.TipoSkill;

import java.util.Scanner;

public class ViewSkill {


	public static Skill criarSkill() {
		Scanner scanner = new Scanner(System.in);
		Skill skill = new Skill();
		System.out.println("Nome :");
		skill.setNome(scanner.nextLine());
		System.out.println("Experiencia :");
		skill.setExperiencia(scanner.nextLine());
		System.out.println("Selecione o tipo de Skill:");
		System.out.println("1 - Hard");
		System.out.println("2 - Soft");
		skill.setTipo(scanner.nextInt() == 1 ? TipoSkill.HARD : TipoSkill.SOFT);
		return skill;
	}

}
