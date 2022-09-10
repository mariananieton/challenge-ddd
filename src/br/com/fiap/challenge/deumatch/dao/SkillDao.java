package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Skill;

import java.util.ArrayList;
import java.util.List;

public class SkillDao implements AbstractDao<Skill> {

	private final List<Skill> lista = new ArrayList<>();

	@Override
	public void cadastrar(Skill skill) {
		lista.add(skill);
	}

	@Override
	public List<Skill> consultarTodos() {
		return lista;
	}

	@Override
	public void apagar(Skill skill) {
		lista.remove(skill);
	}
}
