import java.awt.*;  
import java.awt.event.*;  
//1st step  
public class ActionListenerAwt implements ActionListener{  
public static void main(String[] args) {  
    Frame f=new Frame("ActionListener Example");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  
    //2nd step  
    b.addActionListener(this);
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);
    tf.setText("Welcome to Javatpoint.");

}  
//3rd step  
public void actionPerformed(ActionEvent e){

}  
}  