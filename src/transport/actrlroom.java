package transport;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class actrlroom extends JFrame implements ActionListener {
	
	actrlroom()
	{
		setTitle("MAHARASHTRA STATE ROAD TRANSPORT CORPORATION (MSRTC)");
    	Container c=getContentPane();
    JScrollPane pane =new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    	setContentPane(pane);
    	c.setBackground(Color.white);
        setLayout(null);
	    setVisible(true);
		setSize(1366,2000);
	    setLocation(0,0);
	    
	    
	
	    //for first part
	    JPanel Panel1 = new JPanel();
        Panel1.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel1.setBackground(new Color(90,19,15));
        Panel1.setBounds(0,0,1366,150);
        add(Panel1);
        
        JLabel jLabel1 = new JLabel("टोल फ्री नंबर :१८०० २२ १२५० ");
       jLabel1.setFont(new Font("Serif", Font.BOLD, 30));
        jLabel1.setForeground(Color.yellow);
        Panel1.add(jLabel1);
        jLabel1.setBounds(500, 10, 600, 50);
        
        JLabel jLabel2 = new JLabel("आमचे ध्येय : सुरक्षित आणि अपघात विरहित बस सेवा.");
        jLabel2.setFont(new Font("Serif", Font.BOLD, 30));
         jLabel2.setForeground(Color.white);
         Panel1.add(jLabel2);
         jLabel2.setBounds(350,70,700,50);
         
         
         
         ////////////////////////////////////////////////////////////////////////////////
         
        JLabel jLabel16 = new JLabel("MSRTC CONTROL PANEL");
      jLabel16.setFont(new Font("Serif", Font.BOLD, 50));
         jLabel16.setForeground(Color.RED);
         jLabel16.setBounds(60,165,700,100);
          add(jLabel16);
          
          
   
          
          DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
          LocalDateTime now=LocalDateTime.now();
          String s=dtf.format(now);
          
          JLabel jLabel17 = new JLabel("Today :-"+s);
          jLabel17.setFont(new Font("Serif", Font.BOLD, 30));
             jLabel17.setForeground(Color.black);
             jLabel17.setBounds(130,265,700,100);
              add(jLabel17);
         ///////////bus
         
         JLabel jLabel10 = new JLabel("BUS ALLOCATIONS");
         jLabel10.setFont(new Font("Serif", Font.BOLD, 10));
          jLabel10.setForeground(Color.RED);
          jLabel10.setBounds(1200,165,150,20);
          add(jLabel10);
          
         JPanel Panel25 = new JPanel();
         Panel25.setLayout(null);
        // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
         Panel25.setBackground(Color.GREEN);
         Panel25.setBounds(1170,190,20,20);
         add(Panel25);
         
         JLabel jLabel7 = new JLabel("NOT ALLOCATED");
         jLabel7.setFont(new Font("Serif", Font.BOLD, 10));
          jLabel7.setForeground(Color.BLACK);
          jLabel7.setBounds(1210,190,100,20);
          add(jLabel7);
         
         JPanel Panel26 = new JPanel();
         Panel26.setLayout(null);
        // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
         Panel26.setBackground(Color.yellow);
         Panel26.setBounds(1170,220,20,20);
         add(Panel26);
         
         JLabel jLabel8 = new JLabel("ALLOCATED");
         jLabel8.setFont(new Font("Serif", Font.BOLD, 10));
          jLabel8.setForeground(Color.BLACK);
          jLabel8.setBounds(1210,220,100,20);
          add(jLabel8);
         
         JPanel Panel27 = new JPanel();
         Panel27.setLayout(null);
        // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
         Panel27.setBackground(Color.red);
         Panel27.setBounds(1170,250,20,20);
         add(Panel27);
         
         JLabel jLabel9 = new JLabel("UNDER MAINTAINENCE");
         jLabel9.setFont(new Font("Serif", Font.BOLD, 10));
          jLabel9.setForeground(Color.BLACK);
          jLabel9.setBounds(1210,250,150,20);
          add(jLabel9);
          //////////////driver
          
        
          JLabel jLabel11 = new JLabel("DRIVER ALLOCATIONS");
          jLabel11.setFont(new Font("Serif", Font.BOLD, 10));
           jLabel11.setForeground(Color.RED);
           jLabel11.setBounds(900,165,150,20);
           add(jLabel11);
           
           JPanel Panel28= new JPanel();
           Panel28.setLayout(null);
          // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
           Panel28.setBackground(Color.blue);
           Panel28.setBounds(860,190,20,20);
           add(Panel28);
           
           JLabel jLabel12 = new JLabel("NOT ALLOCATED");
           jLabel12.setFont(new Font("Serif", Font.BOLD, 10));
            jLabel12.setForeground(Color.BLACK);
            jLabel12.setBounds(900,190,100,20);
            add(jLabel12);
            
            JPanel Panel29 = new JPanel();
            Panel29.setLayout(null);
           // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
            Panel29.setBackground(Color.yellow);
            Panel29.setBounds(860,220,20,20);
            add(Panel29);
            
            JLabel jLabel13 = new JLabel("ALLOCATED");
            jLabel13.setFont(new Font("Serif", Font.BOLD, 10));
             jLabel13.setForeground(Color.BLACK);
             jLabel13.setBounds(900,220,100,20);
             add(jLabel13);
             
             JPanel Panel30 = new JPanel();
             Panel30.setLayout(null);
            // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
             Panel30.setBackground(Color.red);
             Panel30.setBounds(860,250,20,20);
             add(Panel30);
             
             JLabel jLabel14 = new JLabel("ON LEAVE");
             jLabel14.setFont(new Font("Serif", Font.BOLD, 10));
              jLabel14.setForeground(Color.BLACK);
              jLabel14.setBounds(900,250,150,20);
              add(jLabel14);
         
         /////////////////////////////////////////////////////////
        
      //for second part
	    JPanel Panel2 = new JPanel();
        Panel2.setLayout(null);
        //Panel2.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel2.setBackground(new Color(243,172,4));
        Panel2.setBounds(0,150,1366,10);
        add(Panel2);
        //////////////////////////////////////////////////////////////
       
    //  JLabel l7=new JLabel(new ImageIcon("../image/logo1.png"));
	//add(l7);
	//	l7.setBounds(100,220,50,60);
        
        JLabel jLabel3 = new JLabel("BUSES");
        jLabel3.setFont(new Font("Serif", Font.BOLD, 30));
         jLabel3.setForeground(Color.RED);
         jLabel3.setBounds(280,350,400,50);
         add(jLabel3);
         
         JPanel Panel11 = new JPanel();
         Panel11.setLayout(null);
        // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
         Panel11.setBackground(new Color(90,19,15));
         Panel11.setBounds(700,400,10,250);
         add(Panel11);
         
         
	   /////////////////////////////////////////////////////////////////////////////////////////////
         
        //bus first row
        
        JPanel Panel3 = new JPanel();
        Panel3.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel3.setBackground(Color.GREEN);
        Panel3.setBounds(150,400,50,100);
        add(Panel3);
        
        JPanel Panel4 = new JPanel();
        Panel4.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel4.setBackground(Color.GREEN);
        Panel4.setBounds(250,400,50,100);
        add(Panel4);
        
        JPanel Panel5 = new JPanel();
        Panel5.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel5.setBackground(Color.GREEN);
        Panel5.setBounds(350,400,50,100);
        add(Panel5);
        
        JPanel Panel6 = new JPanel();
        Panel6.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel6.setBackground(Color.GREEN);
        Panel6.setBounds(450,400,50,100);
        add(Panel6);
        
        
        //bus row 2
        JPanel Panel7= new JPanel();
        Panel7.setLayout(null);
        Panel7.setBackground(Color.GREEN);
        Panel7.setBounds(150,550,50,100);
        add(Panel7);
        
        JPanel Panel8 = new JPanel();
        Panel8.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel8.setBackground(Color.GREEN);
        Panel8.setBounds(250,550,50,100);
        add(Panel8);
        
        JPanel Panel9 = new JPanel();
        Panel5.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel9.setBackground(Color.GREEN);
        Panel9.setBounds(350,550,50,100);
        add(Panel9);
        
        JPanel Panel10 = new JPanel();
        Panel10.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel10.setBackground(Color.GREEN);
        Panel10.setBounds(450,550,50,100);
        add(Panel10);
        
        
        
        
       ////////////////////////////////////////////////////////////////////////////////////
        
        
        JLabel jLabel15 = new JLabel("DRIVERS");
        jLabel15.setFont(new Font("Serif", Font.BOLD, 30));
         jLabel15.setForeground(Color.RED);
         jLabel15.setBounds(1030,350,400,50);
         add(jLabel15);
         
         
	   
        //bus first row
        
        JPanel Panel17 = new JPanel();
        Panel17.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel17.setBackground(Color.blue);
        Panel17.setBounds(900,400,50,100);
        add(Panel17);
        
        JPanel Panel18 = new JPanel();
        Panel18.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel18.setBackground(Color.BLUE);
        Panel18.setBounds(1000,400,50,100);
        add(Panel18);
        
        JPanel Panel19 = new JPanel();
        Panel19.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel19.setBackground(Color.blue);
        Panel19.setBounds(1100,400,50,100);
        add(Panel19);
        
        JPanel Panel20 = new JPanel();
        Panel20.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel20.setBackground(Color.blue);
        Panel20.setBounds(1200,400,50,100);
        add(Panel20);
        
        
        //bus row 2
        JPanel Panel21= new JPanel();
        Panel21.setLayout(null);
        Panel21.setBackground(Color.blue);
        Panel21.setBounds(900,550,50,100);
        add(Panel21);
        
        JPanel Panel22 = new JPanel();
        Panel22.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel22.setBackground(Color.blue);
        Panel22.setBounds(1000,550,50,100);
        add(Panel22);
        
        JPanel Panel23 = new JPanel();
        Panel23.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel23.setBackground(Color.blue);
        Panel23.setBounds(1100,550,50,100);
        add(Panel23);
        
        JPanel Panel24 = new JPanel();
        Panel24.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel24.setBackground(Color.blue);
        Panel24.setBounds(1200,550,50,100);
        add(Panel24);
        
        JPanel Panel31 = new JPanel();
        Panel31.setLayout(null);
       // Panel1.setBorder(new LineBorder(Color.BLACK,1,true));
        Panel31.setBackground(new Color(90,19,15));
        Panel31.setBounds(0,700,1366,20);
        add(Panel31);
	}
	public static void main(String args[])
	{
		actrlroom l1=new actrlroom();
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
