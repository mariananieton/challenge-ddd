package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Vaga;

import java.util.ArrayList;
import java.util.List;

public class VagaDao implements AbstractDao<Vaga> {

	private final List<Vaga> lista = new ArrayList<>();

	@Override
	public void cadastrar(Vaga vaga) {
		lista.add(vaga);
	}

	@Override
	public List<Vaga> consultarTodos() {
		return lista;
	}

	@Override
	public void apagar(Vaga vaga) {
		lista.remove(vaga);
	}

}
