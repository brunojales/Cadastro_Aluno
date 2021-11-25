package br.com.cadastro_aluno.dao;

import java.sql.*;

import br.com.cadastro_aluno.ConexaoBanco;
import br.com.cadastro_aluno.interfaces.AlunoDAOInterface;
import br.com.cadastro_aluno.model.Aluno;

public class AlunoDAO extends Aluno implements AlunoDAOInterface {
	//atributos
	private Connection conn;
	
	public AlunoDAO() {
	this.conn = new ConexaoBanco().ConexaoMYSQL();	
	}

	@Override
	public void cadastrar(Aluno aluno) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO tb_aluno (matricula_usuario, nome, sobrenome, email, classe_aluno) VALUES (?,?,?,?,?)";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);

			// repassa os valores para a consulta SQL
			stmt.setString(1, aluno.getMatriculaAluno());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3, aluno.getSobrenome());
			stmt.setString(4, aluno.getEmail());
			stmt.setString(5, aluno.getClasseAluno());

			// executa a query
			stmt.execute();

			// fecha o objeto
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void pesquisarMatricula(Aluno aluno) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tb_aluno WHERE matricula_usuario = ?";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);

			// repassa os valores para a consulta SQL
			stmt.setString(1, aluno.getMatriculaAluno());

			// executa a consulta SQL
			ResultSet resultado = stmt.executeQuery();

			// retorna o resultado e repassa para o objeto usuario
			while (resultado.next()) {
				aluno.setIdAluno(resultado.getLong(1));
				aluno.setMatriculaAluno(resultado.getString(2));
				aluno.setNome(resultado.getString(3));
				aluno.setSobrenome(resultado.getString(4));
				aluno.setEmail(resultado.getString(5));
				aluno.setClasseAluno(resultado.getString(6));
			}
			// encerra os objetos
			resultado.close();
			stmt.close();

		} catch (SQLException e) {
			// retorna erro caso método não seja executado
			throw new RuntimeException(e);
		}

	}

	@Override
	public void pesquisarNome(Aluno aluno) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tb_aluno WHERE nome = ?";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);

			// repassa os valores para a consulta SQL
			stmt.setString(1, aluno.getNome());

			// executa a consulta SQL
			ResultSet resultado = stmt.executeQuery();

			// retorna o resultado e repassa para o objeto usuario
			while (resultado.next()) {
				aluno.setIdAluno(resultado.getLong(1));
				aluno.setMatriculaAluno(resultado.getString(2));
				aluno.setNome(resultado.getString(3));
				aluno.setSobrenome(resultado.getString(4));
				aluno.setEmail(resultado.getString(5));
				aluno.setClasseAluno(resultado.getString(6));
			}
			// encerra os objetos
			resultado.close();
			stmt.close();

		} catch (SQLException e) {
			// retorna erro caso método não seja executado
			throw new RuntimeException(e);
		}

	}

	@Override
	public void pesquisarSobrenome(Aluno aluno) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tb_aluno WHERE sobrenome = ?";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);

			// repassa os valores para a consulta SQL
			stmt.setString(1, aluno.getSobrenome());

			// executa a consulta SQL
			ResultSet resultado = stmt.executeQuery();

			// retorna o resultado e repassa para o objeto usuario
			while (resultado.next()) {
				aluno.setIdAluno(resultado.getLong(1));
				aluno.setMatriculaAluno(resultado.getString(2));
				aluno.setNome(resultado.getString(3));
				aluno.setSobrenome(resultado.getString(4));
				aluno.setEmail(resultado.getString(5));
				aluno.setClasseAluno(resultado.getString(6));
			}
			// encerra os objetos
			resultado.close();
			stmt.close();

		} catch (SQLException e) {
			// retorna erro caso método não seja executado
			throw new RuntimeException(e);
		}

	}

	@Override
	public void alterarNome(Aluno aluno) {
		// TODO Auto-generated method stub
		String sql = "UPDATE tb_aluno SET nome = ? WHERE id_aluno = ?";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			// repassa os valores para a consulta sql
			stmt.setString(1, aluno.getNome());
			stmt.setLong(2, aluno.getIdAluno());
			// executa a consulta sql
			stmt.execute();
			// fecha o objeto da consulta
			stmt.close();

		} catch (SQLException e) {
			// retorna erro caso método não seja executado
			throw new RuntimeException(e);
		}

	}

	@Override
	public void alterarSobrenome(Aluno aluno) {
		// TODO Auto-generated method stub
		String sql = "UPDATE tb_aluno SET sobrenome = ? WHERE id_aluno = ?";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			// repassa os valores para a consulta sql
			stmt.setString(1, aluno.getSobrenome());
			stmt.setLong(2, aluno.getIdAluno());
			// executa a consulta sql
			stmt.execute();
			// fecha o objeto da consulta
			stmt.close();

		} catch (SQLException e) {
			// retorna erro caso método não seja executado
			throw new RuntimeException(e);
		}

	}

	@Override
	public void alterarEmail(Aluno aluno) {
		// TODO Auto-generated method stub
		String sql = "UPDATE tb_aluno SET email = ? WHERE id_aluno = ?";

		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			// repassa os valores para a consulta sql
			stmt.setString(1, aluno.getEmail());
			stmt.setLong(2, aluno.getIdAluno());
			// executa a consulta sql
			stmt.execute();
			// fecha o objeto da consulta
			stmt.close();

		} catch (SQLException e) {
			// retorna erro caso método não seja executado
			throw new RuntimeException(e);
		}

	}@Override
	public void excluir(Aluno aluno) {
		String sql = "DELETE FROM tb_aluno WHERE id_aluno = ?";
		
		try {
			// declara variável do tipo Preapred Statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			// repassa os valores para a consulta sql
			stmt.setLong(1, aluno.getIdAluno());
			// executa a consulta sql
			stmt.execute();
			// fecha o objeto da consulta
			stmt.close();

		} catch (SQLException e) {
			// retorna erro caso método não seja executado
			throw new RuntimeException(e);
		}
	}

}
