package entidades;

public class Individual extends Pagante {

	private Double despsaude;
	
	public Individual() {
	}

	public Individual(String nome, Double rendaanual, Double despsaude) {
	   super(nome, rendaanual);
	   this.despsaude = despsaude;
	}

	public Double getDespsaude() {
	   return despsaude;
	}

	public void setDespsaude(Double despsaude) {
	   this.despsaude = despsaude;
	}
	
	@Override
	public double imposto() {
	  if (rendaanual>20000 && despsaude>0) {
	    return (rendaanual*0.25) - (despsaude*0.5);
	  }
	  if (rendaanual<20000 && despsaude>0) {
	    return (rendaanual*0.15) - (despsaude);
	  }
	  return imposto();
	}
	
	
}
