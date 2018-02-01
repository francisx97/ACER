/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoappphase2;

/**
 *
 * @author x15392331
 */
public class LottoPhase2GenNums {
    
    //Declare 1D and 2D Arrays
    private int secret[] = new int[5];
    private int secretPlusOne[] = new int[5];
    private int secretPlusTwo[] = new int[5];
    
    //Set Mehtods
    public void setSecret(int[] secret) {
        this.secret = secret;
    }

    public void setSecretPlusOne(int[] secretPlusOne) {
        this.secretPlusOne = secretPlusOne;
    }

    public void setSecretPlusTwo(int[] secretPlusTwo) {
        this.secretPlusTwo = secretPlusTwo;
    }
    
    //Generate Random Numbers To Be Used 
    public void computeRandomNums() {
        for (int i = 0; i < secret.length; i++) {
            secret[i] = (int) Math.floor(1 + Math.random() * 40);
        }

        for (int k = 0; k < secretPlusOne.length; k++) {
            secretPlusOne[k] = (int) Math.floor(1 + Math.random() * 40);

        }

        for (int l = 0; l < secretPlusTwo.length; l++) {
            secretPlusTwo[l] = (int) Math.floor(1 + Math.random() * 40);
        }

    }
    
    //Get Methods
    public int[] getSecret() {
        return secret;
    }

    public int[] getSecretPlusOne() {
        return secretPlusOne;
    }

    public int[] getSecretPlusTwo() {
        return secretPlusTwo;
    }
    
    

}
