package Business;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	private int dependente;
	private double contribuicao;
	private double totalRendimentos;

	public Pessoa(String nome, String cpf, int idade, int dependente, double contribuicao, double totalRendimentos) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.dependente =  dependente;
		this.contribuicao = contribuicao;
		this.totalRendimentos = totalRendimentos;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getDependente(){
		return this.dependente;
	}
	
	public void setDependente(int dependente) {
		this.dependente = dependente;
	}

	public double getContribuicao() {
		return contribuicao;
	}

	public void setContribuicao(double contribuicao) {
		this.contribuicao = contribuicao;
	}

	public double getTotalRendimentos() {
		return totalRendimentos;
	}

	public void setTotalRendimentos(double totalRendimentos) {
		this.totalRendimentos = totalRendimentos;
	}
	
	
}
