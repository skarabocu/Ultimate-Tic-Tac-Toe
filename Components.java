 //Sinan Karabocuoglu
//28 January 2018 
//Components  
import javax.swing.*; 
import java.awt.GridLayout; 
import java.awt.Color; 
import java.awt.BorderLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.util.*;

public class Components extends JFrame 
{   
//attitudes   
  String player = "O";   
  JLabel label = new JLabel("Turn: "+player);   
  ArrayList <Zone> zones = new ArrayList <Zone>();
  BigTable bigTable = new BigTable();
  //--------listeners----------
  ButtonListener listener = new ButtonListener();
  SmallerGamesListener listener1 = new SmallerGamesListener();
  CheckWinnerListener listener2 = new CheckWinnerListener();
  //--------------------------
  Zone currentZone = new Zone(0);//the current zone in the big table
  String sign ="";//sign for the big table
  ArrayList <Zone> list = new ArrayList <Zone>();//the zones of the current list
//cosntructer   
  public Components()   
  {     
    this.add(label, BorderLayout.NORTH); 
    this.add(bigTable, BorderLayout.SOUTH);
    JPanel panel = new JPanel(new GridLayout(9,9)); 
    for(int i = 0; i<= 80;i++)     
    {       
      Zone button = new Zone(i); 
      zones.add(button);
      button.setEnabled(false);
      button.setVisible(false);
      button.setVisible(true);
      //---paints the background------
      button.setBackground(Color.YELLOW);       
      button.setOpaque(true);       
      button.setBorderPainted(true);
      //---------------------------
      button.addActionListener(listener);//adds the action to the zones
      button.addActionListener(listener2);//adds the action to the zones
      button.addActionListener(listener1);//adds the action to the zones
//------------paints some areas red-------------    
      if(i==0||i==1||i==2||i==6||i==7||i==8||i==9||i==10||i==11||i==15||i==16||i==17||i==18||i==19||i==20||i==24||i==25||i==26||i==30||i==31||i==32||i==39||i==40||i==41||i==48||i==49||i==50||i==54||i==55||i==56||i==60||i==61||i==62||i==63||i==64||i==65||i==69||i==70||i==71||i==72||i==73||i==74||i==78||i==79||i==80)       
      {       
        button.setBackground(Color.RED);       
        button.setOpaque(true);       
        button.setBorderPainted(true);
      }       
//---------------       
//---------always player x starts from the centre-------
      if(i ==30||i ==31||i ==32||i ==39||i ==40||i ==41||i ==48||i ==49||i ==50)
      {
        button.setEnabled(true);
        button.setVisible(false);
        button.setVisible(true);
      }
      if(i==40)       
      {         
        button.setText("X");
        button.setEnabled(false);
        button.setVisible(false);
        button.setVisible(true);
      }
      //----------------
      panel.add(button);
    }
    this.add(panel);
  }
  // ----------Button actions---------------
  class ButtonListener implements ActionListener 
  {
    public void actionPerformed(ActionEvent event)
    {
      Zone button1 = (Zone) event.getSource();
      if(button1.getText().equals(""))
      {
      button1.setText(player);//signs the zone for the player
      button1.setEnabled(false);
      button1.setVisible(false);
      button1.setVisible(true);
      //------changes the player turn------
      if(player.equals("O"))    
      {      
        player = "X";    
      }    
      else{player = "O";}    
//-----------------------------------    
      label.setText("Turn: "+player);//repaints the label   
      }
      //-------checks if someone won a small game---------
      if(listener2.crossWin())
      {currentZone.setText(sign);//signs the big table
      }
      else if(listener2.horizontalWin())
       {currentZone.setText(sign);//signs the big table
      }
      else if(listener2.verticalWin())
       {currentZone.setText(sign);//signs the big table
      }
      //-------------------------------------------------
      //-----------checks if someone won the big game------
      if(bigTable.crossWin())
      {JOptionPane.showMessageDialog(null,"Player "+sign+" won the game!","Ultimate Tic Tac Toe",JOptionPane.PLAIN_MESSAGE);System.exit(0);}
      else if(bigTable.horizontalWin())
      {JOptionPane.showMessageDialog(null,"Player "+sign+" won the game!","Ultimate Tic Tac Toe",JOptionPane.PLAIN_MESSAGE);System.exit(0);}
      else if(bigTable.verticalWin())
      {JOptionPane.showMessageDialog(null,"Player "+sign+" won the game!","Ultimate Tic Tac Toe",JOptionPane.PLAIN_MESSAGE);System.exit(0);}
      //---------------------------------------------------
    }
  }   
//----------------------------------------- 
  
//----------button action------------------
  public class SmallerGamesListener implements ActionListener
{
  public void actionPerformed(ActionEvent event)
    {
    for(Zone zone : zones)
    {
      zone.setEnabled(false);
      zone.setVisible(false);
      zone.setVisible(true);
    }
    Zone button = (Zone) event.getSource();
    int order = button.getOrder();
    //-------top left corner----------
    if(order ==0||order ==3||order ==6||order ==27||order ==30||order ==33||order ==54||order ==57||order ==60)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==0||order1==1||order1==2||order1==9||order1==10||order1==11||order1==18||order1==19||order1==20)
      {
        if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
    //-------top middle ----------
    else if(order ==1||order ==4||order ==7||order ==28||order ==31||order ==34||order ==55||order ==58||order ==61)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==3||order1==4||order1==5||order1==12||order1==13||order1==14||order1==21||order1==22||order1==23)
      {
        if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
    //-------top right corner----------
    else if(order ==2||order ==5||order ==8||order ==29||order ==32||order ==35||order ==56||order ==59||order ==62)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==6||order1==7||order1==8||order1==15||order1==16||order1==17||order1==24||order1==25||order1==26)
      {
        if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
    //-------middle left corner----------
    else if(order ==9||order ==12||order ==15||order ==36||order ==39||order ==42||order ==63||order ==66||order ==69)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==27||order1==28||order1==29||order1==36||order1==37||order1==38||order1==45||order1==46||order1==47)
      {
        if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
    //------- center ----------
    else if(order ==10||order ==13||order ==16||order ==37||order ==40||order ==43||order ==64||order ==67||order ==70)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==30||order1==31||order1==32||order1==39||order1==40||order1==41||order1==48||order1==49||order1==50)
      {
       if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
    //-------middle right corner----------
    else if(order ==11||order ==14||order ==17||order ==38||order ==41||order ==44||order ==65||order ==68||order ==71)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==33||order1==34||order1==35||order1==42||order1==43||order1==44||order1==51||order1==52||order1==53)
      {
        if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
    //-------bottom left corner----------
    else if(order ==18||order ==21||order ==24||order ==45||order ==48||order ==51||order ==72||order ==75||order ==78)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==54||order1==55||order1==56||order1==63||order1==64||order1==65||order1==72||order1==73||order1==74)
      {
        if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
    //-------bottom middle ----------
    else if(order ==19||order ==22||order ==25||order ==46||order ==49||order ==52||order ==73||order ==76||order ==79)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==57||order1==58||order1==59||order1==66||order1==67||order1==68||order1==75||order1==76||order1==77)
      {
        if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
    //-------bottom right corner----------
    else if(order ==20||order ==23||order ==26||order ==47||order ==50||order ==53||order ==74||order ==77||order ==80)
    {
      for(Zone zone1 : zones)
    {
      int order1 = zone1.getOrder();
      if(order1==60||order1==61||order1==62||order1==69||order1==70||order1==71||order1==78||order1==79||order1==80)
      {
        if(zone1.getText().equals(""))
        {zone1.setEnabled(true);zone1.setVisible(false);zone1.setVisible(true);}
      } 
    }
    }
    //-------------------------------
  }
}
  //--------------------------------------
  //---------------button action for checking the winner-----------
  public class CheckWinnerListener implements ActionListener
{
  //------------ArrayLists----------------
  ArrayList <Integer> topLeft = new ArrayList <Integer>() {
    {add(0); add(1); add(2); add(9); add(10); add(11); add(18); add(19); add(20); }};//list for topLeft corner game
  ArrayList <Integer> topCentre = new ArrayList <Integer>() {
    {add(3); add(4); add(5); add(12); add(13); add(14); add(21); add(22); add(23); }};//list for top centre game
  ArrayList <Integer> topRight = new ArrayList <Integer>() {
    {add(6); add(7); add(8); add(15); add(16); add(17); add(24); add(25); add(26); }};//list for topRight corner game
  ArrayList <Integer> middleLeft = new ArrayList <Integer>() {
    {add(27); add(28); add(29); add(36); add(37); add(38); add(45); add(46); add(47); }};//list for middleLeft corner game
  ArrayList <Integer> middleCentre = new ArrayList <Integer>() {
    {add(30); add(31); add(32); add(39); add(40); add(41); add(48); add(49); add(50); }};//list for middle centre game
  ArrayList <Integer> middleRight = new ArrayList <Integer>() {
    {add(33); add(34); add(35); add(42); add(43); add(44); add(51); add(52); add(53); }};//list for middleRight corner game
  ArrayList <Integer> bottomLeft = new ArrayList <Integer>() {
    {add(54); add(55); add(56); add(63); add(64); add(65); add(72); add(73); add(74); }};//list for bottomLeft corner game
  ArrayList <Integer> bottomCentre = new ArrayList <Integer>() {
    {add(57); add(58); add(59); add(66); add(67); add(68); add(75); add(76); add(77); }};//list for bottom centre game
  ArrayList <Integer> bottomRight = new ArrayList <Integer>() {
    {add(60); add(61); add(62); add(69); add(70); add(71); add(78); add(79); add(80); }};//list for bottomRight corner game
  ArrayList <Integer> currentList = new ArrayList <Integer>();//current list
  boolean found1, found2, found3, found4, found5,found6,found7,found8,found9;//booleans for deciding whether the small game is over or not
  //--------------------------------------
  public void actionPerformed(ActionEvent e)
  {
    Zone button = (Zone) e.getSource();
    int order = button.getOrder();
    currentList.clear();
    //----------deciding which arrayList contains the order--------
    if(topLeft.contains(order))
    { currentList.addAll(topLeft); currentZone = bigTable.button1;}//sets the values
    else if(topCentre.contains(order))
    { currentList.addAll(topCentre);currentZone = bigTable.button2;}//sets the values
    else if(topRight.contains(order))
    { currentList.addAll(topRight); currentZone = bigTable.button3;}//sets the values
    else if(middleLeft.contains(order))
    { currentList.addAll(middleLeft); currentZone = bigTable.button4;}//sets the values
    else if(middleCentre.contains(order))
    { currentList.addAll(middleCentre);currentZone = bigTable.button5;}//sets the values
    else if(middleRight.contains(order))
    { currentList.addAll(middleRight); currentZone = bigTable.button6;}//sets the values
    else if(bottomLeft.contains(order))
    { currentList.addAll(bottomLeft); currentZone = bigTable.button7;}//sets the values
    else if(bottomCentre.contains(order))
    { currentList.addAll(bottomCentre);currentZone = bigTable.button8;}//sets the values
    else if(bottomRight.contains(order))
    { currentList.addAll(bottomRight); currentZone = bigTable.button9;}//sets the values
    //-------------------------------------------------------------
    list.clear();
    for(Zone area : zones)
    {
      if(currentList.contains(area.getOrder()))
      {
        list.add(area);
      }
    }
  }
  //checks the cross win
  public boolean crossWin()
  {
    if(((list.get(0).getText().equals("X"))&&(list.get(4).getText().equals("X"))&&(list.get(8).getText().equals("X")))||((list.get(0).getText().equals("O"))&&(list.get(4).getText().equals("O"))&&(list.get(8).getText().equals("O"))))
    {sign =list.get(0).getText(); return true;}
    else if(((list.get(2).getText().equals("X"))&&(list.get(4).getText().equals("X"))&&(list.get(6).getText().equals("X")))||((list.get(2).getText().equals("O"))&&(list.get(4).getText().equals("O"))&&(list.get(6).getText().equals("O"))))
    {sign = list.get(2).getText(); return true;}
    else
    {return false;}
  }
  //checks the horizontal win
  public boolean horizontalWin()
  {
    if(((list.get(0).getText().equals("X"))&&(list.get(1).getText().equals("X"))&&(list.get(2).getText().equals("X")))||((list.get(0).getText().equals("O"))&&(list.get(1).getText().equals("O"))&&(list.get(2).getText().equals("O"))))
    {sign =list.get(0).getText(); return true;}
    else if(((list.get(3).getText().equals("X"))&&(list.get(4).getText().equals("X"))&&(list.get(5).getText().equals("X")))||((list.get(3).getText().equals("O"))&&(list.get(4).getText().equals("O"))&&(list.get(5).getText().equals("O"))))
    {sign =list.get(3).getText(); return true;}
    else if(((list.get(6).getText().equals("X"))&&(list.get(7).getText().equals("X"))&&(list.get(8).getText().equals("X")))||((list.get(6).getText().equals("O"))&&(list.get(7).getText().equals("O"))&&(list.get(8).getText().equals("O"))))
    {sign =list.get(6).getText(); return true;}
    else{return false;}
  }
  //checks the vertical win
  public boolean verticalWin()
  {
    if(((list.get(0).getText().equals("X"))&&(list.get(3).getText().equals("X"))&&(list.get(6).getText().equals("X")))||((list.get(0).getText().equals("O"))&&(list.get(3).getText().equals("O"))&&(list.get(6).getText().equals("O"))))
    {sign =list.get(0).getText(); return true;}
    else if(((list.get(1).getText().equals("X"))&&(list.get(4).getText().equals("X"))&&(list.get(7).getText().equals("X")))||((list.get(1).getText().equals("O"))&&(list.get(4).getText().equals("O"))&&(list.get(7).getText().equals("O"))))
    {sign =list.get(1).getText(); return true;}
    else if(((list.get(2).getText().equals("X"))&&(list.get(5).getText().equals("X"))&&(list.get(8).getText().equals("X")))||((list.get(2).getText().equals("O"))&&(list.get(5).getText().equals("O"))&&(list.get(8).getText().equals("O"))))
    {sign =list.get(2).getText(); return true;}
    else{return false;}
  }
}
  //-------------------------------------------------------------
} 