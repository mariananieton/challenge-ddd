package br.com.fiap.challenge.deumatch.model;

import java.time.LocalDate;
import java.util.List;
import java.util.StringJoiner;

public class Vaga {

	private int id;

	private String titulo;

	private LocalDate dataInicioPublicacao;

	private LocalDate dataFimPublicacao;

	private char status;

	private String nivel;

	private String descricao;

	private double salario;

	private List<Skill> skillList;

	private List<Candidato> candidatoList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Candidato> getCandidatoList() {
		return candidatoList;
	}

	public void setCandidatoList(List<Candidato> candidatoList) {
		this.candidatoList = candidatoList;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataInicioPublicacao() {
		return dataInicioPublicacao;
	}

	public void setDataInicioPublicacao(LocalDate dataInicioPublicacao) {
		this.dataInicioPublicacao = dataInicioPublicacao;
	}

	public LocalDate getDataFimPublicacao() {
		return dataFimPublicacao;
	}

	public void setDataFimPublicacao(LocalDate dataFimPublicacao) {
		this.dataFimPublicacao = dataFimPublicacao;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Vaga.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("titulo='" + titulo + "'")
				.add("dataInicioPublicacao=" + dataInicioPublicacao)
				.add("dataFimPublicacao=" + dataFimPublicacao)
				.add("status=" + status)
				.add("nivel='" + nivel + "'")
				.add("descricao='" + descricao + "'")
				.add("salario=" + salario)
				.add("skillList=" + skillList)
				.add("candidatoList=" + candidatoList)
				.toString();
	}
}
