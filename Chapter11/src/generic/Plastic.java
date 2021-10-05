package generic;

public class Plastic extends Meterial{

	public String toString() {
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
System.out.println("plastic으로 프린팅");		
	}
}
