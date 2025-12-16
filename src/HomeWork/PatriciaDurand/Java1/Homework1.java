package HomeWork.PatriciaDurand.Java1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();


    }


//    static void demoScanner(){
//        Scanner cititor = new Scanner(System.in);
//        System.out.println("Introdu un text din tastatura!");
//        String input = cititor.next();
//        System.out.println("Cititorul a scris de la tastatura: " + input);
//
//        System.out.println("Introdu un numar din tastatura!");
//        int number = cititor.nextInt();
//        System.out.println("Numarul introdus este: " + number);
//    }

    static void ex1() {
        //        1. Exe 1
        System.out.println("Imi place Java");
    }

    static void ex2() {
        //        2. Exe 2
        System.out.println("Cursul acestaceste foarte fain!");
        System.out.println("Cursul acestaceste foarte fain!");
        System.out.println("Cursul acestaceste foarte fain!");
        System.out.println("Cursul acestaceste foarte fain!");
        System.out.println("Cursul acestaceste foarte fain!");
        System.out.println("Cursul acestaceste foarte fain!");
    }

    static void ex3() {
        //      3. Exe3
        int ana = 24;
        int david = ana - 6;
        System.out.println("Ana = " + ana);
        System.out.println("David = " + david);
    }

    static void ex4() {
        //      4. Exe4
        Scanner cititor = new Scanner(System.in);
        System.out.println("Introdu un text din tastatura!");
        String input = cititor.nextLine();
        System.out.println("Cititorul a scris de la tastatura: " + input);
    }

    static void ex5() {
        //     5. Exe 5
        int age = 29;
        String name = "Diandra";
        boolean playsGuitar = true;

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Is learning to play guitar: " + playsGuitar);

        //   apelam metoda myVariables();
    }

    static void ex6(){
        //        ex 6
        Scanner number = new Scanner(System.in);
        System.out.println("Write the first number");
        int firstNumber = number.nextInt();
        System.out.println("Write the second number");
        int secondNumber = number.nextInt();
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
    }

    static void ex7(){
        //        ex 7

        Scanner scanner= new Scanner(System.in);

        System.out.println("Write a number: ");
        double number = scanner.nextInt();

        double addition = number + 5;
        double subtraction = number -  12.3;
        double multiplication = number * -3.2;
        double division = number / 4;
        double module = number % 6;

        System.out.println("Result of addition with 5: "+ addition);
        System.out.println("Result of subtraction with 12.3: "+ subtraction);
        System.out.println("Result of multiplication with -3.2: "+ multiplication);
        System.out.println("Result of division with 4: "+ division);
        System.out.println("Result of modulus with 6: "+ module);
    }
}