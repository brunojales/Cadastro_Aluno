package br.com.cadastro_aluno;

import javax.swing.JOptionPane;

import br.com.cadastro_aluno.dao.AlunoDAO;
import br.com.cadastro_aluno.model.Aluno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Intancia os objetos
		Aluno aluno = new Aluno();
		AlunoDAO cadastro = new AlunoDAO();

		// Declaração de variaveis
		Object acaoEscolha;
		Object alteracaoEscolha;

		Object[] acaoOpcao = { "Cadastrar", "Pesquisar por Matricula", "Pesquisar por Nome", "Pesquisar por Sobrenome",
				"Sair" };
		Object[] alteracaoOpcao = { "Alterar Nome", "Alterar Sobrenome", "Alterar Email", "voltar" };

		do {
			// janela de escolha de ação do usuário
			acaoEscolha = JOptionPane.showInputDialog(null, "Escolha uma ação:", "Ação", JOptionPane.QUESTION_MESSAGE,
					null, acaoOpcao, acaoOpcao[4]);

			if (acaoEscolha == "Cadastrar") {
				// input dos dados
				aluno.setMatriculaAluno(JOptionPane.showInputDialog("Informe sua Matricula: "));
				aluno.setNome(JOptionPane.showInputDialog("Informe o primeiro nome:"));
				aluno.setSobrenome(JOptionPane.showInputDialog("Informe o sobrenome:"));
				aluno.setEmail(JOptionPane.showInputDialog("Informe seu e-mail:"));
				aluno.setClasseAluno(JOptionPane.showInputDialog("Informe a sua classe:"));

				// cadastra o Aluno no banco
				cadastro.cadastrar(aluno);

				// informa o sucesso do cadastro
				JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");

			} else if (acaoEscolha == "Pesquisar por Matricula") {
				//
				aluno.setMatriculaAluno(JOptionPane.showInputDialog("Informe sua Matricula a ser pesquisado: "));
				// repassa o objeto para o método de pesquisa
				cadastro.pesquisarMatricula(aluno);
				// exibe os dados na tela e armazena opcao na variavel
				alteracaoEscolha = JOptionPane.showInputDialog(null,
						"ID: " + aluno.getIdAluno() + ".\nMatrícula: " + aluno.getMatriculaAluno() + ".\nNome e Sobrenome: "
								+ aluno.getNome() + " " + aluno.getSobrenome() + ".\nE-mail: "
								+ aluno.getEmail() + ".\nClasse: " + aluno.getClasseAluno() + ".",
						"alteração Cadastral", JOptionPane.QUESTION_MESSAGE, null, alteracaoOpcao, alteracaoOpcao[1]);

				if (alteracaoEscolha == "Alterar Nome") {
					// recebe o nome a ser alterado
					aluno.setNome(JOptionPane.showInputDialog("Informe o novo nome:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarNome(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!!!");

				} else if (alteracaoEscolha == "Alterar Sobrenome") {
					// recebe o nome a ser alterado
					aluno.setSobrenome(JOptionPane.showInputDialog("Informe o novo sobrenome:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarSobrenome(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "Sobrenome alterado com sucesso!!!");

				} else if (alteracaoEscolha == "Alterar Email") {
					// recebe o nome a ser alterado
					aluno.setEmail(JOptionPane.showInputDialog("Informe o novo E-mail:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarEmail(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "E-mail alterado com sucesso!!!");

				}

			} else if (acaoEscolha == "Pesquisar por Nome") {
				//
				aluno.setNome(JOptionPane.showInputDialog("Informe o Nome a ser pesquisado: "));
				//
				cadastro.pesquisarNome(aluno);

				// exibe os dados na tela e armazena opcao na variavel
				alteracaoEscolha = JOptionPane.showInputDialog(null,
						"ID: " + aluno.getIdAluno() + ".\nMatrícula: " + aluno.getMatriculaAluno()
								+ ".\nNome e Sobrenome: " + aluno.getNome()+ " " + aluno.getSobrenome() + ".\nE-mail: "
								+ aluno.getEmail() + ".\nClasse: " + aluno.getClasseAluno() + ".",
						"alteração Cadastral", JOptionPane.QUESTION_MESSAGE, null, alteracaoOpcao, alteracaoOpcao[3]);

				if (alteracaoEscolha == "Alterar Nome") {
					// recebe o nome a ser alterado
					aluno.setNome(JOptionPane.showInputDialog("Informe o novo nome:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarNome(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!!!");

				} else if (alteracaoEscolha == "Alterar Sobrenome") {
					// recebe o nome a ser alterado
					aluno.setSobrenome(JOptionPane.showInputDialog("Informe o novo Sobrenome:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarSobrenome(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "E-mail alterado com sucesso!!!");

				} else if (alteracaoEscolha == "Alterar Email") {
					// recebe o nome a ser alterado
					aluno.setEmail(JOptionPane.showInputDialog("Informe o novo E-mail:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarEmail(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "E-mail alterado com sucesso!!!");
				}
				
			} else if (acaoEscolha == "Pesquisar por Sobrenome") {
				//
				aluno.setSobrenome(JOptionPane.showInputDialog("Informe o Sobrenome a ser pesquisado: "));
				//
				cadastro.pesquisarSobrenome(aluno);

				// exibe os dados na tela e armazena opcao na variavel
				alteracaoEscolha = JOptionPane.showInputDialog(null,
						"ID: " + aluno.getIdAluno() + ".\nMatrícula: " + aluno.getMatriculaAluno()
								+ ".\nNome e Sobrenome: " + aluno.getNome()+ " " + aluno.getSobrenome() + ".\nE-mail: "
								+ aluno.getEmail() + ".\nClasse: " + aluno.getClasseAluno() + ".",
						"alteração Cadastral", JOptionPane.QUESTION_MESSAGE, null, alteracaoOpcao, alteracaoOpcao[3]);

				if (alteracaoEscolha == "Alterar Nome") {
					// recebe o nome a ser alterado
					aluno.setNome(JOptionPane.showInputDialog("Informe o novo nome:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarNome(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!!!");

				} else if (alteracaoEscolha == "Alterar Sobrenome") {
					// recebe o nome a ser alterado
					aluno.setSobrenome(JOptionPane.showInputDialog("Informe o novo Sobrenome:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarSobrenome(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "E-mail alterado com sucesso!!!");

				} else if (alteracaoEscolha == "Alterar Email") {
					// recebe o nome a ser alterado
					aluno.setEmail(JOptionPane.showInputDialog("Informe o novo E-mail:"));
					// repassa os dados para o metodo alterar
					cadastro.alterarEmail(aluno);
					// exibe mesangem de sucesso
					JOptionPane.showMessageDialog(null, "E-mail alterado com sucesso!!!");

				} 

			}else {
				// informa que o programa se encerrou
				JOptionPane.showMessageDialog(null, "Aplicação encerrada!");

				// encerra a aplicação
				System.exit(0);
			}

		} while (acaoEscolha != "Sair");

	}

}
