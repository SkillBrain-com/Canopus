package HomeWork.MadalinaSamoila.Java2;

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



    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ex1 - Introduceti un numar: ");
        int numar = scanner.nextInt();

        int randomNumber = random.nextInt(100) + 1;

        if (numar < randomNumber) {
            System.out.println("Numarul introdus este mai mic decat " + randomNumber);
        }
    }


    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEx2 - Introduceti caracter (a/s/i/p/m): ");
        char operatie = scanner.next().charAt(0);

        System.out.print("Introduceti primul numar: ");
        double a = scanner.nextDouble();

        System.out.print("Introduceti al doilea numar: ");
        double b = scanner.nextDouble();

        switch (operatie) {
            case 'a':
                System.out.println("Rezultat: " + (a + b));
                break;
            case 's':
                System.out.println("Rezultat: " + (a - b));
                break;
            case 'i':
                System.out.println("Rezultat: " + (a * b));
                break;
            case 'p':
                System.out.println("Rezultat: " + (a / b));
                break;
            case 'm':
                System.out.println("Rezultat: " + (a % b));
                break;
            default:
                System.out.println("Caracter invalid!");
        }
    }


    public static void ex3() {
        int[][] array2D = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        System.out.println("\nEx3 - Array 2D:");
        for (int i = 0; i < array2D.length; i++) {
            System.out.println("Linia " + i +
                    " primul: " + array2D[i][0] +
                    ", ultimul: " + array2D[i][array2D[i].length - 1]);
        }
    }


    public static void ex4() {
        char[] caractere = {'a', 'b', 'c', 'd', 'e', 'f'};

        System.out.println("\nEx4 - Fiecare al doilea caracter:");
        for (int i = 1; i < caractere.length; i += 2) {
            System.out.println(caractere[i]);
        }
    }


    public static void ex5() {
        double[] valori = {2.3, 4.5, 6.1, 5.0, 7.2};

        System.out.println("\nEx5 - Verificare valori:");
        for (double v : valori) {
            if (v == 4.5) {
                System.out.println("Valoare egala cu 4.5: " + v);
            }
            if (v > 5) {
                System.out.println("Element peste 5");
            }
        }
    }


    public static void ex6() {
        int[] array = new int[9];

        System.out.println("\nEx6 - Continue & Break:");
        for (int i = 0; i < array.length; i++) {

            if (i == 2) {
                continue;
            }
            if (i == 7) {
                break;
            }

            System.out.println("Index valid");
        }
    }


    public static void ex7() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int suma = 0;

        for (int nr : lista) {
            suma += nr;
        }

        System.out.println("\nEx7 - Suma elementelor: " + suma);
    }

    public static void ex8() {
        int[] array = {};
        List<String> lista = new ArrayList<>();

        System.out.println("\nEx8 - Verificare gol:");
        System.out.println("Array gol? " + (array.length == 0));
        System.out.println("Lista goala? " + lista.isEmpty());
    }


    public static void ex9() {
        int[] numere = {5, 2, 9, 1, 3};

        sortArray(numere, true);
        System.out.println("\nEx9 - Sortat crescator: " + Arrays.toString(numere));

        sortArray(numere, false);
        System.out.println("Ex9 - Sortat descrescator: " + Arrays.toString(numere));
    }

    // Metodă de sortare
    public static void sortArray(int[] array, boolean crescator) {
        Arrays.sort(array);

        if (!crescator) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }


}