package HomeWork.BeatriceAtomei.Java2;

import java.util.*;

public class HomeworkJava2 {
    public static void main(String[] args) {

 ex1();
 ex2();
 ex3();
 ex4();
 ex5();
 ex6();
 ex7();
 ex8();
 ex9();

    }
    static void ex1(){
        // ex1
        Scanner number = new Scanner(System.in);
        Random a = new Random();
        System.out.println("Numarul introdus este:");
        int numarintrodus = number.nextInt();
        int numarRandom = a.nextInt(0, 110);
        if (numarintrodus < numarRandom);
        System.out.println("Numarul introdus este mai mic decat " + numarRandom);
    }
    static void ex2() {
        // ex2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un caracter:");
        char operatie = scanner.next().charAt(0);
        System.out.println("Introdu primul numar:");
        int nr1 = scanner.nextInt();
        System.out.println("Introdu al doilea numar:");
        int nr2 = scanner.nextInt();

        switch (operatie) {
            case 'a':
                System.out.println("Rezultatul adunarii:" + (nr1 + nr2));
                break;
            case 's':
                System.out.println("Rezultatul scaderii:" + (nr1 - nr2));
            case 'i':
                System.out.println("Rezultatul inmultirii:" + (nr1 * nr2));
            case 'p':
                System.out.println("Rezultatul impartirii:" + (nr1 / nr2));
            case 'm':
                System.out.println("Rezultatul modulului:" + (nr1 % nr2));
            default:
                System.out.println("Caracter invalid");
        }
    }
    static void ex3(){
        // ex3
        int [][] array = {
                {3,7,1,9},
                {0,8,5,1,2},
                {12,6,23}
        };
        for (int i = 0; i < array.length; i++){
            int primul = array[i][0];
            int ultimul = array[i][array[i].length -1];
            System.out.println("Randul " + i + ": primul = " + primul + " ultimul = " + ultimul);
        }
    }

    static void ex4(){
        // ex4
        char[] chars = {'b', 'e', 'a', 't', 'r', 'i', 'c', 'e'};
        for (int i = 1; i < chars.length; i+=2)
            System.out.println("Al doilea caracter din array: " + (i));
    }

    static void ex5(){
        // ex5
        double [] numbers = {2.2, 4.3, 5.8, 3.2, 6.1, 9.1, 7.5};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 4.5){
                System.out.println("Numarul 4.5 este prezent!");
            }else if (numbers[i] > 5){
                System.out.println("Numerele mai mari decat 5 sunt: " + numbers[i]);
            }
        }
    }
    static void ex6(){
        // ex6
        String[] name = {"Ana", "Maria", "Raluca", "Andreea", "Iuliana"};
        for (int i = 0; i < name.length; i++){
            if (i == 2){
                continue;
            }
            if (i == 7){
                break;
            }
            System.out.println("Index valid!");
        }
    }
    static void ex7(){
        // ex7
        List<Integer> numere = List.of(2,4,6,8,5);
        int sum = 0;
        for (Integer numar: numere){
            sum = sum + numar;
        }
        System.out.println("Suma numerelor este = " + sum);
    }
    static void ex8(){
        // ex8
        int [] array = { };
        List<String> list = new ArrayList<>();
        boolean arrayIsEmpty = array.length == 0;
        boolean listIsEmpty = list.isEmpty();
        System.out.println("Array is empty = " + arrayIsEmpty);
        System.out.println("List is empty = " + listIsEmpty);
    }
    static void ex9(){
        // ex9
        Integer [] numere = {1, 98, 54, 30, 5, 8, 12, 63, 0, 82, 29};
        Arrays.sort(numere);
        System.out.println("Numere in ordine crescatoare sunt : " + Arrays.toString(numere));

        Arrays.sort(numere, Collections.reverseOrder());
        System.out.println("Numerele in ordine descrescatoare sunt : " + Arrays.toString(numere));

    }

}
