package entidades;

public abstract class Pagante {

	private String nome;
	protected Double rendaanual;
	
	public Pagante() {
	  super();
	}

	public Pagante(String nome, Double rendaanual) {
	  this.nome = nome;
	  this.rendaanual = rendaanual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaanual() {
		return rendaanual;
	}

	public void setRendaanual(Double rendaanual) {
		this.rendaanual = rendaanual;
	}
	
	public abstract double imposto();
		
}
