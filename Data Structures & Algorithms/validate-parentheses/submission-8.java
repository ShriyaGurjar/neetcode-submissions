class Solution {
    public boolean isValid(String s) {
        Stack<Character>s1=new Stack <> ();
          if((s.length()%2) !=0){
            return false;
          }
         if(s.charAt(s.length()-1) == '(' ||s.charAt(s.length()-1)=='[' || s.charAt(s.length()-1)=='{' ){
            return false;
         }

       for(int i=0 ; i<s.length() ; i++){
        
        char c=s.charAt(i);
       
         if(c=='(' || c=='[' || c=='{' ){
             s1.push(c);
         }else{
            if(s1.isEmpty()){
                return false;
            }
            char top=s1.pop();

            if(top=='('){
                if(c!=')'){
                    return false;
                }
            }

            if(top=='['){
                if(c!=']'){
                    return false;
                }
            }

            if(top=='{'){
                if(c!='}'){
                    return false;
                }
            }
         }
       }
       if(!s1.isEmpty()){
          return false;
       }
       return true;
    }
}
