package genericsChallenge1;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> toMap;

    public Layer() {
        this.toMap = new ArrayList<>();
    }

    public void addElement(T element){
        toMap.add(element);
    }

    public void renderLayer(){
        for (var element : toMap){
            element.render();
        }
    }
}
