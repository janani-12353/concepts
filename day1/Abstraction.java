package week3.day1;

public class Abstraction extends MultipleLangauge implements Language,TestTool{
	public static void main(String[] args) {
		Abstraction auto = new Abstraction();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.Python();
		
	
	}

	public void Selenium() {
		System.out.println("selenium code");
		
	}


	public void Java() {
		System.out.println("java code");
		
	}
	public void ruby() {
		System.out.println("ruby language");
	}

}

