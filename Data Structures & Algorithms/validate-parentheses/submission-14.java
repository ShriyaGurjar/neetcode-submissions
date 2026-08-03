class Solution {
    public boolean isValid(String s) {
        Stack<Character>s1=new Stack<>();
        if((s.length()%2 )!=0){
            return false;
        }
        
       
        int i=0;
            while(i<s.length()){

                

       if(s.charAt(i)=='('  || s.charAt(i)=='{' || s.charAt(i)=='['){
                
                s1.push(s.charAt(i));
                

            }else if(s.charAt(i)==')'  || s.charAt(i)=='}' || s.charAt(i)==']'){
                
              if (s1.isEmpty()) {
    return false;
}     
                char a=s1.pop();
               if ((a == '(' && s.charAt(i) != ')') ||
    (a == '{' && s.charAt(i) != '}') ||
    (a == '[' && s.charAt(i) != ']')) {
    return false;
}
            }
            
            
          i++;
    }
    return s1.isEmpty();
}
}
