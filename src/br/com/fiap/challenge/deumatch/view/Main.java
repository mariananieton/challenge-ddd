package br.com.fiap.challenge.deumatch.view;

import br.com.fiap.challenge.deumatch.dao.CandidatoDao;
import br.com.fiap.challenge.deumatch.dao.VagaDao;
import br.com.fiap.challenge.deumatch.model.Candidato;
import br.com.fiap.challenge.deumatch.model.Vaga;

import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

	private static final CandidatoDao candidatoDao = new CandidatoDao();
	private static final VagaDao vagaDao = new VagaDao();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		listarOpcoes();
		while (scanner.hasNext()) {
			int option = scanner.nextInt();
			switch (option) {
				case 1:
					Candidato candidato = CandidatoView.criarCandidato();
					candidatoDao.cadastrar(candidato);
					querContinuar();
					break;
				case 2:
					List<Candidato> candidatoList = candidatoDao.consultarTodos();
					CandidatoView.listarCandidatos(candidatoList);
					querContinuar();
					break;
				case 3:
					Vaga vaga = VagaView.criarVaga();
					vagaDao.cadastrar(vaga);
					querContinuar();
					break;
				case 4:
					List<Vaga> vagaList = vagaDao.consultarTodos();
					VagaView.listarVagas(vagaList);
					querContinuar();
					break;
				case 0:
					System.out.println("Finalizando sessão");
					return;
			}
			listarOpcoes();
		}
	}

	private static void querContinuar() {
		System.out.println("Deseja continuar? (1 -> Sim / 2 -> Não)");
		Scanner scanner = new Scanner(System.in);
		if (scanner.nextInt() == 2) {
			System.exit(500);
		}
	}

	private static void listarOpcoes() {
		System.out.println("Selecione a opção desejada: ");
		StringJoiner options = new StringJoiner("\n");
		options.add("---------------------------");
		options.add("1 - Cadastrar Candidato.");
		options.add("2 - Listar Candidatos.");
		options.add("3 - Cadastrar Vaga.");
		options.add("4 - Listar Vagas.");
		options.add("0 - Sair.");
		options.add("---------------------------");
		System.out.println(options);
	}

}
