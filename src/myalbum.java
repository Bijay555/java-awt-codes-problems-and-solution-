import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



class myalbum extends JFrame  implements ActionListener
{

    ImageIcon m[];
    JLabel l;
    JButton b,b1,b2,b3;
    int i,l1;
    JPanel p;

    public myalbum()
    {
        setLayout(new BorderLayout( ));
        setSize(1000,1000);
        setVisible(true);
        JPanel p=new JPanel(new FlowLayout());
        b=new JButton("Prev");
        b1=new JButton("Next");
        b2=new JButton("END");
        b3=new JButton("START");
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        add(p,BorderLayout.SOUTH);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        m = new ImageIcon[3];

        m[0] = new ImageIcon("bj.jpg");
        m[1] = new ImageIcon("bj1.jpg");
        m[2] = new ImageIcon("bj2.jpg");
        l = new JLabel();
        l.setBounds(50, 0, getWidth(), getHeight());
        add(l,BorderLayout.CENTER);
        l.setIcon(null);

    }
    public  void actionPerformed(ActionEvent e)
    {


        if(e.getSource()==b3){
            try {
                Clip clip = AudioSystem.getClip();
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(myalbum.class.getResourceAsStream("bday00.wav"));
                clip.open(inputStream);
                clip.start();
            } catch (Exception eee) {
                System.err.println(eee.getMessage());
            }
            JOptionPane.showMessageDialog(null,"click next/prev to display");
            l.setIcon(m[0]);

        }
        if(e.getSource()==b2){

            JOptionPane.showMessageDialog(null,"END");
            l.setIcon(null);
        }
        if(e.getSource()==b)
        {
            if(i==0)
            {
                JOptionPane.showMessageDialog(null,"This is First Image");
            }
            else
            {
                i=i-1;
                l.setIcon(m[i]);
            }
        }
        if(e.getSource()==b1)
        {
            if(i==m.length-1)
            {
                JOptionPane.showMessageDialog(null,"This is LastImage");
            }
        else
            {
                i=i+1;
                l.setIcon(m[i]);
            }
        }

    }


    public static void main(String args[])
    {
        myalbum a1 = new myalbum();
    }


}

