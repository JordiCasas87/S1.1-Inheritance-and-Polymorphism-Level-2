package n1excercici1nivel2Main;

import model.Smartphone;

public class N1excercici1nivel2 {

	public static void main(String[] args) {
	
		Smartphone nuevo1 = new Smartphone ("Nokia","3210Plus");
		System.out.println(nuevo1.toString());
		System.out.println();
		
		
		nuevo1.llamar("61522941");
		
		nuevo1.fotografiar();
		nuevo1.alarma();
			
		
	}

}
