class Solution {
    public String smallestPalindrome(String s) {
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        StringBuilder left = new StringBuilder();
        char middle = '\0';
        for(int i=0;i<26;i++){
            if(ch[i]%2==1){
                middle=(char)(i+'a');
            }
            for(int j=0;j<ch[i]/2; j++){
                left.append((char)(i+ 'a'));
            }
        }
        StringBuilder right = new StringBuilder(left);
        right.reverse();
        if(middle == '\0'){
            return left.toString()+right.toString();
        }
        return left.toString() + middle + right.toString();
    }
}