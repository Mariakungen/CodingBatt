/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
 * The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi
"Oberoende hur många bokstäver plocka ut de två sista och oberoende ord som kommer in*/


public class CodingBat {
	public static void main (String []args) {
	} //Är väl lite konstigt att sätta en måsvinge här, men en metod kan inte vara i en annan???
	public String calculateAnswer(String word) { 

		
		//System.out.println("Kärlek"); 
		
		//String word = "Kärlek";
		int ordLängd = word.length();
		System.out.println(ordLängd);
	
		
		char nästSista = word.charAt(word.length() -2);
		char allraSista = word.charAt(word.length() -1);		
		
		System.out.println(nästSista+""+allraSista+""+nästSista+""+allraSista+""+nästSista+""+allraSista);
		
		String calculateAnswer (String Kärlek); //å vad är fel här då??
		
		}
	}

