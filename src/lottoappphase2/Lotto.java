/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoproject1;

/**
 *
 * @author x15468652
 */
public class Lotto {

    private int secretNum[] = new int[5];
    private int userInterface[][] = new int[3][5];
    private int line1;
    private int line2;
    private int line3;

    public void setSecretNum(int[] secretNum) {
        this.secretNum = secretNum;
    }

    public int[] getSecretNum() {
        return secretNum;
    }

    public void setUserInterface(int[][] userInterface) {
        this.userInterface = userInterface;
    }

    public int[][] getUserInterface() {
        return userInterface;
    }

    public void compute() {
        for (int i = 0; i < secretNum.length; i++) {
            secretNum[i] = (int) Math.floor(1 + Math.random() * 40);
        }
                   
    }

    public int getLine1() {
        return line1;
    }

    public void setLine1(int line1) {
        this.line1 = line1;
    }

    public int getLine2() {
        return line2;
    }

    public void setLine2(int line2) {
        this.line2 = line2;
    }

    public int getLine3() {
        return line3;
    }

    public void setLine3(int line3) {
        this.line3 = line3;
    }
    
    public void computeNums(){
    
        
        //Checks each number
                    
     int i;
            for (int j = 0; j < 5; j++) {//K.C For loop used to go through the 5 index's
                i = 0;
                // i = 0 Line 1 // Line 3
                if (secretNum[j] == userInterface[i][0] || secretNum[j] == userInterface[i][1] || secretNum[j] == userInterface[i][2] || secretNum[j] == userInterface[i][3] || secretNum[j] == userInterface[i][4]) {
                    line1++;

                }
            }
            for (int j = 0; j < 5; j++) {//K.C For loop used to go through the 5 index's
                i = 1;
                //i = 1 Means Line 2 // Line 3
                if (secretNum[j] == userInterface[i][0] || secretNum[j] == userInterface[i][1] || secretNum[j] == userInterface[i][2] || secretNum[j] == userInterface[i][3] || secretNum[j] == userInterface[i][4]) {
                    line2++;

                }
            }

            for (int j = 0; j < 5; j++) {//K.C For loop used to go through the 5 index's
                i = 2;
                //i = 2 Means Line 3 // Line 3
                if (secretNum[j] == userInterface[i][0] || secretNum[j] == userInterface[i][1] || secretNum[j] == userInterface[i][2] || secretNum[j] == userInterface[i][3] || secretNum[j] == userInterface[i][4]) {
                    line3++;

                }
            }
    }

    
    

}
