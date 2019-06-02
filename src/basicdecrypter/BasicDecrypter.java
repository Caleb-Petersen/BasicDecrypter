/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdecrypter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Caleb
 */
public class BasicDecrypter {

    public ArrayList<MessageCharacter> messageContent;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [] frequencyLetters = {'e', 't','a','o', 'i','n','s','r','h',
            'd','l','u','c','m','f','y','w','g','p','b','v','k','x','q','j','z'
        };
        
        Map<Character,Double> frequencyMap = new HashMap();
        updateFrequencyMap(frequencyMap);
        
        ArrayList<MessageCharacter> messageCharacters = new ArrayList();
        Message message = new Message();
        message.getCipherMessage();
        char [] messageCharArray = message.codedMessage.toCharArray();
        
        int blankSpaces = 0;
        //create an array of all of the characters that appear in the message
        //in no particular order, spaces and repeats are removed
        for(int i=0; i<message.codedMessage.length(); i++) {
            if(charIsSpace(messageCharArray[i]) == false) {
                if(charAlreadyAdded(messageCharArray[i], messageCharacters) == false) {
                    messageCharacters.add(new MessageCharacter(messageCharArray[i]));
                }
            }else {
                blankSpaces++;
            }
        }
        //Calculate the frequency of each occuring letter in the message 
        //frequency is measured in the number of occurances
        for(int i=0; i<messageCharacters.size(); i++) {
            for(int j=0; j<message.codedMessage.length(); j++) {
                if(messageCharArray[j] == messageCharacters.get(i).MessageCharacter) {
                    messageCharacters.get(i).frequency++;
                }
            }
        }
        sortByFrequency(messageCharacters); //the messageCharacters are now sorted
        
        for(int i=0; i<messageCharacters.size(); i++) {
            messageCharacters.get(i).ActualCharacter = frequencyLetters[i];
        }

        for(int i=0; i<messageCharacters.size(); i++) {
            //System.out.println("frequency is " + message2.get(i).frequency);
            double frequency = ((((double)messageCharacters.get(i).frequency)/(message.codedMessage.length()-blankSpaces))*100);
            System.out.println(Character.toString(messageCharacters.get(i).MessageCharacter) + " corresponds to " + Character.toString(messageCharacters.get(i).ActualCharacter) + " with frequency " + frequency);
        }

    }
    
    public static boolean charAlreadyAdded(char c, ArrayList<MessageCharacter> messageCharacters) {
        int size = messageCharacters.size();
        for(int i=0; i<size; i++) {
            if(c == messageCharacters.get(i).MessageCharacter) {
                return true;
            }
        }
        return false;
    }
    public static boolean charIsSpace(char c) {
        return Character.getType(c) == 12;
    }
    
    public static char getActualChar(ArrayList<MessageCharacter> messageCharacters, char messageChar) {
        for(int i=0; i<messageCharacters.size(); i++) {
            if(messageCharacters.get(i).MessageCharacter == messageChar) {
                return messageCharacters.get(i).ActualCharacter;
            }
        }
        return 'a';
    }
    public static void sortByFrequency(ArrayList<MessageCharacter> messageCharacters) {
        
        for(int i=0; i<messageCharacters.size()-1; i++) {
            for(int j=(i+1); j < messageCharacters.size(); j++) {
                if(messageCharacters.get(i).frequency < messageCharacters.get(j).frequency) {
                    MessageCharacter temp = new MessageCharacter(messageCharacters.get(i).MessageCharacter,
                            messageCharacters.get(i).ActualCharacter,messageCharacters.get(i).frequency);
                    
                    
                    messageCharacters.get(i).ActualCharacter = messageCharacters.get(j).ActualCharacter;
                    messageCharacters.get(i).MessageCharacter = messageCharacters.get(j).MessageCharacter;
                    messageCharacters.get(i).frequency = messageCharacters.get(j).frequency;
                    
                    messageCharacters.set(j, temp);
                }
            }   
        }
    }
    
    public static void updateFrequencyMap(Map<Character,Double> frequencyMap) {
        frequencyMap.put('e', 12.02);
        frequencyMap.put('t', 9.10);
        frequencyMap.put('a', 8.12);
        frequencyMap.put('o', 7.68);
        frequencyMap.put('i', 7.31);
        frequencyMap.put('n', 6.95);
        frequencyMap.put('s', 6.28);
        frequencyMap.put('r', 6.02);
        frequencyMap.put('h', 5.92);
        frequencyMap.put('d', 4.32);
        frequencyMap.put('l', 3.98);
        frequencyMap.put('u', 2.88);
        frequencyMap.put('c', 2.71);
        frequencyMap.put('m', 2.61);
        frequencyMap.put('f', 2.30);
        frequencyMap.put('y', 2.11);
        frequencyMap.put('w', 2.09);
        frequencyMap.put('g', 2.03);
        frequencyMap.put('p', 1.82);
        frequencyMap.put('b', 1.49);
        frequencyMap.put('v', 1.11);
        frequencyMap.put('k', 0.69);
        frequencyMap.put('x', 0.17);
        frequencyMap.put('q', 0.11);
        frequencyMap.put('j', 0.10);
        frequencyMap.put('z', 0.07);
    }
}
