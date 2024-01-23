class Solution {
    public String generateTheString(int n) {
      return (n%2 == 0) ? "p".repeat(n-1) + "z" : "p".repeat(n);
  		// String str= "";
  		// for(int i = 0; i < n-1; i++)
  		// 	str += 'a';
      // return ((n%2 == 1) ? (str+='a') : (str+='b'));
        
    }
}
