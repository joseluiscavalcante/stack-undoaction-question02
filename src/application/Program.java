package application;

import java.util.Locale;

import entities.User;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		User user = new User("Cavalcante");
		
		user.performAction("A1");
		user.performAction("B2");
		user.performAction("C3");
		user.performAction("D4");
		user.performAction("E5");
		user.performAction("F6");
		user.performAction("G7");
		user.performAction("H8");
		user.performAction("I9");
		user.performAction("J10");
		user.performAction("K11");
		user.performAction("L12");
		user.performAction("M13");
		user.performAction("N14");
		user.performAction("O15");
		user.performAction("P16");
		user.performAction("Q17");
		
		user.DisplayPerformedActions();
		
		System.out.println("-----------------");
		
		user.undoAction(15);
		user.DisplayPerformedActions();
	}

}
