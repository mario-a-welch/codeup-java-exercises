import java.util.Arrays;

public class ArraysExercises {
    //Create a static method named addPerson.  It should accept an array of Person objects, as well as a single person object to the passed array.It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] person, Person human){
        int length = person.length;
        Person[] copyOfArray = Arrays.copyOf(person, length + 1);
        copyOfArray[length] = new Person(human.getName());
        return copyOfArray;
    }


    public static void main(String[] args){
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        When the above code is ran, it returns [I@4b28fbd8

//        System.out.println(Arrays.toString(numbers));
//        When the above code is ran, it returns [1, 2, 3, 4, 5]

// Create an array that holds 3 Person objects.  Assign a new instance of the Person class to each element.  Iterate through the array and print out the name of each person in the array.

        Person[] person = new Person[3];

        person[0] = new Person("Mario");
        person[1] = new Person("Alexis");
        person[2] = new Person("Maverick");

        for(Person human : person){
            System.out.println(human.getName());
        }

        //Clone of array with newly passed person object
        Person[] newHuman = addPerson(person, new Person("Keith"));
        for(Person human : newHuman){
            System.out.println(human.getName());
        }
    }
}
