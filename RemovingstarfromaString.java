/*class Solution {
    public String removeStars(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int i=0;i<c.length;i++){
            if(c[i]=='*'){
               sb.deleteCharAt(c[i]);
                sb.deleteCharAt(c[i-1]);

            }
            //else
            //return s;
        }
        return s;
    }
}*/
class Solution {
    public String removeStars(String s) {
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                c.deleteCharAt(c.length() - 1);
            } else {
                c.append(s.charAt(i));
            }
        }
        return c.toString();
    }
}
