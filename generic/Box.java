package generic;
import java.util.List;
import java.util.ArrayList;

public class Box<T> {
    private List<T>  content;

    public Box(){
        content = new ArrayList<>();
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
