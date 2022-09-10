package br.com.fiap.challenge.deumatch.model;

import java.util.StringJoiner;

public class Email {

	private int id;

	private String email;

	private char status;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Email.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("email='" + email + "'")
				.add("status=" + status)
				.toString();
	}
}
