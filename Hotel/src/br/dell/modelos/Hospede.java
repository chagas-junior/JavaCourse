package br.dell.modelos;

public class Hospede {
	private long CPF;
	private long RG;
	private String nome;
	private int idade;
	private String enderešo;
	
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getRG() {
		return RG;
	}
	public void setRG(long rG) {
		RG = rG;
	}
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public Hospede() {
	}
	public Hospede(long CPF, long RG, String nome, int idade, String enderešo) {
		this.CPF = CPF;
		this.RG = RG;
		this.nome = nome;
		this.idade = idade;
		this.enderešo = enderešo;
	}
}
