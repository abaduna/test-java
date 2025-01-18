package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TTD {
    public static List<String> pshisAndBus(){
        List<String> numb = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                numb.add("fiizBuz");
            } else if (i % 5 == 0) {
                numb.add("buz");
            } else if (i % 3 ==0) {
                numb.add("fiiz");
            }else {
                numb.add(String.valueOf(i));
            }

        }
        return numb;
    }
}
