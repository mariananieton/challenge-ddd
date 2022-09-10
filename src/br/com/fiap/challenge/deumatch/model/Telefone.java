package br.com.fiap.challenge.deumatch.model;

import java.util.StringJoiner;

public class Telefone {

	private int id;

	private int ddi;

	private int ddd;

	private int numero;

	private char status;

	private TipoTelefone tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDdi() {
		return ddi;
	}

	public void setDdi(int ddi) {
		this.ddi = ddi;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Telefone.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("ddi=" + ddi)
				.add("ddd=" + ddd)
				.add("numero=" + numero)
				.add("status=" + status)
				.add("tipo=" + tipo)
				.toString();
	}
}
