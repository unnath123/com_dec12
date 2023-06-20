package gui;

import comp_decomp.compressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class appframe extends JFrame implements ActionListener {

    JButton compressorButton;
    JButton decompressorButton;

    appframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        compressorButton  = new JButton("select file to be compressed");
        compressorButton.setBounds(100, 200, 200, 30);
        compressorButton.addActionListener(this);

        decompressorButton=new JButton("Select the file to be decompressed");
        decompressorButton.setBounds(250, 10, 200, 100);
        decompressorButton.addActionListener(this);

        this.add(compressorButton);
        this.add(decompressorButton) ;
        this.setSize(1000,5000);
        (this.getContentPane()).setBackground(Color.black);
        this.setVisible(true) ;
    }

   @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compressorButton){
            JFileChooser fileChooser= new JFileChooser();
             int response= fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
        if(e.getSource()==decompressorButton){
            JFileChooser fileChooser= new JFileChooser();
            int response= fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }

}
