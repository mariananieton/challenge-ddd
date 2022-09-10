package br.com.fiap.challenge.deumatch.model;

import java.time.LocalDate;
import java.util.List;
import java.util.StringJoiner;

public class Candidato {

	private int id;

	private String nome;

	private LocalDate dataNascimento;

	private Endereco endereco;

	private Telefone telefone;

	private Email email;

	private String cpf;

	private List<Vaga> vagaList;

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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Vaga> getVagaList() {
		return vagaList;
	}

	public void setVagaList(List<Vaga> vagaList) {
		this.vagaList = vagaList;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Candidato.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("nome='" + nome + "'")
				.add("dataNascimento=" + dataNascimento)
				.add("endereco=" + endereco)
				.add("telefone=" + telefone)
				.add("email=" + email)
				.add("cpf='" + cpf + "'")
				.add("vagaList=" + vagaList)
				.toString();
	}
}
