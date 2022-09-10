package br.com.fiap.challenge.deumatch.model;

import java.util.StringJoiner;

public class Empresa {

	private int id;

	private String razaoSocial;

	private Endereco endereco;

	private Telefone telefone;

	private Email email;

	private String cnpj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Empresa.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("razaoSocial='" + razaoSocial + "'")
				.add("endereco=" + endereco)
				.add("telefone=" + telefone)
				.add("email=" + email)
				.add("cnpj='" + cnpj + "'")
				.toString();
	}
}
