class Solution {
    public int minOperations(String[] logs) {
        int parent=0;
        int main=0;
        int child=0;


        for(String log:logs){

            if(log.equals("../")){
                if(child>1){
                  
                  child--;
                    
                }else if(child==1){
                    child--;
                    
                }
            }else if(log.equals("./")) {

                continue;
            }else{
                main=0;
                child++;
            }
            
        }
        return child+main;
    }
}