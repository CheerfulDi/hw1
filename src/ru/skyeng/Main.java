package ru.skyeng;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        //задача 1

	byte cows = 1;
    short lambs = 222;
    int camels = -800;
    long sands = 4_000_000_000L;

    float saltWeight= 1.2f;
    double almostP= 3.1415926535;

        //задача 2

        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;

        double boxersWeight = boxerWeight1+boxerWeight2;
        double boxersWeightDifference = boxerWeight2%boxerWeight1;

        out.println("Общий вес двух боксеров составляет " + boxersWeight + " кг.");
        out.println("Разница в весе двух боксеров составляет " + boxersWeightDifference + " кг.");

    //задача 3

        int bananas = 5;
        int oneBananaWeight = 80;
        int bananasWeight = bananas*oneBananaWeight;

        int milk = 200; //мл
        int oneMilkWeight = 105;
        int milkWeight = (milk*oneMilkWeight)/100;

        int iceCream = 2;
        int oneIceCreamWeight = 100;
        int iceCreamWeight = iceCream*oneIceCreamWeight;

        int eggs = 4;
        int oneEggWeight = 70;
        int eggsWeight = eggs*oneEggWeight;

        int breakfastWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float breakfastWeightKilograms = breakfastWeightGrams/1000f;

        System.out.println("Общий вес спорт-завтрака составил " + breakfastWeightGrams + " гр.");
        System.out.println("Общий вес спорт-завтрака в килограммах составил " + breakfastWeightKilograms + " кг.");

        //Задача 4

        int loosingWeightTarget = 7*1000;
        int loosingWeightPerDayOne = 250;
        int loosingWeightPerDayTwo = 500;
        int daysOne = loosingWeightTarget/loosingWeightPerDayOne;
        int daysTwo = loosingWeightTarget/loosingWeightPerDayTwo;

        int averageLoosingWeightPerDay = (loosingWeightPerDayOne+loosingWeightPerDayTwo)/2;
        int averageDays = loosingWeightTarget/averageLoosingWeightPerDay;

        System.out.println("Если скидывать по 250 граммов в день, понадобится " + daysOne + " дней.");
        System.out.println("Если скидывать по 500 граммов в день, понадобится " + daysTwo + " дней.");
        System.out.println("В среднем, для достижения цели похудения понадобится "+ averageDays + " дней.");

        //Задача 5

        int MashaCurrentSalaryPerMonth = 67_760;
        int DenisCurrentSalaryPerMonth = 83_690;
        int ChristinaCurrentSalaryPerMonth = 76_230;

        float MashaNewSalaryPerMonth = MashaCurrentSalaryPerMonth*1.1f;
        float DenisNewSalaryPerMonth = DenisCurrentSalaryPerMonth*1.1f;
        float ChristinaNewSalaryPerMonth = ChristinaCurrentSalaryPerMonth*1.1f;

        System.out.println("Маша теперь получает " + MashaNewSalaryPerMonth + " рублей. Годовой доход вырос на " + (MashaNewSalaryPerMonth-MashaCurrentSalaryPerMonth)*12 + " рублей.");
        System.out.println("Денис теперь получает " + DenisNewSalaryPerMonth + " рублей. Годовой доход вырос на " + (DenisNewSalaryPerMonth-DenisCurrentSalaryPerMonth)*12 + " рублей.");
        System.out.println("Кристина теперь получает " + ChristinaNewSalaryPerMonth + " рублей. Годовой доход вырос на " + (ChristinaNewSalaryPerMonth-ChristinaCurrentSalaryPerMonth)*12 + " рублей.");



        //Задача 6. Повышенная сложность

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));

        System.out.println(result);
        System.out.println(Math.abs(result));

        //Задача 7. Повышенная сложность

        int aa = 5;
        int bb = 7;
        aa = aa^bb^(bb=aa);

        System.out.println("aa= " + aa);
        System.out.println("bb= " + bb);

        //Задача 8. Повышенная сложность - не осилила, зеленая еще)))

        int aaa = 354;
        int bbb;
















    }
}
