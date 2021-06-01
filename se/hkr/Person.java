package se.hkr;

public class Person {

    private  String name;
    private int age;


    public String reversedName(String name){
        StringBuilder reversedname = new StringBuilder();

        // append a string into StringBuilder reversedname
        reversedname.append(this.name);

        // reverse StringBuilder reversedname
        reversedname.reverse();

        // print reversed String
        System.out.println(name);
        System.out.println(reversedname);
   //  return reversedname.toString();
        return "";
    }


    public Person(String name, int age) {
        this.name = name;
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public String getName() {
   //    return name;
        return "";
    }

    public void setName(String name) {
        this.name = name;
   //     this.name = " ";
    }

    public int getAge() {
       // return age;
        return 0;
    }

    public void setAge(int age) {
//        if (age < 0)
//            age  = 0;
//        this.age = age;

    }
}
