package Persistence;


import java.util.ArrayList;

import Business.Pessoa;

public class PessoasDAO {
	
	private ArrayList<Pessoa> listaPessoas;
	
	public PessoasDAO(){
		listaPessoas = new ArrayList<>();
	}
	
	public void adicionar(Pessoa pessoa){
		listaPessoas.add(pessoa);
	}
	
	public Pessoa consultaCPF(String cpf) throws Exception{
		ArrayList<Pessoa> aux = listaPessoas;
		
		for(Pessoa p : aux){
			if(cpf.equals(p.getCPF())){
				return p;
			}
		}
		throw new Exception("Pessoa não cadastrada");
	}

}
