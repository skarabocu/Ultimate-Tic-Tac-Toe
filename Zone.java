//Sinan Karabocuoglu
//28 January 2018
//Zone

import javax.swing.*;

public class Zone extends JButton
{
  int order;
  
  public Zone(int number)
  {
    order = number;
  }
  
  public int getOrder()
  {
    return order;
  }  
}
