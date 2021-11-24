package br.com.cadastro_aluno.model;

public class Aluno {
	//Declaração de atributos
	private Long idAluno;
	private String matriculaAluno;
	private String nome;
	private String sobrenome;
	private String email;
	private String classeAluno;

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClasseAluno() {
		return classeAluno;
	}

	public void setClasseAluno(String classeAluno) {
		this.classeAluno = classeAluno;
	}

}
