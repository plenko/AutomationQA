public class task1_5 {
    public static void main(String[] args) {
        /*Цена товара А = 1000
Цена товара Б = 500
при покупке сразу Товра А и товара Б , на общую сумму действует скдика 10%
Выведите на экран сумму товара со скидкой
И выведите на экран сумму этой скидки
*/
        int  PriceProductA = 1000;
        int  PriceProductB = 500;
        double Discount = 0.1;

        System.out.println("Сумма товара  со скидкой " + (PriceProductA + PriceProductB)*(1 - Discount) + ". Сумма скидки " + (PriceProductA + PriceProductB)*Discount);

    }
}
