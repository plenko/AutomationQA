public class task1_6 {

    public static void main(String[] args) {
        //а) товар А стоит 200 руб и на него скидка 15%, а товар Б стоит 30 руб.
        // Клиент взял 10 A и 2 Б. Выведите итоговую цену:
        int  PriceProductA = 200;
        int  PriceProductB = 30;
        double DiscountA = 0.15;
        double Order = 10 * (PriceProductA - PriceProductA*DiscountA) + 2 * PriceProductB;
        System.out.println(Order); //1760

        //б) товар А стоит 500 руб и на него скидка 50%, а товар Б стоит 50 руб.
        // Клиент взял 7 A и 1 Б. Выведите итоговую цену:
        int  PriceProductA2 = 500;
        int  PriceProductB2 = 50;
        double DiscountB = 0.5;
        double Order2 = 7 * (PriceProductA2 - PriceProductA2 * DiscountB) +  PriceProductB2;
        System.out.println(Order2); //1800

        //в) товар А стоит 300 руб и на него скидка 10%, а товар Б стоит 20 руб.
        // Клиент взял 2 A и 3 Б. Выведите итоговую цену.
        int  PriceProductA3 = 300;
        int  PriceProductB3 = 20;
        double DiscountC = 0.1;
        double Order3 = 2 * (PriceProductA3 - PriceProductA3 * DiscountC) +  3 * PriceProductB3;
        System.out.println(Order3); //600
    }
}
