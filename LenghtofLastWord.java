public class Solution {
    public int lengthOfLastWord(String s) {
      int ans = 0;
      for(int i = s.length()-1 ; i>=0; i--){
        if(s.charAt(i) !=' ' ){
          ans++;
        }
        if( i == 0 ||  s.charAt(i-1) == ' '  &&  s.charAt(i)!= ' ' ){
          return ans;
        }
      }
      return ans;
    }
}LenghtofLastWord{

}
