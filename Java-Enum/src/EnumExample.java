/**
 * @author ManhKM on 4/20/2022
 * @project Java-Enum
 */
public class EnumExample {
    enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        WeekDay d = WeekDay.MONDAY;
        System.out.println("EnumExample: "+d);
    }
}
