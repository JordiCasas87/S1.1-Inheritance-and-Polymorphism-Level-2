package n1excercici1nivel2Main;

import model.Smartphone;
import model.Telephone;

public class N1excercici1nivel2 {

	public static void main(String[] args) {
	
		Smartphone new1 = new Smartphone ("Nokia","3210Plus");
		System.out.println(new1.toString());    //check.
		System.out.println();
		
		
		new1.call("61522941");
		new1.shoot();
		new1.alarm();

		
	}

}
