import java.util.*;


import java.awt.*;
import java.awt.event.*;
abstract  class PasswordOtp extends Frame implements WindowListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args)
    {

        // Length of your password as I have choose
        // here to be 8
        int length = 10;
//	        System.out.println(geek_Password(length));
        int lengthotp = 4;
//	        System.out.println(OTP(lengthotp));

        Frame f=new Frame("For generating password and otp");
        final TextField tf1=new TextField();
        final TextField tf2=new TextField();
        tf1.setBounds(50,50, 150,20);
        tf2.setBounds(250,50, 150,20);
        Button b1=new Button("For password");
        Button b2=new Button("For otp");
        b1.setBounds(50,100,90,30);
        b2.setBounds(250,100,90,30);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText(String.valueOf(geek_Password(length)));
            }  });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf2.setText(String.valueOf(OTP(lengthotp)));
            }

        });




        f.add(b1);
        f.add(b2);
        f.add(tf1);
        f.add(tf2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }


    // This our Password generating method
    // We have use static here, so that we not to
    // make any object for it
    static char[] geek_Password(int len)
    {
        //System.out.println("Generating password using random() : ");
        //System.out.print("Your new password is : ");

        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";


        String values = Capital_chars + Small_chars +
                numbers + symbols;

        // Using random method
        Random rndm_method = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(rndm_method.nextInt(values.length()));

        }
        return password;
    }

    static char[] OTP(int len)
    {
        //System.out.println("Generating OTP using random() : ");
        //System.out.print("You OTP is : ");

        // Using numeric values
        String numbers = "0123456789";

        // Using random method
        Random rndm_method = new Random();

        char[] otp = new char[len];

        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] =
                    numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
    }


}
