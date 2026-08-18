class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wCount=0;
        int aCount=0;

              
        while(wCount<word.length() && aCount<abbr.length()){
            if(Character.isDigit(abbr.charAt(aCount))){
                if(abbr.charAt(aCount)=='0'){
                    return false;
                }
              
                int num=0;
                 
                while(aCount<abbr.length() && Character.isDigit(abbr.charAt(aCount))){
                    num=num*10+abbr.charAt(aCount)-'0';
                    aCount++;
                    
                }
                wCount+=num;
            }else{
                                                                     if(word.charAt(wCount)!=abbr.charAt(aCount)){
                    return false;
                                                                                                }                                                              wCount++;                                                     aCount++;  
            }
        }
        return aCount==abbr.length() && wCount==word.length();
    }
}