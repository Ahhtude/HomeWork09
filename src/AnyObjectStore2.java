import java.util.ArrayList;
import java.util.List;

public class AnyObjectStore2 <T extends Number>{

    public static <T extends Number> void GenericAdd(ArrayList<T> list,T object ){
        list.add(object);
    }

    public static  <T extends Number> Object GenericRemove(ArrayList<T> list,T object ){
        Object removedObj = null;
        if (list.contains(object)){
            removedObj= object;
            list.remove(object);
        }
            return null;
    }

    public static  <T extends Number> boolean ContainsGeneric(ArrayList<T> list,T object ){
        if (list.contains(object)){
            return true;
        }
        return false;
    }
}
