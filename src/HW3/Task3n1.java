package HW3;

public class Task3n1 {
    //Распечатать символ a, так что в первой строке всего один символ, во второй - два,
    // в третьей - три, и так далее до 5.

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i ++) {
            for (int j = 0; j < i; j ++) {
                System.out.print ('a');
            }
            System.out.println ();
        }
    }
}
