/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdecrypter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Caleb
 */
public class MessageCharacter {
    public char MessageCharacter;
    public char ActualCharacter;
    public Map<Character, Double> probabilityDistribution;
    public ArrayList<Double> probabilityDistributions; //an array of the prob
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
    
    public void computeProbabilityDistribution(ArrayList<MessageCharacter> messageContent, int index) {
        
    }
    public void sortHashMap() {
        
    }
    public void initHashMap() {
        probabilityDistribution = new HashMap();
        probabilityDistribution.put('e', 0.0);
        probabilityDistribution.put('t', 0.0);
        probabilityDistribution.put('a', 0.0);
        probabilityDistribution.put('o', 0.0);
        probabilityDistribution.put('i', 0.0);
        probabilityDistribution.put('n', 0.0);
        probabilityDistribution.put('s', 0.0);
        probabilityDistribution.put('r', 0.0);
        probabilityDistribution.put('h', 0.0);
        probabilityDistribution.put('d', 0.0);
        probabilityDistribution.put('l', 0.0);
        probabilityDistribution.put('u', 0.0);
        probabilityDistribution.put('c', 0.0);
        probabilityDistribution.put('m', 0.0);
        probabilityDistribution.put('f', 0.0);
        probabilityDistribution.put('y', 0.0);
        probabilityDistribution.put('w', 0.0);
        probabilityDistribution.put('g', 0.0);
        probabilityDistribution.put('p', 0.0);
        probabilityDistribution.put('b', 0.0);
        probabilityDistribution.put('v', 0.0);
        probabilityDistribution.put('k', 0.0);
        probabilityDistribution.put('x', 0.0);
        probabilityDistribution.put('q', 0.0);
        probabilityDistribution.put('j', 0.0);
        probabilityDistribution.put('z', 0.0);
    }
}
