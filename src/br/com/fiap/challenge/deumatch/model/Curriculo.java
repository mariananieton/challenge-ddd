package br.com.fiap.challenge.deumatch.model;

import java.util.List;
import java.util.StringJoiner;

public class Curriculo {

	private int id;

	private String nivel;

	private List<Skill> skillList;

	private String experienciaProfissional;

	private String formacaoAcademica;

	private double pretensaoSalarial;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	public String getExperienciaProfissional() {
		return experienciaProfissional;
	}

	public void setExperienciaProfissional(String experienciaProfissional) {
		this.experienciaProfissional = experienciaProfissional;
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public double getPretensaoSalarial() {
		return pretensaoSalarial;
	}

	public void setPretensaoSalarial(double pretensaoSalarial) {
		this.pretensaoSalarial = pretensaoSalarial;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Curriculo.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("nivel='" + nivel + "'")
				.add("skillList=" + skillList)
				.add("experienciaProfissional='" + experienciaProfissional + "'")
				.add("formacaoAcademica='" + formacaoAcademica + "'")
				.add("pretensaoSalarial=" + pretensaoSalarial)
				.toString();
	}
}
