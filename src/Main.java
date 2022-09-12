import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ksenia", "Myalik", Gender.FEMALE);
        Person person2 = new Person("Ksenia", "Myalik",Gender.FEMALE);
        Person person3 = new Person("Andrew", "Unknown",Gender.MALE);
        Person person4 = new Person("Kate", "White",Gender.FEMALE);
        Person person5 = new Person("Andrew", "Unknown",Gender.MALE);

        List<Person> peopleList = new ArrayList();
        peopleList.add(0,person1);
        peopleList.add(1, person2);
        peopleList.add(2, person3);
        peopleList.add(3, person4);
        peopleList.add(4, person5);

        System.out.println("Array List");
        for (int i=0; i<peopleList.size(); i++) {
            System.out.println(peopleList.get(i));
        }
        System.out.println("Array List size: " + peopleList.size() + "\n");

        Set<Person> peopleSet = new HashSet<>(peopleList);
        System.out.println("Hash Set");
        Iterator itr = peopleSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Hash Set size: " + peopleSet.size() + "\n");

        Map<Integer, Person> peopleHashmap = new HashMap<>();
        peopleHashmap.put(1,person1);
        peopleHashmap.put(2,person2);
        peopleHashmap.put(3,person3);
        peopleHashmap.put(4,person4);
        peopleHashmap.put(5,person5);
        //System.out.println("HashMap: " + peopleHashmap);
        for (Integer key : peopleHashmap.keySet())
            System.out.println("Key = " + key + ", " + peopleHashmap.get(key));
        System.out.println("HashMap Size: " + peopleHashmap.size());
    }
}


enum Gender {
    MALE,
    FEMALE,
}