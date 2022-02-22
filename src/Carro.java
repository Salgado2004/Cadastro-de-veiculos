
public class Carro extends Veiculo{

	
	String nDePortas;
	String cadastro;

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public String getnDePortas() {
		return nDePortas;
	}

	public void setnDePortas(String nDePortas) {
		this.nDePortas = nDePortas;
	}
		
	public Carro(String modelo, String marca, String ano, String placa, String cor, String nportas) {
		this.setAno_de_fabricacao(ano);
		this.setCor(cor);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setnDePortas(nportas);
		
		String show = "Carro: " + this.getModelo() + " " + this.getAno_de_fabricacao() + " " + this.getMarca() + " " + this.getPlaca() + " " + this.getCor() + " " + this.getnDePortas() + " ";
		
		this.setCadastro(show);
	}
	

}
