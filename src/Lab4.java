public class Lab4 {

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();

        //int x = 1;
        // while (x <= 100){
        //    System.out.println(x);
        //     x++;
        //  }

        // for(int i = 1; i<= 100; i++){
        //     System.out.println(i);
        //   }

        // int x = 2;
        // x+=x+=x++ + ++x;
        // System.out.println(x);

        //Given a number, while the number is equal to or lower than 100, print the number

        /*for (int i = 20; i <= 100;) {
            System.out.println(i);
            {
                break;
            }
        }*/

        /*System.out.println("\nWrite a program called SumAndAverage to produce the sum of \n" +
                "1, 2, 3, ..., to 100. Also compute and display the average.\n");*/

        System.out.println("""

                Tema - Java For Loops
                1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
                 Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
                 pornind de la numarul primit ca si parametru.
                 Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
                """);

                op.countForward(48);


        System.out.println("""

                2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
                Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,\s
                pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
                """);

                op.counttominus( 28);


        System.out.println("""

                3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
                 Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
                 pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
                 numaratoarea sa se faca de la x, la y.
                """);

                op.counttonumber(28, 48);


        System.out.println("""

                4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
                Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare
                crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul\s
                parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,\s
                atunci numaratoarea sa fie de la y la x).
                """);

                op.countfrontorback(170, 89);

        System.out.println("\n5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.\n");

                op.evennumbers(2);

        System.out.println("\n6.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.\n");

                op.oddnumbers(1);


        System.out.println("""

                7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
                 Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
                 iar la final sa returneze rezultatul.
                 Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
                """);

        System.out.println(op.getsum(93));


        System.out.println("""

                8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
                 Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
                si sa calculeze media numerelor. La final, metoda sa returneze media.
                 Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
                \s""");

        System.out.println(op.getAverageFromInterval(50));


        System.out.println("""

                9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
                *******
                ******
                *****
                ****
                ***
                **
                *
                """);

        System.out.println("Rez:");
        op.gettwoloops(7);



        System.out.println("""

                Tema - Java While Loop
                1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
                Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
                 pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
                 deoarece metoda afiseaza, nu returneaza.
                """);

        op.countto100(5);


        System.out.println("""

                2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
                 Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
                 pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
                 deoarece metoda afiseaza, nu returneaza.
                """);

        op.counttominus100(9);


        System.out.println("""

                3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
                 Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la
                 primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul
                 parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
                """);

        op.countbetween(4,69);


        System.out.println("""

                4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
                 Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute
                 o numaratoare crescatoare de la cel mai mic la cel mai mare.
                (ex: daca int x e primul parametru iar int y  este cel de-al doilea,\s
                daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
                """);

        op.counttohighernumber(12,3);


        System.out.println("\n5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.\n");

        op.evenwhilenumbers();


        System.out.println("\n6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100. \n");

        op.oddwhilenumbers();


        System.out.println("""

                7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
                 Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze
                 media numerelor din acel interval. Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
                """);

       System.out.println(op.getsumandaverage());

        System.out.println("""

                8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor
                 divizibile cu 7, din acel interval.
                \s""");

        System.out.println(op.getAverageDivisibleBySeven(7, 145));


        System.out.println("\n9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci. \n");

        op.getFibanacci();


        System.out.println("""

                10. Creati o metoda numita CozaLozaWoza.\s
                Metoda va afisa:
                - numerele de la 1 la 110
                - 11 numere pe linie
                - se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
                - se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
                - se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
                - se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5\s
                - se va afisa CozaWoza pentru multiplu de 3 SI 7
                - se va afisa WozaLoza pentru multiplu de 5 SI 7
                - se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
                Ar trebui sa arate similar:
                1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11\s
                Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22\s
                23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
                """);

        System.out.println("Rezolvare:");
        op.cozaLozaWoza();
}
}






