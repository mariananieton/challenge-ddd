package br.com.fiap.challenge.deumatch.model;

import java.util.StringJoiner;

public class Skill {

	private int id;

	private String nome;

	private String experiencia;

	private TipoSkill tipo;

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

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public TipoSkill getTipo() {
		return tipo;
	}

	public void setTipo(TipoSkill tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Skill.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("nome='" + nome + "'")
				.add("experiencia='" + experiencia + "'")
				.add("tipo=" + tipo)
				.toString();
	}
}
