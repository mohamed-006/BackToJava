package Blind_75;

public class Merge_Strings_Alternately {
    public String mergeAlternately(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int minLength = Math.min(s1.length(), s2.length());
        for(int i = 0; i < minLength; i++){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        if(s1.length() > s2.length()){
            sb.append(s1.substring(minLength));
        }else{
            sb.append(s2.substring(minLength));
        }
        return sb.toString();
    }
}
