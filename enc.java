import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.crypto.Cipher;  
import javax.crypto.SecretKey;  
import javax.crypto.SecretKeyFactory;  
import javax.crypto.spec.IvParameterSpec;  
import javax.crypto.spec.PBEKeySpec;  
import javax.crypto.spec.SecretKeySpec;  
import java.nio.charset.StandardCharsets;  
import java.security.InvalidAlgorithmParameterException;  
import java.security.InvalidKeyException;  
import java.security.NoSuchAlgorithmException;  
import java.security.spec.InvalidKeySpecException;  
import java.security.spec.KeySpec;  
import java.util.Base64;  
import javax.crypto.BadPaddingException;  
import javax.crypto.IllegalBlockSizeException;  
import javax.crypto.NoSuchPaddingException;  
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter; 
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
public class enc extends Frame
{
static enc s1;
static enc2 s2;
static  sap3 s3;
static enc4 s4;

public Label l1,l2,l3,l4,l5,l6,l7,l8;
public TextField t1,t2,t3,t4,t5,t6;
public Choice  cat;
public JButton b1,b2;
 final JTextArea edit = new JTextArea(10, 60);
 JButton read = new JButton("Read TextAreaLoad.txt");
JButton write = new JButton("Write TextAreaLoad.txt");
        JFrame frame = new JFrame("Edit Text in Area ( TextAreaLoad.txt )");
enc()
{
	 edit.setText("one\ntwo\nthree");
        edit.append("\nfour\nfive");
s2=new enc2();
s2.setSize(800,500);

s3=new sap3();
s3.setSize(800,500);

s4=new enc4();
s4.setSize(800,500);

b1= new JButton("Submit to encrypt");
b2= new JButton("exit");
b1.setFont(new Font("Arial", Font.BOLD, 18));
read.setFont(new Font("Arial", Font.BOLD, 18));
b2.setFont(new Font("Arial", Font.BOLD, 18));
write.setFont(new Font("Arial", Font.BOLD, 18));
b1.setBackground(new Color(230, 255, 230));
b2.setBackground(new Color(230, 255, 230));
read.setBackground(new Color(230, 255, 230));
write.setBackground(new Color(230, 255, 230));

 read.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    FileReader reader = new FileReader( "F:\\aaa\\TextAreaLoad.txt" );
                    BufferedReader br = new BufferedReader(reader);
                    edit.read( br, null );
                    br.close();
                    edit.requestFocus();
                    
                }
                catch(Exception e2) { System.out.println(e2); }
            }
        });
 edit.setFont(new Font("Serif",Font.PLAIN,20));
 Color color=new Color(224, 213, 209);
 edit.setBackground(color);
 b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s2.setVisible(true);
frame.setVisible(false);
s1.setVisible(false);
}
});

		addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
System.exit(0);
}
});
 write.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    FileWriter writer = new FileWriter( "f:\\aaa\\TextAreaLoad.txt" );
                    BufferedWriter bw = new BufferedWriter( writer );
                    edit.write( bw );
                    bw.close();
                    edit.setText("");
                    edit.requestFocus();
                }
                catch(Exception e2) {}
            }
        });
		      b1.setBounds(80,30,120,40);

		 frame.getContentPane().add( new JScrollPane(edit), BorderLayout.NORTH );
        frame.getContentPane().add(read, BorderLayout.WEST);
        frame.getContentPane().add(write, BorderLayout.EAST);
		        frame.getContentPane().add(b1, BorderLayout.CENTER);
				        frame.getContentPane().add(b2, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);


}

public static void main(String[] args)
{
s1=new enc();
//s1.setVisible(true);
s1.setSize(700,700);
}




class enc2 extends Frame
{
public JLabel c,co,y,pq,ad,f;
public TextField d,fe;
public Choice ch,com,ye;
public Checkbox p,i,di;
public JButton back,encrypt,exit,qr;
        //JFrame frame1 = new JFrame("TextArea Load");
        final JTextArea edit1 = new JTextArea(10, 60);
        
public  enc2()
{
JPanel p4=new JPanel();
JPanel p5=new JPanel();
 try
                {
                    FileReader reader = new FileReader( "f:\\aaa\\TextAreaLoad.txt" );
                    BufferedReader br = new BufferedReader(reader);
                    edit1.read( br, null );
                    br.close();
                    edit1.requestFocus();
                }
                catch(Exception e2) { System.out.println(e2); }
				c=new JLabel("Cource");
				add(p4);
				p4.setLayout(new BorderLayout());
				p4.setBackground(new Color(166, 242, 242));
				 edit1.setFont(new Font("Serif",Font.PLAIN,20));

				 Color color=new Color(224, 213, 209);
				 edit1.setBackground(color);
				 edit1.setEditable(false);
//p4.add(c);

p4.add(edit1,BorderLayout.NORTH);
back=new JButton("BACK");
encrypt=new JButton("< Encrypt (AES) >");
exit=new JButton("Exit");
qr=new JButton("< QR encrypt >");
//qr.setBounds(10, 10, 30, 30);
back.setBackground(new Color(230, 255, 255));
back.setFont(new Font("Arial", Font.BOLD, 18));
exit.setFont(new Font("Arial", Font.BOLD, 18));
qr.setFont(new Font("Arial", Font.BOLD, 18));
encrypt.setFont(new Font("Arial", Font.BOLD, 18));
back.setBorder(BorderFactory.createLineBorder(Color.black));
exit.setBorder(BorderFactory.createLineBorder(Color.black));
encrypt.setBorder(BorderFactory.createLineBorder(Color.black));
qr.setBorder(BorderFactory.createLineBorder(Color.black));

back.setForeground(new Color(0,0,0));

exit.setBackground(new Color(230, 255, 255));
exit.setForeground(new Color(0,0,0));

encrypt.setBackground(new Color(204, 255, 204));
encrypt.setForeground(new Color(0,0,0));

qr.setBackground(new Color(204, 255, 204));
qr.setForeground(new Color(0,0,0));

p5.setLayout(new GridLayout(1,3));
back.setPreferredSize(new Dimension(40, 40));
encrypt.setPreferredSize(new Dimension(40, 40));
exit.setPreferredSize(new Dimension(40, 40));
qr.setPreferredSize(new Dimension(40, 40));

p5.add(back);
p5.add(encrypt);
p5.add(qr);

p5.add(exit);
p4.add(p5,BorderLayout.SOUTH);
back.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s2.setVisible(false);
frame.setVisible(true);
//s1.setVisible(true);
}
});
qr.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s2.setVisible(false);
s4.setVisible(true);
//s1.setVisible(true);
}
});
encrypt.addActionListener(new ActionListener()
{
public  void  actionPerformed(ActionEvent ae)
{
s3.setVisible(true);
s2.setVisible(false);
}
});
exit.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
System.exit(0);
}
});

}
}

class sap3 extends Frame
{
	private static final String SECRET_KEY = "123456789";  
    private static final String SALTVALUE = "abcdefg"; 
public  Label x;
public JButton ex,bk,de;
public JPanel p6;
        final JTextArea edit2 = new JTextArea(10, 60);
public sap3()
{
//setLayout(new FlowLayout());
p6=new JPanel();
add(p6);
p6.setBackground(new Color(235, 235, 224));
p6.setLayout(new BorderLayout());
JPanel p7=new JPanel();
JLabel l9=new JLabel("Encrypted Text");
l9.setFont(new Font("Arial", Font.BOLD, 25));
p6.add(l9,BorderLayout.NORTH);

p7.setLayout(new GridLayout(1,2));
p6.add(edit2,BorderLayout.CENTER);
p6.add(p7,BorderLayout.SOUTH);
//x=new Label("Admission  Details");
//p6.add(x);
bk=new JButton("BACK");
ex=new JButton("Exit");
de=new JButton("Decrypt");
p7.add(bk);
p7.add(de);
p7.add(ex);
edit2.setFont(new Font("Serif",Font.PLAIN,20));
Color color=new Color(204, 204, 204);
edit2.setBackground(color);

String originalval="";
        /* Message to be encrypted. */  
		//File f=new File("ptext.txt");
		try {
      File myObj = new File("f:\\aaa\\TextAreaLoad.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
         originalval =originalval+myReader.nextLine();
        //System.out.println(data);
      }
      //myReader.close();
    } catch (FileNotFoundException e) {
      
    }
	//edit2.setText(encrypt(originalval));
	try   
    {  
      /* Declare a byte array. */  
      byte[] iv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};  
      IvParameterSpec ivspec = new IvParameterSpec(iv);        
      /* Create factory for secret keys. */  
      SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");  
      /* PBEKeySpec class implements KeySpec interface. */  
      KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALTVALUE.getBytes(), 65536, 256);  
      SecretKey tmp = factory.generateSecret(spec);  
      SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");  
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  
      cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);  
      /* Retruns encrypted value. */  
      edit2.setText( Base64.getEncoder().encodeToString(cipher.doFinal(originalval.getBytes(StandardCharsets.UTF_8))));  
    }   
	catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e)   
    {  
     edit2.setText("Error occured during encryption: ");  
    }  
	edit2.setEditable(false);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
ex.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
//s2.setVisible(false);
//s1.setVisible(true);
System.exit(0);
}
});
bk.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s3.setVisible(false);
s2.setVisible(true);
//s1.setVisible(true);
}
});
de.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s3.setVisible(false);
s2.setVisible(true);
//s1.setVisible(true);
}
});
bk.setBackground(new Color(230, 255, 255));
bk.setFont(new Font("Arial", Font.BOLD, 18));
ex.setFont(new Font("Arial", Font.BOLD, 18));
de.setFont(new Font("Arial", Font.BOLD, 18));
//encrypt.setFont(new Font("Arial", Font.BOLD, 18));
bk.setBorder(BorderFactory.createLineBorder(Color.black));
ex.setBorder(BorderFactory.createLineBorder(Color.black));
//encrypt.setBorder(BorderFactory.createLineBorder(Color.black));
de.setBorder(BorderFactory.createLineBorder(Color.black));

bk.setForeground(new Color(0,0,0));

ex.setBackground(new Color(230, 255, 255));
ex.setForeground(new Color(0,0,0));

//encrypt.setBackground(new Color(204, 255, 204));
//encrypt.setForeground(new Color(0,0,0));

de.setBackground(new Color(204, 255, 204));
de.setForeground(new Color(0,0,0));

//p5.setLayout(new GridLayout(1,3));
bk.setPreferredSize(new Dimension(40, 40));
//encrypt.setPreferredSize(new Dimension(40, 40));
ex.setPreferredSize(new Dimension(40, 40));
de.setPreferredSize(new Dimension(40, 40));
}
}

class enc4 extends Frame
{
	
public  Label x;
public JButton ex,bk,de;
public JPanel p6;
        final JTextArea edit2 = new JTextArea(10, 60);
public enc4()
{


	//edit2.setText(encrypt(originalval));

String qrCodeData="";
/* Message to be encrypted. */  
//File f=new File("ptext.txt");
try {
File myObj = new File("ptext.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
	qrCodeData =qrCodeData+myReader.nextLine();
//System.out.println(data);
}
//myReader.close();
} catch (FileNotFoundException e) {

}
	   
try{
    //String qrCodeData = "www.chillyfacts.com";
    String filePath = "F:\\aaa\\newQR.png";
    String charset = "UTF-8"; // or "ISO-8859-1"
    Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
    hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
    BitMatrix matrix = new MultiFormatWriter().encode(
        new String(qrCodeData.getBytes(charset), charset),
        BarcodeFormat.QR_CODE, 200, 200, hintMap);
    MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
        .lastIndexOf('.') + 1), new File(filePath));
    System.out.println("QR Code image created successfully!");
} catch (Exception e) {
    System.err.println(e);
}


p6=new JPanel();
p6.setLayout(new BorderLayout());
add(p6);

ImageIcon image = new ImageIcon("F:\\aaa\\newQR.png");
JLabel imageLabel = new JLabel(image); 
JLabel l9=new JLabel("Encrypted QR");
l9.setFont(new Font("Arial", Font.BOLD, 25));
p6.add(l9,BorderLayout.NORTH);

p6.add(imageLabel,BorderLayout.CENTER);
JPanel p7=new JPanel();
ex=new JButton("Exit");
bk=new JButton("Back");
de=new JButton("Decrypt QR code");
p6.add(p7,BorderLayout.SOUTH);
p7.setLayout(new GridLayout(1,3));
p7.add(bk);
p7.add(de);
p7.add(ex);

bk.setBackground(new Color(230, 255, 255));
bk.setFont(new Font("Arial", Font.BOLD, 18));
ex.setFont(new Font("Arial", Font.BOLD, 18));
de.setFont(new Font("Arial", Font.BOLD, 18));
//encrypt.setFont(new Font("Arial", Font.BOLD, 18));
bk.setBorder(BorderFactory.createLineBorder(Color.black));
ex.setBorder(BorderFactory.createLineBorder(Color.black));
//encrypt.setBorder(BorderFactory.createLineBorder(Color.black));
de.setBorder(BorderFactory.createLineBorder(Color.black));

bk.setForeground(new Color(0,0,0));

ex.setBackground(new Color(230, 255, 255));
ex.setForeground(new Color(0,0,0));

//encrypt.setBackground(new Color(204, 255, 204));
//encrypt.setForeground(new Color(0,0,0));

de.setBackground(new Color(204, 255, 204));
de.setForeground(new Color(0,0,0));

//p5.setLayout(new GridLayout(1,3));
bk.setPreferredSize(new Dimension(40, 40));
//encrypt.setPreferredSize(new Dimension(40, 40));
ex.setPreferredSize(new Dimension(40, 40));
de.setPreferredSize(new Dimension(40, 40));
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});

de.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s4.setVisible(false);
s2.setVisible(true);
//s1.setVisible(true);
}
});

bk.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s4.setVisible(false);
s2.setVisible(true);
//s1.setVisible(true);
}
});

ex.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
//s3.setVisible(false);
//s2.setVisible(true);
	System.exit(0);
//s1.setVisible(true);
}
});
}
}
}
