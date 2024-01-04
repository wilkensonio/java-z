package except;

public class Custom extends Exception {

    public Custom(){
        super();
    } public Custom(String message){
        super(message);
    } public Custom(Exception e){
        super(e);
    }
}

class CheckVsUnchecked {
    void validString(String str) throws Custom{
        if (str.isEmpty())
            throw new Custom("String is empty");
    }
}
