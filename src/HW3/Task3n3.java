package HW3;

public class Task3n3 {

    /*Одноклеточная амеба каждые 3 часа делится на 2 клетки. Необходимо определить,
     сколько амеб будет через 3, 6, 9, 12,..., 24 часа*/

    public static void main(String[] args) {

        int a = 1;
        int hour = 0;

        while ( hour < 25){
            a = a * 2;
            System.out.println("На " + hour + " часу будет " + a + " амеб" );
            hour = hour + 3;
        }

    }

}
