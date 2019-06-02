/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdecrypter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Caleb
 */
public class MessageCharacter {
    public char MessageCharacter;
    public char ActualCharacter;
    public double certainty; //A probability measure of the certainty that the actualCharacter value is correct
    public int frequency;
    
    public MessageCharacter(char c, char a, int f) {
        this.MessageCharacter = c;
        this.ActualCharacter = a;
        this.frequency = f;
    }
    public MessageCharacter(char character) {
        MessageCharacter = character;
        frequency = 0;
    }
}
