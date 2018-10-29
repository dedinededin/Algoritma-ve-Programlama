
public class IfOrnegi {

	public static void main(String[] args) {
		System.out.println(5 == 5);
		System.out.println(10 != 11);
		System.out.println(3 < 6);
		System.out.println(10 > 100);
		
		//Donguyu break ile bitirmek
		int dongu = 0;
		
		while(true) {
			System.out.println("Dongu: " + dongu);
			
			if(dongu == 3) {
				break;
			}
			
			dongu++;
		
			System.out.println("Calisiyor");
		}
	}
}
