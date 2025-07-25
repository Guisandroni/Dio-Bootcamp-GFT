import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] codes = {120,140,150,160,170};
        System.out.println(codes.length);

        List<Integer> listCodes = new LinkedList<>();

        listCodes.add(codes[2]);

        listCodes.forEach(System.out::println);

        listCodes.add(codes[3]);
        listCodes.forEach(System.out::println);

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("fia, uno,bmw,ferrari,volvo");

        System.out.println(cars);

        HashMap<String, String> countrys = new HashMap<String, String>();

        countrys.put("Brazil", "Usa");
        System.out.println(countrys);

        ArrayList<User> users=new ArrayList<>();

        users.add(new User("luiz",20));
        users.add(new User("joao",12));

        System.out.println(users);
        users.forEach(System.out::println);


        StringBuilder sbd = new StringBuilder();
        sbd.append("joao");
        sbd.append(" ");
        sbd.append("lucas");



        StringBuffer sbf = new StringBuffer();
        sbf.append("joao");
        sbf.append(" ");
        sbf.append("lucas");

    System.out.println(sbd.toString());

        System.out.println(sbf.toString());
    }
}