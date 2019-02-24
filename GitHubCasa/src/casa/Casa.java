package casa;

public class Casa {
	protected float metros;
	protected String color;
	protected int piso;
	public float getMetros() {
		return metros;
	}
	public void setMetros(float metros) {
		this.metros = metros;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	//Construntor  asdasdsadasd asdasd
	public Casa(float metros, String color, int piso) {
		super();
		this.metros = metros;
		this.color = color;
		this.piso = piso;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
}
