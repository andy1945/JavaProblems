package kutsandy.problems;
/*
* Write a function to find the longest prefix string amongst an array of string
* if there is no common prefix, return an empty string ""
* */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String [] str){
       //if the string is empty
        if(str.length == 0) return "";
        int length = str[0].length();
        //We compare the first string against the rest hence i starts from 1
        for (int i =1; i<str.length; i++){
            //Get the smallest length of the two and update length
            length = Math.min(length, str[i].length());

            for(int j =0; j< length; j++){
                char c = str[0].charAt(j), d = str[i].charAt(j);
                if(c!=d){
                    System.out.println(c+ "!=" +d+" ==and j="+j);
                    length = j;
                    break;
                }
            }

        }

        return str[0].substring(0,length);

    }

    public static void main(String[] args){
        String[] test = {"flnower","flnow","flnight"};
        System.out.println(longestCommonPrefix(test));
    }
}
