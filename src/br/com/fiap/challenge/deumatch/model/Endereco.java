package br.com.fiap.challenge.deumatch.model;

import java.util.StringJoiner;

public class Endereco {

	private int id;

	private String logradouro;

	private int numero;

	private String complemento;

	private String cep;

	private String cidade;

	private String estado;

	private TipoEndereco tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public TipoEndereco getTipo() {
		return tipo;
	}

	public void setTipo(TipoEndereco tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Endereco.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("logradouro='" + logradouro + "'")
				.add("numero=" + numero)
				.add("complemento='" + complemento + "'")
				.add("cep='" + cep + "'")
				.add("cidade='" + cidade + "'")
				.add("estado='" + estado + "'")
				.add("tipo=" + tipo)
				.toString();
	}
}
