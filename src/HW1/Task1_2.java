package HW1;

public class Task1_2 {

    public static void main(String[] args) {

        //2. Создайте переменную grade со значением 10
        String name = "Ivan";
        double grade = 10;

        //3. Увеличьте значение переменной grade на 5
        grade = grade+5;

        //4. Выведите в терминал строку, в которой будет написано, «Grade пользователя Ivan равен 15» (используя переменные)
        System.out.println("Grade пользователя " + name + " равен " +  grade);
        //5. Создайте  переменную admin 2
        String admin2;

        //6. Установите для него имя и grade, который будет в 2 раза меньше, чем у Ivan
        admin2 = "Petr";
        double grade2 = grade/2;

        //7. Выведите в терминал строку, в которой будет написано, какой grade у admin2
        System.out.println("Grade пользователя " + admin2 + " равен " +  grade2);

    }
}
