package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Curriculo;

import java.util.ArrayList;
import java.util.List;

public class CurriculoDao implements AbstractDao<Curriculo> {

	private final List<Curriculo> lista = new ArrayList<>();

	@Override
	public void cadastrar(Curriculo curriculo) {
		lista.add(curriculo);
	}

	@Override
	public List<Curriculo> consultarTodos() {
		return lista;
	}

	@Override
	public void apagar(Curriculo curriculo) {
		lista.remove(curriculo);
	}
}
