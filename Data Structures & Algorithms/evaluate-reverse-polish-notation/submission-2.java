class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
          
            String token=tokens[i];
            
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") ){
                if(s.size()<2){
                    return 0;
                }
                int a=s.pop();
                int b=s.pop();
                 int res=0;
                if(token.equals("+")){
                     res=b+a;
                }else if(token.equals("-")){
                     res=b-a;
                }else if(token.equals("*")){
                     res=b*a;
                }else {
                     res=b/a;
                }
               
                s.push(res);
            }else{      
            
            s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}
