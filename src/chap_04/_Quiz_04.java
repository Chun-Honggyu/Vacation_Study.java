package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 0;
        boolean lightWeight= false;
        boolean disabled = true;
        int charge = 0;
        int passedHour = 10;

        while (hour < passedHour) {
            charge += 4000;
            if (charge >= 30000) {
               charge = 30000;
               break;
            }
            hour++;
        }
        if (lightWeight) {
            charge /= 2;
        }
        if (disabled) {
            charge /= 2;
        }

        System.out.println("주차요금: " + charge);
    }
}
