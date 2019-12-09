package entidades;

public class Empresa extends Pagante {

	private Integer numempreg;
	
	public Empresa() {
	}

	public Empresa(String nome, Double rendaanual, Integer numempreg) {
	  super(nome, rendaanual);
	  this.numempreg = numempreg;
	}

	public Integer getNumempreg() {
	  return numempreg;
	}

	public void setNumempreg(Integer numempreg) {
	  this.numempreg = numempreg;
	}
	
	@Override
	public double imposto() {
	  if (numempreg>10) {
	    return rendaanual*0.14;
	  }
	  if (numempreg<10) {
	    return rendaanual*0.16;
	  }
	  return imposto();
	}
	
}
