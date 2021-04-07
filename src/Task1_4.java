public class Task1_4 {

    public static void main(String[] args) {
        //Прибавьте к значению переменной z  такое число, чтобы получилось -2147483648
        int z = 2147483647;
        z = z + 1;
        System.out.println(z);
    }
}
