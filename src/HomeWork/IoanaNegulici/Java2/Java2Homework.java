package HomeWork.IoanaNegulici.Java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java2Homework {
    public static void main(String[] args) {

        // Cerinta 1:Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
        // Daca numarul introdus de la tastatura este mai mic decat numarul random generat, afisati mesajul “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).
        Scanner scan = new Scanner(System.in);
        System.out.println("Se va introduce un numar de la tastatura!");
        int numarIntrodus = scan.nextInt();
        System.out.println("Numarul ramdom este:");
        Random random = new Random();
        int numarRandom = random.nextInt(0, 100);
        System.out.println(numarRandom);

        if (numarIntrodus < numarRandom) {
            System.out.println("Numarul introdus: " + numarIntrodus + " este mai mic decat numarul random: " + numarRandom);
        }

        // Cerinta 2: Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch,
        // Daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:  -‘a’: adaugare  -‘s’: scadere  -‘i’: inmultire  -‘p’: impartire  -‘m’: modul
        // Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.

        Scanner caracter = new Scanner(System.in);
        System.out.println("Se introduce un caracter de la tastatura!");
        char caracteerIntodus = caracter.next().charAt(0);
        Scanner numar1 = new Scanner(System.in);
        System.out.println("Se introduce un numar de la tastatura!");
        int numarIntrodus1 = numar1.nextInt();
        Scanner numar2 = new Scanner(System.in);
        System.out.println("Se introduce un alt numar de la tastatura!");
        int numarIntrodus2 = numar2.nextInt();

        switch (caracteerIntodus) {
            case ('a'): {
                System.out.println("Se va efectua adunarea numerelor:" + (numarIntrodus1 + numarIntrodus2));
                break;
            }
            case ('s'): {
                System.out.println("Se va efectua scaderea numerelor: " + (numarIntrodus1 - numarIntrodus2));
                break;
            }
            case ('i'): {
                System.out.println("Numerele se vor inmulti: " + (numarIntrodus1 * numarIntrodus2));
                break;
            }
            case ('p'): {
                System.out.println("Numerele se vor imparti: " + (numarIntrodus1 / numarIntrodus2));
                break;
            }
            case ('m'): {
                System.out.println("Se va afisa modulul numerelor: " + (numarIntrodus1 % numarIntrodus2));
                break;
            }
            default: {
                System.out.println("Caracterul afisat nu face parte de lista de mai sus");
            }
        }
        // Cerinta 3 Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente. Initializati array-ul.
        // Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.

        String[][] array = new String[3][5];
        array[0][0] = "Ioana";
        array[0][1] = "Anca";
        array[1][0] = "Mara";
        array[2][4] = "Alexanru";
        System.out.println(array[0][0]);
        System.out.println(array[2][4]);

        // Cerinta 4 Definiti un array de char-uri. Iterati array-ul folosind structura for,
        // si afisati pe ecran cate al doilea caracter din sir.

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};
        for (int i = 0; i < charArray.length; i += 2) {
            System.out.println(charArray[i]);

        }

        // Cerinta 5 Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
        // Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”

        double[] doubleArray = {4.5, 1, 2, 1.5, 6.5, 7, 20.7, 15.3, 14.1, 44.5, 8, 38.2, 50};
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] == 4.5) {
                System.out.println("Numarul afisat este " + doubleArray[i]);
            } else if (i > 5) {
                System.out.println("Element peste 5: " + doubleArray[i]);
            }

        }
        // Cerinta 6 Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
        // Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
        // Altfel, sa se afiseze mesajul “Index valid” pe ecran.

        String[] numeArray = {"Ioana", "Ana", "Maria", "Mela", "Alex", "Dan", "Ciprian", "Vlad", "Anca"};
        for (int i = 0; i < numeArray.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(numeArray[i]);
            if (i == 7) {
                break;
            }
        }
        System.out.println("Index valid");

        // Cerinta 7 Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
        ArrayList<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(5);
        listaNumere.add(7);
        listaNumere.add(10);
        listaNumere.add(20);
        listaNumere.add(12);
        int suma = 0;
        for (int sumaNumere : listaNumere) {
            suma = suma + sumaNumere;
        }
        System.out.println("Suma numerelor este egala cu : " + suma);

        // Cerinta 8 Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
        String[] numeArrays;
        numeArray = new String[3];
        numeArray[0] = "Ana";
        numeArray[1] = "Mara";
        numeArray[2] = "Anca";
        System.out.println(numeArray[0]);
        System.out.println(numeArray[1]);
        System.out.println(numeArray[2]);
        if (numeArray.length == 0) {
            System.out.println("Lista este goala");
        } else {
            System.out.println("Lista nu este goala");
        }
        ArrayList<String> fructe = new ArrayList<>();
        fructe.add("mere");
        fructe.add("pere");
        fructe.add("prune");
        System.out.println(fructe);
        if (fructe.isEmpty()) {
            System.out.println("Array list is empty");
        } else {
            System.out.println("Array list is not empty");
        }

        // Cerinta 9 Definiti o metoda care ia un array de numere (intregi sau cu virgula) si sa-l ordoneze crescator sau descrescator.
        int[] numere = {4, 13, 25, 1, 7, 65, 8, 25, 11, 3, 0, 31, 12, 50};
        System.out.println("Numerele sunt " + Arrays.toString(numere));
        Arrays.sort(numere);
        System.out.println("Numere ordonate crescator " + Arrays.toString(numere));
    }


}

