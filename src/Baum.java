import Prog1Tools.IOTools;

public class Baum {

	public static void main(String[] args) {

		int hoehe, i, j;
		String baum = "*", luft = " ";
		
		hoehe = IOTools.readInteger("Geben Sie Höhe ein: ");
		System.out.println();
		
		for (j = hoehe * 2 - 1; j >= 0; j = j - 2) {
			
			System.out.print(luft.repeat(j / 2 + 2));
			System.out.print(baum.repeat(hoehe * 2 - j));
			System.out.println();
			
		}
		
	}

}
