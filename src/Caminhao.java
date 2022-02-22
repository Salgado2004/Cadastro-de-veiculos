
public class Caminhao extends Veiculo{

	
	String nDeEixos;
	String cadastro;
	

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public String getnDeEixos() {
		return nDeEixos;
	}

	public void setnDeEixos(String nDeEixos) {
		this.nDeEixos = nDeEixos;
	}
		
	public Caminhao(String modelo, String marca, String ano, String placa, String cor, String neixos) {
		this.setAno_de_fabricacao(ano);
		this.setCor(cor);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setnDeEixos(neixos);
		
String show = "Caminhão: " + this.getModelo() + " " + this.getAno_de_fabricacao() + " " + this.getMarca() + " " + this.getPlaca() + " " + this.getCor() + " " + this.getnDeEixos() + " ";
		
		this.setCadastro(show);
		
	}
	
	

}
