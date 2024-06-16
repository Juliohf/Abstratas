package entities;

public class Fisica extends Contribuinte {

	private Double gastos;
	

	public Fisica() {
		super();
	}

	public Fisica(String nome, Double renda, Double gastos) {
		super(nome, renda);
		this.gastos = gastos;
	}

	public Double getGastos() {
		return gastos;
	}


	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}


	@Override 
	public Double imppago() {
		double imppago;
		if(getRenda() < 20000) {
			imppago = getRenda()* 0.15;
		}
		else {
			imppago = getRenda()* 0.25;
		}
		return imppago - getGastos() * 0.5;
	}
	

}
