package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Endereco;

import java.util.ArrayList;
import java.util.List;

public class EnderecoDao implements AbstractDao<Endereco> {

	private final List<Endereco> lista = new ArrayList<>();

	@Override
	public void cadastrar(Endereco endereco) {
		lista.add(endereco);
	}

	@Override
	public List<Endereco> consultarTodos() {
		return lista;
	}

	@Override
	public void apagar(Endereco endereco) {
		lista.remove(endereco);
	}
}
