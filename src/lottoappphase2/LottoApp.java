/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoproject1;

import javax.swing.*;
import java.util.Arrays;

/**
 *
 * @author x15468652
 */
public class LottoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0;
        int secretNum[] = new int[5];
        int userInterface[][] = new int[3][5];
        int line1 = 0;
        int line2 = 0;
        int line3 = 0;

        Lotto myLotto = new Lotto();

        myLotto.compute();

        secretNum = myLotto.getSecretNum();
        myLotto.setSecretNum(secretNum);
        System.out.println(Arrays.toString(secretNum));
//        //Generates 10 Random Numbers in the range 1-40
//        for (int i = 0; i < secretNum.length; i++) {
//            secretNum[i] = (int) Math.floor(1 + Math.random() * 40);
//        }
//        System.out.println(Arrays.toString(secretNum));

        //INPUT
        //The Counter For Both Col and Row
        for (int rows = 0; rows < userInterface.length; rows++) {
            for (int col = 0; col < 5; col++) {

                //Getting the Input and Storing the data
                number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Insert Number " + (col + 1) + " for Row " + (rows + 1)));

                //-The Validation of The Numbers-//
                if (number > 0 && 40 >= number) {

                    //Adding number into Our 2D Array
                    userInterface[rows][col] = number;

                    //To see if there is Duplicates
                    for (int c = 0; c < col; c++) {
                        if (userInterface[rows][c] == userInterface[rows][col]) {
                            JOptionPane.showMessageDialog(null, "Number: " + number + " already exists in your Ticket, Please Try Again: " + (rows + 1));
                            col -= 1;
                        }
                    }
                    //End of Duplicate Check

                } else {
                    JOptionPane.showMessageDialog(null, "Insert an valid number 1 - 40");
                    col -= 1;

                } //<-----End of Validation
            } //<------End of counting rows

        }

        myLotto.setUserInterface(userInterface);
        myLotto.computeNums();

        //Output for the winning numbers
        System.out.println("Your Entered Numbers Are");
        System.out.println(Arrays.deepToString(userInterface));
        System.out.println("You have guessed  " + myLotto.getLine1() + " number(s) in line 1");
        System.out.println("You have guessed  " + myLotto.getLine2() + " number(s) in line 2");
        System.out.println("You have guessed  " + myLotto.getLine3() + " number(s) in line 3");

    }

}
