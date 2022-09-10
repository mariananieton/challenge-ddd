package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Candidato;

import java.util.ArrayList;
import java.util.List;

public class CandidatoDao implements AbstractDao<Candidato> {

	private final List<Candidato> lista = new ArrayList<>();

	@Override
	public void cadastrar(Candidato candidato) {
		lista.add(candidato);
	}

	@Override
	public List<Candidato> consultarTodos() {
		return this.lista;
	}

	@Override
	public void apagar(Candidato candidato) {
		lista.remove(candidato);
	}


}
