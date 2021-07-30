package _01_static_smiley_blues;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible
JFrame a = new JFrame();
a.setVisible(true);
		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Make a new JPanel
JPanel b = new JPanel();
		// 4. Add your panel to your frame
a.add(b);
		// 8. DO THIS LAST: 
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Using a specific object for a static variable works, but is not usually recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!
Smiley.setColor(Smiley.RED);
		// 5. Make three Smiley objects and add them to your panel
Smiley sm1 = new Smiley();
Smiley sm2 = new Smiley();
Smiley sm3 = new Smiley();



b.add(sm1);
b.add(sm2);
b.add(sm3);
		// 6. Pack your frame
a.pack();
		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
	}
}
