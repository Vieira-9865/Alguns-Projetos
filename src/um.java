
public class um implements operacoes {

	
	double num = 0;
	double num2 = 0;
	double res = 0;
	
	
	public double getNum() {
		return num;
	                    }

	public void setNum(double num) {
		this.num = num;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}
	
	

	public double Somar() {
		res = num + num2;
		return(res);
	}
	
	public double Diminuir() {
		res = num - num2;
		return(res);
	}
	
	public double Dividir() {
		res = num/num2;
		return(res);
	}
	
	public double Multiplicar() {
		res = num * num2;
		return(res);
	}
	
	
}
