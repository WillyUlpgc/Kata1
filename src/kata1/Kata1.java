package kata1;

import java.util.GregorianCalendar;
import java.util.Calendar;


public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(2001, 1, 1);
        
        Person person = new Person("Pepe", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
        
    }
    
}


