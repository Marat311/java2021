package day40CustomClass_Statics;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlocks {
    public static int a = 11;
    String id = "123";

    public static ArrayList<String> list = new ArrayList<>();

static {
    list.addAll(Arrays.asList("A", "B", "C"));
}
    public static void main(String[] args) {
        list.addAll(Arrays.asList("A", "B", "C"));
        System.out.println(list);

        StaticBlocks s = new StaticBlocks();
        s.a = 20;
        StaticBlocks s2 = new StaticBlocks();

        System.out.println(s.a);
        //System.out.println(id+1);
    }


}

class Test{

    public static void main(String[] args) {
        System.out.println(StaticBlocks.list);
    }
}