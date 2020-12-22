import java.awt.*;
import java.awt.event.*;

	//1st step  
public class ActionListenerAwt implements ActionListener {
	static TextField tf;

	private void fenetre() {
		Frame f = new Frame("ActionListener Example");
		tf = new TextField();
		tf.setBounds(50, 50, 150, 20);
		Button b = new Button("Click Here");
		b.setBounds(50, 100, 60, 30);
		//2nd step  
		b.addActionListener(this);
		f.add(b);
		f.add(tf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new ActionListenerAwt().fenetre();
	}

		//3rd step  
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome to Javatpoint.");
	}
}