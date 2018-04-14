package src;

import mc302ef.GerenciadorAlunos;
import java.util.ArrayList;

// ...
	public static void testaInclusaoAlunos() {
		/*
		 * Leitura de informação de alunos e suas instanciações.
		 */
		ArrayList<String[]> infoAlunos = GerenciadorAlunos.getListaAlunos();
		String vinculo, nome, cpf;
		int curso;
		
		for (String[] campo : infoAlunos) {
			vinculo = campo[GerenciadorAlunos.I_VINCULO];
			nome    = campo[GerenciadorAlunos.I_NOME];
			cpf     = campo[GerenciadorAlunos.I_CPF];
			curso   = Integer.parseInt( campo[GerenciadorAlunos.I_CURSO] );
			
			// ####### Print ilustrativo. TODO: Remover na versão final. #######
			System.out.println(											    // #
					"Vínculo: "  + vinculo + ".\n"     + 				    // #		
					"Nome: "     + nome      + ". CPF: " + cpf + ".\n" +	// #
					"Curso: "    + curso     + ".");						// #
			// #################################################################
			
			if (vinculo.equalsIgnoreCase(GerenciadorAlunos.GRADUACAO) ) {
				// TODO: Instanciar aluno de graduação.
				// TODO: Imprimir informações com método 'imprimeDados()'
				
				System.out.println("########## Fim Graduacao"); // TODO: Remover esta linha de print.
			} else {
				/*
				 * Utilize:
				 * 		'campo[GerenciadorAlunos.I_QUALIFICADO]' e
				 * 		'campo[GerenciadorAlunos.I_INGLES_APROVADO]'
				 * para obter informações sobre o estado da qualificação e da comprovação de proeficiência em inglês
				 * dos alunos de pós-graduação.
				 */
				
				// ############### Print ilustrativo. TODO: Remover na versão final. ###############
				System.out.println(																// #
					"qualificado? "  + campo[GerenciadorAlunos.I_QUALIFICADO]     + ".\n" +     // #
					"proeficiente? " + campo[GerenciadorAlunos.I_INGLES_APROVADO] + ".");	    // #
				// #################################################################################
			
				if (vinculo.equalsIgnoreCase(GerenciadorAlunos.MESTRADO) ) {
					// TODO: Instanciar aluno de mestrado e alterar informações de qualificação e proeficiência em inglês.
					// TODO: Imprimir informações com método 'imprimeDados()'
					
					System.out.println("########## Fim Mestrado"); // TODO: Remover esta linha de print.
				} else if (vinculo.equalsIgnoreCase(GerenciadorAlunos.DOUTORADO) ) {
					// TODO: Instanciar aluno de doutorado e alterar informações de qualificação e proeficiência em inglês.
					// TODO: Imprimir informações com método 'imprimeDados()'
					
					System.out.println("########## Fim Doutorado"); // TODO: Remover esta linha de print.
				}
			}
			
		}
	}
	
	public static void testaInscricaoEmDisciplinas() {
		ArrayList<String[]> infoAlunos = GerenciadorAlunos.getDisciplinasPorCpfAluno();
		
		String cpfAluno;
		int idDisciplina;
		
		for (String[] params : infoAlunos) {
			/*
			 * Ordem dos parametros:
			 * 		cpf,dis1,disc2,...,discN
			 * TODO: Remover print de 'info'
			 */
			cpfAluno = params[0];
			String info = "CPF:" + cpfAluno + " [";
			
			for (int i = 1; i < params.length; i++) {
				idDisciplina = Integer.parseInt(params[i]);
				// TODO: Vincular aluno e disciplina
				
				// Print apenas para facilitar entendimento, deve ser retirado
				info += idDisciplina;
				if (i < params.length - 1) {
					info += ", ";
				} else {
					info += "]";
				}
			}
			System.out.println(info);
		}
		
	}
// ...
