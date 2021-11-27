import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6 {

    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();
        List<Integer> mySecondList = op.getPopulatedList(100);

//        myList.add(1);
//        myList.add(2);
//        myList.add(3);

//        System.out.println(myList);
        //Integer x = 3; si elimini x sau ,
//        myList.remove(Integer.valueOf(3));
//        System.out.println(myList);
//        myList.clear();
//        System.out.println(myList);


        System.out.println("""
                                
                    1. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, 
                si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.\s
                """);
        List<Integer> myList = op.getPopulatedList(80);
        System.out.println(op.addtoList(myList, 89));

        System.out.println("""
                                
                    2. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate
                     valorile din lista, fiecare pe rand nou.
                """);
        List<Integer> myList2 = op.getPopulatedList(60);
        op.printList(myList2);

        System.out.println("""
                 
                    3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, 
                iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, 
                fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
                """);
        op.printListFromNumber(mySecondList, 50);

        System.out.println("""
                 
                    4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, 
                toate valorile din lista, dar invers(de la capat la inceput).
                """);
        op.printReverse(mySecondList, 60);

        System.out.println("""
                                
                    5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, 
                    unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, 
                    iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
                """);
        List<String> slist = new ArrayList<>();
        slist.add("Serban");
        slist.add("Andrei");
        slist.add("Bogdan");
        slist.add("Ana");
        slist.add("Ares");
        System.out.println(op.addStringtoPos(slist, 0, "Darius"));

        System.out.println("""
                                
                    6. Scrieti o metoda Java, care sa primeasca doi parametrii.
                     Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
                """);
        System.out.println(op.addStringtofrstPos(slist, "Ex7"));

        System.out.println("""
                                
                    7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, 
                    si pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
                """);
        op.valorisipozitie(slist);

        System.out.println("""
                     
                     8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.\s
                """);
        System.out.println(op.getBgstnr(mySecondList));

        System.out.println("""
                \n Tema Optionala:
                                
                    1. Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista.
                """);

        System.out.println(slist);

        Collections.swap(slist, 1, 2);

        System.out.println(slist);


        System.out.println("""
                \n 2. Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista, 
                care sa contina doar numerele pare din lista primita.
                """);

        op.nrpare(mySecondList);
    }
}

        /*System.out.println("""
                
                \n 3. Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze 
                Lista sortata crescator. Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi), 
                si nu folosit librarie externa, precum Collection.sort().
                """);*/









