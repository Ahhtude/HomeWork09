import java.util.HashSet;
import java.util.Set;

public class AnyObjectStore1 <T> {

    private Set<T> objectStore1 = new HashSet<>();

    public void AddObjectToStore1 (Object object){
        T addObject = (T) object;
        objectStore1.add(addObject);
    }

    public void RemoveObjectFromStore1 (Object object){
        T removeObject = (T) object;
        objectStore1.remove(object);

    }
    public void ContainsInObjectStore1 (Object object){
        T objectForSearch = (T) object;
        objectStore1.contains(object);
    }

}

