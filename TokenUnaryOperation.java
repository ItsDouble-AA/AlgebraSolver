public class TokenUnaryOperation extends Token{
    private String operation;
    private Token token;
    public TokenUnaryOperation(String operation){
        this.operation=operation;
        token=null;
    }
    public TokenUnaryOperation(String operation, Token t){
        this.operation=operation;
        token=t;
    }
    public String toString(){
        return operation+token.toString();
    }
}