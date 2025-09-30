public class TokenValue extends Token{
    private String name;
    public TokenValue(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name;
    }
}