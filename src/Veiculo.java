public class Veiculo {
	
	String placa;
	String ano_de_fabricacao;
	String marca;
	String modelo;
	String cor;
		
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAno_de_fabricacao() {
		return ano_de_fabricacao;
	}
	public void setAno_de_fabricacao(String ano_de_fabricacao) {
		this.ano_de_fabricacao = ano_de_fabricacao;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String show = "\n" + this.getModelo() + "\n";
		show += this.getAno_de_fabricacao() + "\n";
		show += this.getMarca() + "\n";
		show += this.getPlaca() + "\n";
		show += this.getCor() + "\n";
		return show;
	}
	
	
	
}

