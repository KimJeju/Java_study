package called_java_book;

public class MyBook {

	public static void main(String[] args) {
	
		JavaBook artOfComputerProgramming = new JavaBook();
		JavaBook EffectiveJava = new JavaBook();
		JavaBook cleanCode = new JavaBook();
		
		
		artOfComputerProgramming.MyBook();
		EffectiveJava.MyBook();
		cleanCode.MyBook();
		
		
		artOfComputerProgramming.noOfCopies = 10;
		EffectiveJava.noOfCopies = 5;
		cleanCode.noOfCopies = 7;
	}

}
