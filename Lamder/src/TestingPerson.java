import java.util.*;

public class TestingPerson {

    public static void main(String[] args){
        List<Person>  people = Arrays.asList(
                new Person("Charls","Diskens",24),
                new Person("james","Cuke",28),
                new Person("Calse","Cake",9),
                new Person("zerd","kings",13)
        );

        // sort list by last name
       sortTheList(people);
        // create method tha prints all elements in the list
         display(people);
        // create a method that prints all people that have last name beginning with c
         nameswithC(people);
    }

    public static void sortTheList(List list){
        Comparator<Person> byLastName = (o1, o2) -> o1.getLastName().compareTo(o2.getFirstName());



//               new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//
//                return o1.getLastName().compareTo(o2.getFirstName());
//            }
//        };

        Collections.sort(list,byLastName);
    }
    public static void display(List list){

      list.stream().forEach(x -> System.out.println(x));

    }

    public static void nameswithC(List<Person> person){

        System.out.println();
        person.stream().filter(person1 -> person1.getFirstName().startsWith("C")).forEach(x -> System.out.println(x));

//        for (Person people: person ){
//
//
//            if (people.getLastName().startsWith("C")){
//                System.out.println(people.toString());
//            }
//        }

    }


}
