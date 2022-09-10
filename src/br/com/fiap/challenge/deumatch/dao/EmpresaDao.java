package br.com.fiap.challenge.deumatch.dao;

import br.com.fiap.challenge.deumatch.model.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDao implements AbstractDao<Empresa> {

	private final List<Empresa> lista = new ArrayList<>();

	@Override
	public void cadastrar(Empresa empresa) {
		lista.add(empresa);
	}

	@Override
	public List<Empresa> consultarTodos() {
		return lista;
	}

	@Override
	public void apagar(Empresa empresa) {
		lista.remove(empresa);
	}
}
