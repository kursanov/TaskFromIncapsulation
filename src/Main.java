import enums.Status;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setMarka("Honda");
        car1.setModel("Accord");
        car1.setColor("Black");
        car1.setPrice(25000);


        Car car2 = new Car();
        car2.setMarka("Honda");
        car2.setModel("Accord");
        car2.setColor("Black");
        car2.setPrice(25000);


        Car car3 = new Car();
        car3.setMarka("Honda");
        car3.setModel("Accord");
        car3.setColor("Black");
        car3.setPrice(25000);


        Car car4 = new Car();
        car4.setMarka("Honda");
        car4.setModel("Accord");
        car4.setColor("Black");
        car4.setPrice(25000);


        Car[] cars = new Car[]{car1,car2,car3,car4};
//        System.out.println(Arrays.toString(cars));



        Person person1 = new Person();
        person1.setName("Aizhamal");
        person1.setLastName("Asangazyeva");
        person1.setAge(18);
        person1.setProfession("Programmer");

        Person person2 = new Person();
        person2.setName("Aizhamal");
        person2.setLastName("Asangazyeva");
        person2.setAge(18);
        person2.setProfession("Programmer");

        Person person3 = new Person();
        person3.setName("Aizhamal");
        person3.setLastName("Asangazyeva");
        person3.setAge(18);
        person3.setProfession("Programmer");


        Person[] people = new Person[]{person1,person2,person3};
//        System.out.println(Arrays.toString(people));


        School school1 = new School();
        school1.setNames("Toktogul");
        school1.setAddress("Chon-Kara");
        school1.setStatus(Status.PUBLIC);


        School school2 = new School();
        school2.setNames("Toktogul");
        school2.setAddress("Chon-Kara");
        school2.setStatus(Status.PUBLIC);


        School school3 = new School();
        school3.setNames("Toktogul");
        school3.setAddress("Chon-Kara");
        school3.setStatus(Status.PRIVATE);


        School[] schools = new School[]{school1,school2,school3};
        System.out.println(Arrays.toString(schools));

        University university1 = new University();
        university1.setNames("Slavianskiy");
        university1.setAddress("Bishkek");
        university1.setStatus(Status.PRIVATE);


        University university2 = new University();
        university2.setNames("Slavianskiy");
        university2.setAddress("Bishkek");
        university2.setStatus(Status.PRIVATE);


        University university3 = new University();
        university3.setNames("Slavianskiy");
        university3.setAddress("Bishkek");
        university3.setStatus(Status.PRIVATE);


        University[] universities = new University[]{university1,university2,university3};
        System.out.println(Arrays.toString(universities));















    }
}