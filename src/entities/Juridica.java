package entities;

public class Juridica extends Contribuinte {
	
	public int funcionarios;



	public Juridica(String nome, Double renda, int funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override 
	public Double imppago() {
		if(funcionarios > 10) {
			return  getRenda() * 0.14;
		}
		else {
			return getRenda() * 0.16;
		}

	}
}
