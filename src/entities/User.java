package entities;

import exception.OutOfBoundsException;
import utilities.MyStack;

public class User {
	private String name;
	private MyStack<Action> stackActions;

    public User(String name) {
    	this.name = name;
    	stackActions = new MyStack<>();
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void performAction(String description) {
    	Action action = new Action(description);
    	stackActions.push(action);
    }

    public void undoAction(int quantity) {
    	if (quantity <= 16 && quantity > 0) {
    		for(int i = 0; i < quantity; i++ ) {
    			stackActions.pop();
        	}
    	} else {
    		throw new OutOfBoundsException();
    	}
    }
	
    public void DisplayPerformedActions() {
    	System.out.println(stackActions);
    }
}
