public class ISBN10 {
	public static void main(String[] args) {
		System.out.print("Bitte geben Sie die ISBN an: ");
		int a = StdIn.readInt();
		int q = 12;
		int g = 0; //gewichtete Quersumme
		
		if (a / 999999999 > 0) {
			String l = "" + a;
			String n = "";
			for (int i = 0; i != 9; i++) { 
				n += l.charAt(i);
				}
			
			a = Integer.parseInt(n);
			}
			
		System.out.println("Ihre Eingabe lautet: " + a);
		
		//Gewichtete Quersumme
		while (a != 0) {
			g += a % 10;
			a = (a - (a % 10)) / 10;
			}
	
		
		
		System.out.println("Gewichtete Quersumme: " + g);
			
		
		//Berechnung iterierten alternierenden QUersumme
		
		while (q >= 11) {	//Iteriert
			q = 0;
		 	while (g != 0) {	//alternierend
				q += g % 10;
				g = (g- (g % 10)) / 10;
				g *= -1;
				}
			g = q;
			}
		
		while (q < 0)
			q += 11;
		
			
			
		if (q == 10)
			System.out.println("Die Prüfziffer ist X");
		else 
			System.out.println("Die Prüfziffer ist " + q);
			
		
	}
}		
