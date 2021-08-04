class Solution{
    String longestPalindrome(String S){
     int max_length=1;
     int start=0;
     int len=S.length();
     int low,high;
     for(int i=1;i<len;i++){
         low=i-1;
         high=i;
         while(low>=0 && high<len && S.charAt(low)==S.charAt(high)){
             --low;
             ++high;
         }
         ++low; --high;
         if(S.charAt(low)==S.charAt(high) && high-low+1>max_length){
             start=low;
             max_length=high-low+1;
         }
         low=i-1;  //for odd sized string with a common character as center of palindrome.
         high=i+1;
         while(low>=0 && high<len && S.charAt(low)==S.charAt(high)){
             --low;
             ++high;
         }
         ++low; --high;
         if(S.charAt(low)==S.charAt(high) && high-low+1>max_length){
             start=low;
             max_length=high-low+1;
         }
     }
     return S.substring(start,start+max_length);
    }
}
