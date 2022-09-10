package br.com.fiap.challenge.deumatch.model;

import java.util.StringJoiner;

public class Recrutador {

	private int id;

	private String nome;

	private Email email;

	private Telefone telefone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Recrutador.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("nome='" + nome + "'")
				.add("email=" + email)
				.add("telefone=" + telefone)
				.toString();
	}
}


