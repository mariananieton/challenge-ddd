package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Telefone;

import java.util.ArrayList;
import java.util.List;

public class TelefoneDao implements AbstractDao<Telefone> {

	private final List<Telefone> lista = new ArrayList<>();

	@Override
	public void cadastrar(Telefone telefone) {
		lista.add(telefone);
	}

	@Override
	public List<Telefone> consultarTodos() {
		return lista;
	}

	@Override
	public void apagar(Telefone telefone) {
		lista.remove(telefone);
	}
}
