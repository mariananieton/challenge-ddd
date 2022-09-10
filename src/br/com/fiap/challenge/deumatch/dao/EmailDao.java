package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailDao implements AbstractDao<Email> {

	private final List<Email> lista = new ArrayList<>();

	@Override
	public void cadastrar(Email email) {
		lista.add(email);
	}

	@Override
	public List<Email> consultarTodos() {
		return lista;
	}

	@Override
	public void apagar(Email email) {
		lista.remove(email);
	}
}
