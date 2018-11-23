//Sinan Karabocuoglu 
//29 January 2018 
//BigTable
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class BigTable extends JPanel
{
  Zone button1, button2,button3,button4,button5,button6,button7,button8,button9;
  String sign = "";//sign of X or O
  public BigTable()
  {
    JPanel panel = new JPanel(new GridLayout(3,3));
    //creates the zones of the big game
    button1 = new Zone(1);
    button1.setEnabled(false);
    panel.add(button1);
    button2 = new Zone(2);
    button2.setEnabled(false);
    panel.add(button2);
    button3 = new Zone(3);
    button3.setEnabled(false);
    panel.add(button3);
    button4 = new Zone(4);
    button4.setEnabled(false);
    panel.add(button4);
    button5 = new Zone(5);
    button5.setEnabled(false);
    panel.add(button5);
    button6 = new Zone(6);
    button6.setEnabled(false);
    panel.add(button6);
    button7 = new Zone(7);
    button7.setEnabled(false);
    panel.add(button7);
    button8 = new Zone(8);
    button8.setEnabled(false);
    panel.add(button8);
    button9 = new Zone(9);
    button9.setEnabled(false);
    panel.add(button9);
    //_________________________________
    JLabel label = new JLabel("Big Table");
    this.add(label, BorderLayout.NORTH);
    this.add(panel, BorderLayout.SOUTH);                           
  }
  //------------checks cross win-------------
  public boolean crossWin()
  {
    if(((button1.getText().equals("X"))&&(button5.getText().equals("X"))&&(button9.getText().equals("X")))||((button1.getText().equals("O"))&&(button5.getText().equals("O"))&&(button9.getText().equals("O"))))
    {sign =button1.getText(); return true;}
    else if(((button3.getText().equals("X"))&&(button5.getText().equals("X"))&&(button7.getText().equals("X")))||((button3.getText().equals("O"))&&(button5.getText().equals("O"))&&(button7.getText().equals("O"))))
    {sign = button3.getText(); return true;}
    else
    {return false;}
  }
  //-----------------------------------------
  //checks the horizontal win
  public boolean horizontalWin()
  {
    if(((button1.getText().equals("X"))&&(button2.getText().equals("X"))&&(button3.getText().equals("X")))||((button1.getText().equals("O"))&&(button2.getText().equals("O"))&&(button3.getText().equals("O"))))
    {sign =button1.getText(); return true;}
    else if(((button4.getText().equals("X"))&&(button5.getText().equals("X"))&&(button6.getText().equals("X")))||((button4.getText().equals("O"))&&(button5.getText().equals("O"))&&(button6.getText().equals("O"))))
    {sign =button4.getText(); return true;}
    else if(((button7.getText().equals("X"))&&(button8.getText().equals("X"))&&(button9.getText().equals("X")))||((button7.getText().equals("O"))&&(button8.getText().equals("O"))&&(button9.getText().equals("O"))))
    {sign = button7.getText(); return true;}
    else{return false;}
  }
  //checks the vertical win
  public boolean verticalWin()
  {
    if(((button1.getText().equals("X"))&&(button4.getText().equals("X"))&&(button7.getText().equals("X")))||((button1.getText().equals("O"))&&(button4.getText().equals("O"))&&(button7.getText().equals("O"))))
    {sign =button1.getText(); return true;}
    else if(((button2.getText().equals("X"))&&(button5.getText().equals("X"))&&(button8.getText().equals("X")))||((button2.getText().equals("O"))&&(button5.getText().equals("O"))&&(button8.getText().equals("O"))))
    {sign =button2.getText(); return true;}
    else if(((button3.getText().equals("X"))&&(button6.getText().equals("X"))&&(button9.getText().equals("X")))||((button3.getText().equals("O"))&&(button6.getText().equals("O"))&&(button9.getText().equals("O"))))
    {sign =button6.getText(); return true;}
    else{return false;}
  }
}