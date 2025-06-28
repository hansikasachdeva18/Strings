Solution Using trim and split

class Solution {
    public String reverseWords(String s) {
        String words[]= s.trim().split("\\s+");
        // trim karne se aage piche k spaces chale gaye 
        // split se array mai convery ho jaega
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()>0){
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.substring(0,sb.length()-1).toString();
        
    }
}
