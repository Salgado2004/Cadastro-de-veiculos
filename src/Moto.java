
public class Moto extends Veiculo{
	
	String cadastro;


	public Moto(String modelo, String marca, String ano, String placa, String cor) {
		this.setAno_de_fabricacao(ano);
		this.setCor(cor);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPlaca(placa);
		String show = "Moto: " + this.getModelo() + " " + this.getAno_de_fabricacao() + " " + this.getMarca() + " " + this.getPlaca() + " " + this.getCor() + " ";
		
		this.setCadastro(show);
	}
		
	public String getCadastro() {
		return cadastro;
	}


	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	}
