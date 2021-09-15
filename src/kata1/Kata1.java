package kata1;

import java.time.*;


public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001, 1, 1);
        
        
        Person person = new Person("Pepe", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
        
    }
    
}


