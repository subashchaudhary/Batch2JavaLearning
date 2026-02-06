package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args){
        //Genneric is solution for type safty in collection framework

        List<Integer> list = new ArrayList();

        list.add(2);
        list.add(10);
        list.add(24);

        System.out.println(list.toString());

        List<String> names = new ArrayList<>();
        names.add("santosh");
        names.add("Denis");

        System.out.println(names.toString());

        List<Student> students = new ArrayList<>();
        students.add(new Student("santosh", "ktm"));
        students.add(new Student("Denis", "bhaktapur"));

        System.out.println(students);

    }
}


class Student {
    private String name;
    private String address;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //packagname.Classname$hascode

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
        }
}
