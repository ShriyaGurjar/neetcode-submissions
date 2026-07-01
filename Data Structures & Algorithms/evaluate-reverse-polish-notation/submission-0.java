class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers=new Stack<>();

      for(int i=0; i<tokens.length ; i++){
          if(tokens[i].equals("+") || tokens[i].equals("-")|| tokens[i].equals("*")  || tokens[i].equals("/")){
            String c=tokens[i];
            
            if(c.equals("+")){
               int b= numbers.pop();
               int a=numbers.pop();
               int res=a+b;
               numbers.push(res);
            }
             if(c.equals("-")){
               int b= numbers.pop();
               int a=numbers.pop();
               int res=a-b;
               numbers.push(res);
            }
             if(c.equals("*")){
               int b= numbers.pop();
               int a=numbers.pop();
               int res=a*b;
               numbers.push(res);
            }
                if(c.equals("/")){
               int b= numbers.pop();
               int a=numbers.pop();
               int res=a/b;
               numbers.push(res);
            }
       
        }else{
          numbers.push(Integer.parseInt(tokens[i]));
            
        }
      }
      return numbers.peek();
    }
}
