/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoappphase2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author x15392331
 */
public class LottoAppPhase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Data Memebers
        String game;
        int usernum1;
        int usernum2;
        int usernum3;
        int usernum4;
        int usernum5;
        int[] secret;
        int[] secretPlusOne;
        int[] secretPlusTwo;
        ArrayList<LottoPhase2> Array = new ArrayList();
        
        GameGUI GUI = new GameGUI();
        GUI.setVisible(true);
        PhaseOne myOne = new PhaseOne();
        myOne.setVisible(false);
        PhaseTwo myTwo = new PhaseTwo();
        myTwo.setVisible(false);
        
        
        //Create And Declare New Object
        LottoPhase2GenNums myGeneratedNumbers = new LottoPhase2GenNums();
        
        //Compute
        myGeneratedNumbers.computeRandomNums();
        
        //Create And Declare New Objects
        secret = myGeneratedNumbers.getSecret();
        secretPlusOne = myGeneratedNumbers.getSecretPlusOne();
        secretPlusTwo = myGeneratedNumbers.getSecretPlusTwo();
        
        
        LottoPhase2 myApp = new LottoPhase2(secret, Array);
        
        //Output Arrays
        System.out.println(Arrays.toString(secret));
        System.out.println(Arrays.toString(secretPlusOne));
        System.out.println(Arrays.toString(secretPlusTwo));
        

        for (int i = 0; i < 3; i++) {

            LottoPhase2 Lotto = new LottoPhase2();
               //Get User Input
            usernum1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Num1"));
            usernum2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Num2"));
            usernum3 = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Num3"));
            usernum4 = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Num4"));
            usernum5 = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Num5"));
            game = JOptionPane.showInputDialog(null, "Enter game type lotto,plus1,plus2");
            
            //Set User Input
            Lotto.setGame(game);
            Lotto.setUsernum1(usernum1);
            Lotto.setUsernum2(usernum2);
            Lotto.setUsernum3(usernum3);
            Lotto.setUsernum4(usernum4);
            Lotto.setUsernum5(usernum5);
            
            //Add to ArrayList
            Array.add(Lotto);

        }
       
        //Get Compared Numbers
        myApp.comparingNumbers();
        
        //Output Correct
        System.out.println("Line 1 is " + myApp.getLine1());
        System.out.println("Line 2 is " + myApp.getLine2());
        System.out.println("Line 3 is " + myApp.getLine3());

    }

}
