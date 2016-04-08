package mme;

import javax.swing.SwingUtilities;

public class MMEGUI {
	
	public static void main(String[] args){
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new Frame();
			}
			
		});
		
	}
	
}
