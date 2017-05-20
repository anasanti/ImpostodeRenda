package irpfnogocio;

public class Simplificada {

	public static double calcular(Pessoa pessoa) {
		
		double base = (pessoa.getTotalRendimentos() - pessoa.getContribuicao());
		double desconto = base * 0.05;
		double baseDesconto = pessoa.getTotalRendimentos() - desconto;

		if (baseDesconto <= 12000) {
			return 0;
		} else if (baseDesconto > 12000 && baseDesconto <= 24000) {
			return baseDesconto * 0.15;
		} else {
			return baseDesconto * 0.275;
		}
	}
}
