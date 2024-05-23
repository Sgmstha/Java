package SystemDefinedPackage;
import java.util.EnumMap;
import java.util.Map;

enum Days{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
}
public class EnumMapExample {
    public static void main(String[]args) {
            EnumMap<Days,String> daysEnumMap=new EnumMap(Days.class);
            daysEnumMap.put(Days.SUNDAY,"Regular class -JAVA");
            daysEnumMap.put(Days.MONDAY,"Regular class -JAVA");
            daysEnumMap.put(Days.TUESDAY,"LAB -JAVA");
            daysEnumMap.put(Days.WEDNESDAY,"Regular class -JAVA");
            daysEnumMap.put(Days.THURSDAY,"LAB -JAVA");
            daysEnumMap.put(Days.FRIDAY,"RELAX -JAVA");
            daysEnumMap.put(Days.SATURDAY,"HOLIDAY");

            System.out.println("sunday:"+daysEnumMap.get(Days.SUNDAY));
            System.out.println("monday:"+daysEnumMap.get(Days.MONDAY));
            System.out.println("tuesday:"+daysEnumMap.get(Days.TUESDAY));
            System.out.println("wednesday:"+daysEnumMap.get(Days.WEDNESDAY));
            System.out.println("thursday:"+daysEnumMap.get(Days.THURSDAY));
            System.out.println("friday:"+daysEnumMap.get(Days.FRIDAY));
            System.out.println("saturday:"+daysEnumMap.get(Days.SATURDAY));
    }






}
