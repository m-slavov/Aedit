package org.aedit.generator;

public class Singleton {

	private static Singleton single_instance = null; 
	  
    // variable of type String 
    public String workspaceDir = "undefined"; 
  
    public String getWorkspaceDir() {
		return workspaceDir;
	}

	public void setWorkspaceDir(String workspaceDir) {
		this.workspaceDir = workspaceDir;
	}

	// private constructor restricted to this class itself 
    private Singleton() 
    { 
        
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
}
