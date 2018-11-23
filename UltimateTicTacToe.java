//Sinan Karabocuoglu
//28 January 2018
//UltimateTicTacToe

import javax.swing.*;

public class UltimateTicTacToe
{
  public static void main(String [] args)
  {
    Components table = new Components();
    table.setTitle("Ultimate Tic-Tac-Toe");
    table.setSize(500,500);
    table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes on exit
    table.setLocationRelativeTo(null);//sets the position
    table.setResizable(false);//sets nonresizable
    table.setVisible(true);//sets the frame visible 
  }
}
