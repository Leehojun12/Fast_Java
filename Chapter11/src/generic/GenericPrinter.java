package generic;

public class GenericPrinter<T extends Meterial> {

	private T meterial;

	public T getMaterial() {
		return meterial;
	}

	public void setMaterial(T material) {
		this.meterial = material;
	} 
	public String toString() {
		return meterial.toString();
	}
	public void printing() {
		meterial.doPrinting();
	}
}
