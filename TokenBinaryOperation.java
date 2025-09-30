public class TokenBinaryOperation extends Token{
    private String operation;
    private Token token1;
    private Token token2;
    public TokenBinaryOperation(String operation){
        this.operation=operation;
        token1=null;
        token2=null;
    }
    public TokenBinaryOperation(String operation,Token t1, Token t2){
        this.operation=operation;
        token1 = t1;
        token2 = t2;
    }
    public String toString(){
        return "("+token1.toString()+operation+token2.toString()+")";
    }
}