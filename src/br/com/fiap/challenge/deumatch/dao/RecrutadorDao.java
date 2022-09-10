package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Recrutador;

import java.util.ArrayList;
import java.util.List;

public class RecrutadorDao implements AbstractDao<Recrutador> {

	private final List<Recrutador> lista = new ArrayList<>();

	@Override
	public void cadastrar(Recrutador recrutador) {
		lista.add(recrutador);
	}

	@Override
	public List<Recrutador> consultarTodos() {
		return lista;
	}

	@Override
	public void apagar(Recrutador recrutador) {
		lista.remove(recrutador);
	}
}
