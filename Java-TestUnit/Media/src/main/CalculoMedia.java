package QA.Media;

public class CalculoMedia {
	private double num1;
	private double num2;
	private double resul;
	

	public CalculoMedia () {}
	
	public CalculoMedia (double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.resul = ((this.num1+this.num2)/2);
		
	}
	
	public double media (double num1, double num2) {
		this.resul = ((num1 + num2)/2);
		return this.resul;
	}
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResul() {
		return resul;
	}

	public void setResul(double resul) {
		this.resul = resul ;
	}
}
