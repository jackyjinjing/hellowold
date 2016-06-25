import util.Lists;

import java.util.List;

/**
 * Created by jacky on 15/7/19.
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello,world");
        List<Integer> integerList = Lists.newArrayList(1,2,3,4,5);
        integerList.stream().forEach(System.out::println);
    }
}
