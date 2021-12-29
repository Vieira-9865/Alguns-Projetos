package programação;

public class Notebook {
	
	private int Identificador;
	private String Descriçao;
	private String Marca;
	private String HD;
	private String Processador;
	private double Memoria;
	private double Preço;
	
	
	
	
	public Notebook(String Descriçao, double preço) {
		this.setDescriçao(Descriçao);
		this.setPreço(preço);
	}
	// Construtor vazio public + nome da classe
	public Notebook() {
		// TODO Auto-generated constructor stub
	}

	public int getIdentificador() {
		return Identificador;
	}
	public void setIdentificador(int identificador) {
		Identificador = identificador;
	}
	public String getDescriçao() {
		return Descriçao;
	}
	public void setDescriçao(String descriçao) {
		Descriçao = descriçao;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getHD() {
		return HD;
	}
	public void setHD(String hD) {
		HD = hD;
	}
	public String getProcessador() {
		return Processador;
	}
	public void setProcessador(String processador) {
		Processador = processador;
	}
	public double getMemoria() {
		return Memoria;
	}
	public void setMemoria(double memoria) {
		Memoria = memoria;
	}
	public double getPreço() {
		return Preço;
	}
	public void setPreço(double preço) {
		Preço = preço;
	}

}
