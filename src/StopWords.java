
        import java.io.File;
        import java.io.FileOutputStream;
        import java.io.PrintStream;
        import java.util.Scanner;
        import java.awt.*;
        import java.awt.event.*;
        import java.awt.Desktop;



class AwtControl {

    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    public AwtControl(){
        GUI();
    }

    void GUI(){
        mainFrame = new Frame("Stop Words");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent windowEvent){
                        System.exit(0);
                    }
                } );
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);


        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);

        mainFrame.setVisible(true);
    }

    void showFileDialog(){


        final FileDialog fileDialog = new FileDialog(mainFrame,"Select file");
        Button showFileDialogButton = new Button("Open File");





        showFileDialogButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                fileDialog.setVisible(true);
                statusLabel.setText("File Selected :" + fileDialog.getDirectory() + fileDialog.getFile());
                headerLabel.setText("Stop Words");
                headerLabel.setText("All the changes are stored in result.txt");
                Button Result = new Button("Result");
                controlPanel.add(Result);
                Result.addActionListener(new ActionListener()
                {
                    @Override

                    public void actionPerformed(ActionEvent e)
                    {
                        try
                        {
                            File file = new File("result.txt");
                            Desktop.getDesktop().open(file);
                        }

                        catch(Exception file)

                        {

                        }


                    }
                    //End of the Function
                });

                try
                {
                    Scanner scan =new Scanner(new File(fileDialog.getFile()));
                    String[] stopWrds={"is","this","a","that"};
                    FileOutputStream out= new FileOutputStream("result.txt");
                    while(scan.hasNext())
                    {
                        int flag=1;
                        String s1= scan.next();
                        s1=s1.toLowerCase();
                        for(int i=0;i<stopWrds.length;i++)
                        {
                            if(s1.equals(stopWrds[i]))
                            {
                                flag=0;
                            }
                        }
                        if(flag!=0)
                        {
                            PrintStream p=new PrintStream(out);
                            p.print(s1 + " ");
                            System.out.println("\n");
                        }
                    }
                }
                catch(Exception a)
                {
                    System.err.println();
                }
            }
            //End of the Function
        });


        controlPanel.add(showFileDialogButton);

        mainFrame.setVisible(true);
    }
}






class StopWords
{
    public static void main(String[] args)
    {





        AwtControl  awtControl = new AwtControl();
        awtControl.showFileDialog();



    }

}

