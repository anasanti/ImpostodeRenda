package irpfnogocio;

import java.util.ArrayList;

public class Cadastro {

	private ArrayList<Pessoa> listaPessoas;
	
	public Cadastro(){
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
