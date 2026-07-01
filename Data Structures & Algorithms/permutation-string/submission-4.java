class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
        int length1=s1.length();
        int length2=s2.length();
        if(length1>length2){
            return false;
        }

       int freq1[]=new int[26];
       int freq2[]=new int [26];
        for(int i=0;i<length1;i++){
             freq1[s1.charAt(i)-'a']++;
             freq2[s2.charAt(i)-'a']++;
        }

        if(matches(freq1,freq2)){
            return true;
        }
        for(int i=length1;i<length2;i++){
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-length1)-'a']--;

            if(matches(freq1,freq2)){
                return true;
            }
        }
        return false;
        
    }
    public  boolean matches(int freq1[],int freq2[]){
            for(int i=0;i<26;i++){
                if(freq1[i]!=freq2[i]){
                    return false;
                }
            }
            return true;
        }
}
