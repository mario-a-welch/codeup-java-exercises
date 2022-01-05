public class Person {
    //private name field that is a string
    private String name;

    //constructor that accepts a `String` value and sets the persons name to the passed string
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
        //TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.printf("%s says hello!", this.name);
    }

    public static void main(String[] args){
        //new person object and using above methods
        Person person1 = new Person("Maverick");

        System.out.println("person1 name is: " + person1.getName());

        person1.setName("Maverick Welch");

        System.out.println("person1 new name is: " + person1.getName());

        person1.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
