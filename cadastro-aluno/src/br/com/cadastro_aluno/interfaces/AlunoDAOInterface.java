package br.com.cadastro_aluno.interfaces;

import br.com.cadastro_aluno.model.*;


public interface AlunoDAOInterface {
	
	public void cadastrar(Aluno aluno);
	
	public void pesquisarMatricula(Aluno aluno);

	public void pesquisarNome(Aluno aluno);

	public void pesquisarSobrenome(Aluno aluno);

	public void alterarNome(Aluno aluno);
	
	public void alterarSobrenome(Aluno aluno);

	public void alterarEmail(Aluno aluno);

}
