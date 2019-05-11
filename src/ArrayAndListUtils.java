import java.util.ArrayList;
import java.util.List;

public class ArrayAndListUtils {

    public static List changeElements(List list, int n, int m) {
        List returnlist = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            if (i == n) {
                returnlist.add(i, m);
            } else if (i == m) {
                returnlist.add(i, n);
            } else returnlist.add(i, list.get(i));

        }
        return returnlist;
    }
    public static <T extends Comparable> Integer maxMinValues(List <Integer> list, int n, int m){
        Integer maxValue =0;
        for (int i=n;i<=m;i++){
            if (list.get(i)>=maxValue){
                maxValue=list.get(i);
            }
        }
        return maxValue;
    }


}
