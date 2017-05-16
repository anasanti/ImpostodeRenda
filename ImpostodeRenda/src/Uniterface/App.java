package Uniterface;

import java.util.Scanner;

import Business.Cadastro;
import Business.Completa;
import Business.Pessoa;
import Business.Simplificada;
import Persistence.*;

public class App {

	public static void Menu() {

		System.out.println("---Menu---\n");
		System.out.println("1 - Cadastro\n");
		System.out.println("2 - Declaração Simplificada\n");
		System.out.println("3 - Declaração Completa\n");
		System.out.println("0 - Fechar e Registrar \n");
		System.out.println("Opção: ");
	}

	public static void main(String Args[]) throws Exception {
		
		String cpfPesquisa;
		Pessoa pe;
		Cadastro cad = new Cadastro();
		double resultado = 0;
		Scanner in = new Scanner(System.in);

		String opt;
		do {
			Menu();

			opt = in.nextLine();

			switch (Integer.parseInt(opt)) {
			case 1:

				System.out.println("Informe seu nome: ");
				String nome = in.nextLine();

				System.out.println("Informe seu CPF: ");
				String cpf = in.nextLine();

				System.out.println("Informe sua idade: ");
				String idade = in.nextLine();

				System.out.println("Informe a quantidade de dependentes: ");
				String dependente = in.nextLine();

				System.out.println("Informe sua contribuição previdenciaria oficial: ");
				String contribuicao = in.nextLine();

				System.out.println("Informe seu rendimento total: ");
				String totalRendimentos = in.nextLine();

				cad.adicionar(new Pessoa(nome, cpf, Integer.parseInt(idade), Integer.parseInt(dependente),
							  Double.parseDouble(contribuicao), Double.parseDouble(totalRendimentos)));
				break;

			case 2:
				System.out.println("Informe o CPF:");
				cpfPesquisa = in.nextLine();
				pe = cad.consultaCPF(cpfPesquisa);
				System.out.println(Simplificada.calcular(pe));
				break;

			case 3:
				System.out.println("Informe o CPF:");
				cpfPesquisa = in.nextLine();
				pe = cad.consultaCPF(cpfPesquisa);
				System.out.println(Completa.calcular(pe));
				break;
			}
			
			System.out.println("Para voltar ao menu digite 1, para fechar digite 0");
			opt = in.nextLine();

		} while (Integer.parseInt(opt) != 0);

		System.out.println("Total à pagar: ");
		System.out.println(resultado);

	}

	private static double completa(double contribuicao, double totalRendimento) {
		// TODO Auto-generated method stub
		return 0;
	}

}
