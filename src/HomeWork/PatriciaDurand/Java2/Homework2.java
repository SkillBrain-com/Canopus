package HomeWork.PatriciaDurand.Java2;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
//        ex1
        Scanner number = new Scanner(System.in);
        Random n = new Random();

        System.out.println("Numarul introdus este:");
        int numarIntrodus = number.nextInt();

        int numarRandom = n.nextInt(0,100) ;

        if (numarIntrodus < numarRandom){
            System.out.println("Numarul introdus este mai mic decat "+ numarRandom);
        }

//        //      ex2
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Introdu un caracter:");
//        char operatie = scanner.next().charAt(0);
//        System.out.println("Introdu primul numar:");
//        int nr1 = scanner.nextInt();
//        System.out.println("Introdu al doilea numar:");
//        int nr2 = scanner.nextInt();
//
//        switch (operatie) {
//            case 'a':
//                System.out.println("Rezultatul adunarii: " + (nr1 + nr2) );
//                break;
//            case 's':
//                System.out.println("Rezultatul scaderii " + (nr1 - nr2));
//                break;
//            case 'i':
//                System.out.println("Rezultatul inmultirii " + (nr1 * nr2));
//                break;
//            case 'p':
//                System.out.println("Rezultatul impartirii " + (nr1 / nr2));
//            case 'm':
//                System.out.println("Rezultatul modulului " + (nr1 % nr2));
//            default:
//                System.out.println("Caracter invalid, alege intre: a, s, i, p sau m");
//        }

//        //        ex3
//
//            int [][] arrayNumbers = {
//                    {1, 3, 5, 7, 9},
//                    {10, 11, 12, 13, 14},
//                    {20, 21, 22, 23, 24}
//        };
//            for (int i= 0; i < arrayNumbers.length; i++){
//            int primul = arrayNumbers[i][0];
//            int ultimul = arrayNumbers[i][arrayNumbers[i].length - 1];
//
//                System.out.println("Randul " +(i+1) + ": primul = " + primul + ", ultimul = " + ultimul);}


//        //        ex4
//
//            char [] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
//
//            for (int i = 1; i < charArray.length; i += 2){
//                System.out.println("Caracterul de pe pozitia " + i + " este " + charArray[i]);
//            }
//

//        //          ex5
//
//        double [] numere = {4.5, 3.1, 7.2, 9.0, 5.0, 2.6};
//
//        for (int i=0 ; i< numere.length; i++ ) {
//            if (numere[i] == 4.5) {
//                System.out.println("Numarul 4.5 este prezent");
//            }else if(numere[i] > 5) {
//                System.out.println("Numerele mai mari decat 5 sunt : "+ numere[i]);
//            }

//        //          ex6
//
//            String [] fructe = {"mere", "pere", "struguri", "capsuni", "afine", "cirese", "mure", "portocale", "mandarine"
//        };
//            for (int i = 0; i< fructe.length; i++){
//                if(i == 2){
//                    continue;
//                }
//                if(i == 7){
//                    break;
//                }
//                System.out.println("Index valid");
//            }
//
//        //          ex7
//
//        List<Integer> numere = List.of(1, 4, 5, 7, 10);
//
//        int sum = 0;
//        for (Integer numar: numere){
//            sum = sum + numar;
//        }
//        System.out.println("Suma numerelor este = "+ sum);

//        //             ex8
//
//        int [] array = { };
//        List<String> list = new ArrayList<>();
//
//        boolean arrayIsEmpty = array.length == 0;
//        boolean listIsEmpty = list.isEmpty();
//
//        System.out.println("Array is empty = " + arrayIsEmpty);
//        System.out.println("List is empty = " + listIsEmpty);


//         //            ex9
//
//        Double [] numere = {10.2, 11.5, 12.2, 9.7, 15.6, 11.3};
//
//        Arrays.sort(numere);
//        System.out.println("Array in ordine crescatoare: " + Arrays.toString(numere));
//
//        Arrays.sort(numere,Collections.reverseOrder());
//        System.out.println("Array in ordine descrescatoare: " + Arrays.toString(numere));
    }



}
