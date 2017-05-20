package irpfnogocio;

import irpfnogocio.Pessoa;

public class Completa {
	
	private  static double desconto = 0;
	private  static double base = 0;

	public static void calculo(Pessoa pessoa) {
		
		base = (pessoa.getTotalRendimentos() - pessoa.getContribuicao());
				
		if (pessoa.getIdade() < 65){
			if (pessoa.getDependente() < 3){
				desconto = 2/100;
			}
			else if (pessoa.getDependente() > 2 && pessoa.getDependente() <6){
				desconto = 3.5/100;
			}
			else if (pessoa.getDependente() >5){
				desconto = 5/100;
			}
		}
		
		else if (pessoa.getIdade() > 64){
			if (pessoa.getDependente() < 3){
				desconto = 3/100;
			}
			else if (pessoa.getDependente() > 2 && pessoa.getDependente() < 6){
				desconto = 4.5/100;
			}
			else if (pessoa.getDependente() > 5){
				desconto = 6/100;
			}
		}
		
		calcular(pessoa);

	}
	
	public static double calcular(Pessoa pessoa){
		
		desconto = base * 0.05;
		double base = pessoa.getTotalRendimentos() - desconto;
				
		if (base <= 12000){
			return 0;
		}
		else if(base > 12000 && base <= 24000){
			return (base * 0.15) - desconto;
		}
		else{
			return (base * 0.275) - desconto;
		}
	}

}

