package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacky on 15/7/25.
 */
public class Lists {

    public static<E> List<E> newArrayList(E... elements){
        List<E> result = new ArrayList<E>();
        for (E element : elements) {
            result.add(element);
        }
        return result;
    }
}
