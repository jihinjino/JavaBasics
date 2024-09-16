package com.string;

public class RemoveDuplicate {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s = "Programming";
        String ss = "";
        
        for (int i = 0; i < s.length(); i++) {
      
            if (ss.indexOf(s.charAt(i)) == -1) {
                ss = ss + s.charAt(i);  
            }
        }
        System.out.println(ss);
    }

}
