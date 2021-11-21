import java.util.stream.IntStream;

public class Lab5 {

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();

       /* int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = i+1;
        }
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);*/


        System.out.println("""
                     
                     2. In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de
                pozitii, valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
                Apelati metoda in main() pentru a verifica daca functioneaza.
                """);

        int[] myArray = op.populateArray(100 );
        op.printArray(myArray);

        System.out.println("""
                    
                    3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, 
                si sa il returneze populat cu toate valorile pare de la 1 la 100. 
                Apelati metoda in main() pentru a verifica daca functioneaza. 
                Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
                """);

        int[] array = new int[50];
        array = op.evenArray(array);
        op.printArray(array);


        System.out.println("""
                
                    4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
                Metoda sa calculeze si sa returneze media numerelor din array. 
                Apelati metoda in main() pentru a verifica daca functioneaza.                
                """);
        int [] array1 = op.populateArray(100);
        System.out.println(op.getAverageValueFromArray(array1));

        System.out.println("""
                
                    5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, 
                si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste 
                in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.  
                Apelati metoda in main() pentru a verifica daca functioneaza.              
                """);
        System.out.println(op.isValueInArray(array1, 47));

        System.out.println("""
                    
                    6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, 
                si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, 
                si daca da, atunci sa returneze pozitia pe care se afla numarul.  
                Apelati metoda in main() pentru a verifica daca functioneaza.                
                """);
        int[] ary = IntStream.range(50, 1000).toArray();
        System.out.println(op.checkNumberinarray(ary,990));

        System.out.println("""
                                
                7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -                                                                                          
                                
                - - - - - - - - - -
                 Rez:     """);
        String[] myArraygrid = op.setArraygrid(7);
        op.printGrid(myArraygrid,8);
        op.printGrid(myArraygrid);

        System.out.println("""
                                
                    8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, 
                si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, 
                sa returneze array-ul primit, fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.
                """);
        int[] tarr = {1,6,12,24,7,2};
       op.removeNrFromArray(tarr,12);

        System.out.println("""
                    
                                        
                    9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array. 
                Apelati metoda in main() pentru a verifica daca functioneaza.
                """);
        int[] myArray2 = {1,4,6,8,2,128};
        op.secondminArray(myArray2);

        System.out.println("""
                
                    10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol. 
                Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea. 
                Apelati metoda in main() pentru a verifica daca functioneaza.
                """);
        int[] myArray3 = {1,6,35,24,42,91};
        int[] emptyArray = new int[myArray3.length];
        op.copyArray(myArray3,emptyArray);
        }
    }
