package NewProject;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public  class Vendor {

	 public static String name1;
	 public static String mailid1;
	 public static String phoneNo1;
	 public static String address1;
	 public static String name2;
	 public static String mailid2;
	 public static String phoneNo2;
	 public static String address2;
	 public static String name3;
	 public static String mailid3;
	 public static String phoneNo3;
	 public static String address3;
	 
	 
	public static  void mehndi() 
	{
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("VENDOR SYSTEM MANAGEMENT");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("1.DRIDAL VENDOR");
		System.out.println("2.FLORIST VENDOR");
		System.out.println("3.BRIDALWAVE VENDOR");
		System.out.println("\n");
	   
		System.out.println("Dridal details");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter vendor name:");
		name1 = sc1.next();
		System.out.println("Enter mail id");
		mailid1 = sc1.next();
        System.out.println("Enter PhoneNumber");
        phoneNo1 =sc1.next();
        System.out.println("Enter address");
        address1 = sc1.next();
        
		
		
	}
	
	public  static void florist()
	{
		 
		 System.out.println("florist vendor details");
		 Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter vendor name:");
			name2 = sc2.next();
			System.out.println("Enter mail id");
			mailid2 = sc2.next();
	        System.out.println("Enter PhoneNumber");
	        phoneNo2 =sc2.next();
	        System.out.println("Enter address");
	        address2 = sc2.next();
	        
	}
	
    public static void Bridalwave()
    {
    	
		 System.out.println("mehandi vendor details");
		 Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter vendor name:");
			name3 = sc3.next();
			System.out.println("Enter mail id");
			mailid3 = sc3.next();
	        System.out.println("Enter PhoneNumber");
	        phoneNo3 =sc3.next();
	        System.out.println("Enter address");
	        address3 = sc3.next();
	        
    }
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		mehndi();
		florist();
		Bridalwave();
       show();
	}
	
	public static void show() 
	{
		char ch ='\0';
		System.out.println("VENDOR CATAGORIES");
		System.out.println("A.Mehndi");
		System.out.println("B.Florist");
		System.out.println("C.Bridalwave");
		System.out.println("E.Exit");
		Scanner t1 = new Scanner(System.in);
		do {
			System.out.println("=====================================================================================");
			System.out.println("Enter an option");
			System.out.println("======================================================================================");
            ch = t1.next().charAt(0);
            
			
			    switch (ch) 
			    {
			     
			    case'A':
			    	System.out.println("Vendoe mehndi details");
			    	System.out.println("name:"+name1);
			    	System.out.println("MailId:"+mailid1);
			    	System.out.println("PhoneNumber:"+phoneNo1);
			    	System.out.println("Address:"+address1);
			    	System.out.println("================================================================");
			    	System.out.println("Mehndi types");
			    	System.out.println("================================================================");
			    	
			    	//char ch1 ='\0';
			    	System.out.println("1.Design by radiant art");
			    	System.out.println("2.Madeeha jabeen mehndi art");
			    	System.out.println("Enter your model type");
			    	Scanner th1 = new Scanner(System.in);
			    	int it1 = th1.nextInt();
			    	
			    	if(it1==1)
			    	{
			    		try {
							//image2();
			    			imageDisplay();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    		
			    		
			    	}
			    	else if(it1==2) 
			    	{
			    		try {
							imageDisplay1();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    	}

				 
			    	  break;
			    case'B':   
			    	System.out.println("Vendoe Florist details");
			    	System.out.println("name:"+name2);
			    	System.out.println("MailId:"+mailid2);
			    	System.out.println("PhoneNumber:"+phoneNo2);
			    	System.out.println("Address:"+address2);
			    	
			    	System.out.println("================================================================");
			    	System.out.println("florist types");
			    	System.out.println("================================================================");
			    	System.out.println("1.pink florist");
			    	System.out.println("2.Red florist");
			    	System.out.println("Enter your model type");
			    	Scanner th2 = new Scanner(System.in);
			    	int it2 = th2.nextInt();
			    	
			    	if(it2==1) 
			    	{
			    		try {
							floristimageDisplay();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    	}
			    	
			    	else if(it2==2)
			    	{
			    		try {
							floristimageDisplay1();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    	}
			    	
			    	break;
			    	
			    case'C':
			    	System.out.println("Vendoe Florist details");
			    	System.out.println("name:"+name3);
			    	System.out.println("MailId:"+mailid3);
			    	System.out.println("PhoneNumber:"+phoneNo3);
			    	System.out.println("Address:"+address3);
			    	System.out.println("================================================================");
			    	System.out.println("florist types");
			    	System.out.println("================================================================");
			    	System.out.println("1.pridal hair style");
			    	System.out.println("2.pridal best pssion");
			    	System.out.println("Enter your model type");
			    	Scanner th3 = new Scanner(System.in);
			    	int it3 = th3.nextInt();
			    	
			    	if(it3==1) 
			    	{
			    		try {
			    			pridalimageDisplay1();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    	}
			    	
			    	else if(it3==2)
			    	{
			    		try {
			    			pridalimageDisplay2();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    	}
			    	
			    	break;
			    }
		  }while(ch!='E');
		System.out.println("Thans for using application");
	}
	
//	public static void image() 
//	{
//		try{
//	          BufferedImage image = ImageIO.read(new File("F:\\wallpapers\\nadalfederer-cropped_tnzvz2kdaec81cqfdzg6qelap.jpg"));
//
//	          image.getGraphics().drawLine(1, 1, image.getWidth()-1, image.getHeight()-1);
//	          image.getGraphics().drawLine(1, image.getHeight()-1, image.getWidth()-1, 1);
//
//	          ImageIO.write(image, "jpg", new File("F:\\wallpapers\\nadalfederer-cropped_tnzvz2kdaec81cqfdzg6qelap.jpg"));
//	          
//	     }
//	     catch (IOException e){
//	         e.printStackTrace();
//	     }
//	}
//	
//	public static void image2() throws IOException
//	{
//		BufferedImage bImage = null;
//		File file = new File("F:\\wallpapers\\nadalfederer-cropped_tnzvz2kdaec81cqfdzg6qelap.jpg");
//		        bImage = ImageIO.read(file);
//		       
//		       // ImageIO.write(bImage, "gif", new File("C://Users/HP/Desktop/image.gif"));
//		        ImageIO.write(bImage, "jpg", new File("F:\\wallpapers\\nadalfederer-cropped_tnzvz2kdaec81cqfdzg6qelap.jpg"));
//		       ImageWriter writer = null;
//				// ImageIO.write(bImage, "bmp", new File("C://Users/HP/Desktop/Image.bmp"));
//		        ImageIO.getImageReader(writer);
//
//	}
	public static  void imageDisplay() throws IOException
    {
    	BufferedImage img=ImageIO.read(new File("F:\\wallpapers\\vitaliy-lyubezhanin-W1gGN71UOzI-unsplash.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public static  void imageDisplay1() throws IOException
    {
    	BufferedImage img=ImageIO.read(new File("F:\\wallpapers\\mehndiimages.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public static  void floristimageDisplay() throws IOException
    {
    	BufferedImage img=ImageIO.read(new File("F:\\wallpapers\\pink_flowers_with_bees_hd_picture_166824.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public static  void floristimageDisplay1() throws IOException
    {
    	BufferedImage img=ImageIO.read(new File("F:\\wallpapers\\tulip_flowers_highdefinition_picture_03_166859.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public static  void pridalimageDisplay1() throws IOException
    {
    	BufferedImage img=ImageIO.read(new File("F:\\wallpapers\\tulip_flowers_highdefinition_picture_03_166859.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public static  void pridalimageDisplay2() throws IOException
    {
    	BufferedImage img=ImageIO.read(new File("F:\\wallpapers\\tulip_flowers_highdefinition_picture_03_166859.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
