import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI extends JFrame implements ActionListener{
  JButton  btnClear,btnEn, btnDe;
  JTextField txtIn, txtOut;
  JLabel lblEn, lblDe;
  
  public GUI()
  {
    super("Super Spy Encryption");

    btnClear = new JButton("Clear");
    btnEn = new JButton("Encrypt");
    btnDe = new JButton("Decrypt");

    btnClear.addActionListener(this);
    btnEn.addActionListener(this);
    btnDe.addActionListener(this);

    txtIn = new JTextField(50);
    txtOut = new JTextField(50);
    //asks user for message
    lblEn = new JLabel("Type the Message to Encrypt Here:");
    lblDe = new JLabel("Type the Message to Decrypt Here:");

    setLayout(new GridLayout(7,1));
    add(lblEn);
    add(txtIn);
    add(lblDe);
    add(txtOut);
    add(btnEn);
    add(btnDe);
    add(btnClear);

    
    setSize(350,350);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==btnEn)
    {
    String message = txtIn.getText();
    String encoded = Encrypt.encrypt(message);
      //displays encrypted code
      txtOut.setText(encoded);
      }
    else if (e.getSource()==btnDe)
    {
      String mes = txtOut.getText();
      String enc = Encrypt.decrypt(mes);
      //displays decrypted code
      txtIn.setText(enc);
    }
    else if (e.getSource()==btnClear)
    {
      //Clears text box
      txtIn.setText("");
      txtOut.setText("");
    }
  }
  public static void main(String[] args) {
   new Main();
    
  }
}