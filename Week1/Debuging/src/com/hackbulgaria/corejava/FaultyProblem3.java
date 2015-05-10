package com.hackbulgaria.corejava;

public class FaultyProblem3 {
    
    public String reverseEveryWordInString(String sentence){
        String[] words = sentence.split(" ");
        String str = "";
        for (String word: words){
            str += reverse(word)+" ";
        }
        return str.trim();
    }

    private CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
}
