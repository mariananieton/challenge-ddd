package br.com.fiap.challenge.deumatch.dao;

import java.util.List;

public interface AbstractDao<T> {

	void cadastrar(T objeto);

	List<T> consultarTodos();

	void apagar(T objeto);

}
