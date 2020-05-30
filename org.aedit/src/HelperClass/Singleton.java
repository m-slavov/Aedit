package HelperClass;

public final class Singleton {

	private static Singleton INSTANCE;
	private String input = "";
	private String output = "";

	private Singleton() {        
	    }

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}

		return INSTANCE;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	

}
