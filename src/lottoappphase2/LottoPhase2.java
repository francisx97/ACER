/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoappphase2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author x15392331
 */
public class LottoPhase2 {
    //Declare Data Members
    private String game;
    private int usernum1;
    private int usernum2;
    private int usernum3;
    private int usernum4;
    private int usernum5;
    private int[] secret;
    private int[] secretPlusOne;
    private int[] secretPlusTwo;
    private int line1;
    private int line2;
    private int line3;
    private ArrayList<LottoPhase2> Array;

    public LottoPhase2() {
        
        this.game = new String();
        this.usernum1 = 0;
        this.usernum2 = 0;
        this.usernum3 = 0;
        this.usernum4 = 0;
        this.usernum5 = 0;
        this.line1 = 0;
        this.line2 = 0;
        this.line3 = 0;
    }

    public LottoPhase2(int[] secret, ArrayList<LottoPhase2> Array) {
        this.secret = secret;
        this.Array = Array;
    }
    
    //Set Mehods
    public void setGame(String game) {
        this.game = game;
    }

    public void setUsernum1(int usernum1) {
        this.usernum1 = usernum1;
    }

    public void setUsernum2(int usernum2) {
        this.usernum2 = usernum2;
    }

    public void setUsernum3(int usernum3) {
        this.usernum3 = usernum3;
    }

    public void setUsernum4(int usernum4) {
        this.usernum4 = usernum4;
    }

    public void setUsernum5(int usernum5) {
        this.usernum5 = usernum5;
    }

    public void setSecret(int[] secret) {
        this.secret = secret;
    }

    public void setLine1(int line1) {
        this.line1 = line1;
    }

    public void setArray(ArrayList<LottoPhase2> Array) {
        this.Array = Array;
    }

    public void setSecretPlusOne(int[] secretPlusOne) {
        this.secretPlusOne = secretPlusOne;
    }

    public void setSecretPlusTwo(int[] secretPlusTwo) {
        this.secretPlusTwo = secretPlusTwo;
    }

    public void setLine2(int line2) {
        this.line2 = line2;
    }

    public void setLine3(int line3) {
        this.line3 = line3;
    }
    
    //Comparing User Input With ArrayList
    public void comparingNumbers() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                LottoPhase2 Lotto;
                Lotto = Array.get(i);
                if (Lotto.getGame().equals("lotto")) {
                    if (secret[j] == Lotto.getUsernum1() || secret[j] == Lotto.getUsernum2() || secret[j] == Lotto.getUsernum3() || secret[j] == Lotto.getUsernum4() || secret[j] == Lotto.getUsernum5()) {
                        line1++;

                    }
                }
                if (Lotto.getGame().equals("plus1")) {
                    if (secretPlusOne[j] == Lotto.getUsernum1() || secret[j] == Lotto.getUsernum2() || secret[j] == Lotto.getUsernum3() || secret[j] == Lotto.getUsernum4() || secret[j] == Lotto.getUsernum5()) {
                        line2++;
                    }
                }
                if (Lotto.getGame().equals("plus2")) {
                    if (secretPlusTwo[j] == Lotto.getUsernum1() || secret[j] == Lotto.getUsernum2() || secret[j] == Lotto.getUsernum3() || secret[j] == Lotto.getUsernum4() || secret[j] == Lotto.getUsernum5()) {
                        line3++;
                    }
                }
            }
        }
    }
    
    //Get Methods
    public String getGame() {
        return game;
    }

    public int getUsernum1() {
        return usernum1;
    }

    public int getUsernum2() {
        return usernum2;
    }

    public int getUsernum3() {
        return usernum3;
    }

    public int getUsernum4() {
        return usernum4;
    }

    public int getUsernum5() {
        return usernum5;
    }

    public int[] getSecret() {
        return secret;
    }

    public int getLine1() {
        return line1;
    }

    public int[] getSecretPlusOne() {
        return secretPlusOne;
    }

    public int[] getSecretPlusTwo() {
        return secretPlusTwo;
    }

    public int getLine2() {
        return line2;
    }

    public int getLine3() {
        return line3;
    }

    public ArrayList<LottoPhase2> getArray() {
        return Array;
    }

}
