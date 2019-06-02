/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdecrypter;

import java.util.Scanner;

/**
 *
 * @author Caleb
 */
public class Message {
    public String codedMessage;
    public Message () {
        this.codedMessage = "";
    }
    
    public void getCipherMessage() {
        this.codedMessage = "";
        
        System.out.println("Please enter your cipher text you want to be decrypted. A reasonably large \n"
                + "sample size may be required to get good data\n");
        Scanner in = new Scanner(System.in);
        this.codedMessage = in.nextLine().toLowerCase();
        
    }
}
