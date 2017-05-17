package Business;

import Persistence.PessoasDAO;

public class Cadastro {

	private PessoasDAO pessoaDAO;
	
	public Cadastro(){
		pessoaDAO = new PessoasDAO();
	}
	
	public void adicionar(Pessoa pessoa){
		pessoaDAO.adicionar(pessoa);
	}
	
	public Pessoa consultaCPF(String cpf) throws Exception{
		return pessoaDAO.consultaCPF(cpf);
	}
}
