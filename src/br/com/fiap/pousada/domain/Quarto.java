package br.com.fiap.pousada.domain;

public class Quarto {
	private Integer numero;
	private Integer maxPessoas;
	private Double valorDiaria;
	
	public Quarto(Integer numero, Integer maxPessoas, Double valorDiaria) {
		this.numero = numero;
		this.maxPessoas = maxPessoas;
		this.valorDiaria = valorDiaria;
	}
	
	public Integer getNumero() {
		return numero;
	}
		
	public Integer getMaxPessoas() {
		return maxPessoas;
	}
	
	public Double getValorDiaria() {
		return valorDiaria;
	}
	
	@Override
	public String toString() {
		return String.format("Quarto Nro: %s -> { Categoria: %s, Max. Pessoas: %s, Valor Diária: R$ %.2f }", 
				numero, maxPessoas, valorDiaria);
	}
}
