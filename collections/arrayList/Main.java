package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<User> users = new ArrayList<>();


        var user = new collections.arrayList.User(1, "Matheus");
        users.add(user);
        users.add(new collections.arrayList.User(2, "Enzo"));
        users.add(new collections.arrayList.User(3, "Renato"));
        System.out.println(users);
        System.out.println(users.remove(new collections.arrayList.User(5, "Matheus")));
        System.out.println(users.remove(1));
        System.out.println(users);
        users.clear();
        System.out.println(users);


        /*System.out.println(users.contains(user));
        System.out.println(users.contains(new collections.arrayList.User(1, "Matheus")));
        System.out.println(new collections.arrayList.User(1, "Mateheus").equals(new collections.arrayList.User(1, "Mateheus")));*/
    }
}