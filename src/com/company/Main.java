package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int k=10; k > 0; k = k - 1) {
            System.out.print(k + " ");
        }
        System.out.println();

        int friday = 1;
        System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
         while (friday< 28) {
            friday= friday + 7;
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
        }


         int year =0;
         int yearBefore = 1821;
         int yearAfter = 2121;
         while (yearBefore < yearAfter) {
             yearBefore++;
             year++;
             year = year%79;
             if (year == 0) {
                 System.out.println(yearBefore);

             }

                 }
    }
}
