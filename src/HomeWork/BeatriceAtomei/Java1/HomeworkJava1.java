package HomeWork.BeatriceAtomei.Java1;

import java.util.Scanner;

public class HomeworkJava1 {
    public static void main(String[] args) {

  ex1();
  ex2();
  ex3();
  ex4();
  ex5();
  ex6();
  ex7();
  ex8();

    }


    static void ex1(){
        // ex1
        System.out.println("Imi plaace Java!");
    }
    static void ex2(){
        // ex2
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
    }
    static void ex3(){
        // ex3
        int ana = 24;
        int david = ana - 6;
        System.out.println("ana =" + ana);
        System.out.println("david =" + david);
    }
    static  void ex4(){
        // ex4
        Scanner cititor = new Scanner(System.in);
        System.out.println("Introdu un text din tastatura!");
        String input = cititor.next();
        System.out.println("Cititorul a introdus:" + input);
        System.out.println("Introdu un numar!");
        int number = cititor.nextInt();
        System.out.println("Numarul introdus este: " + number);
    }
    static void ex5(){
        // ex5
        int varsta = 23;
        String nume = "Beatrice";
        Boolean variable = true;
        System.out.println("Numele meu este =" + nume);
        System.out.println("Varsta mea este =" + varsta);
        System.out.println(variable);
    }
    static void ex6(){
        // ex6
        Scanner number =  new Scanner(System.in);
        System.out.println("Introdu un numar din tastatura:");
        int primulNumar = number.nextInt();
        System.out.println("Introdu inca un numar din tastatura:");
        int alDoileaNumar = number.nextInt();
        System.out.println("Primul numar este:" + primulNumar);
        System.out.println("Aldoilea numar este:" + alDoileaNumar);
    }
    static void ex7(){
        // ex7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar:");
        double number = scanner.nextInt();

        double adunare = number + 5;
        double scaderea = number - 12.3;
        double impartirea = number / 4;
        double inmultirea = number * -3.2;
        double modul = number % 6;

        System.out.println("Rezultatul adunarii cu 5 este:" + adunare);
        System.out.println("Rezultatul scaderii cu -12.3 este:" + scaderea);
        System.out.println("Rezultatul impartirii cu 4 este:" + impartirea);
        System.out.println("Rezultatul inmultirii cu -3.2 este:" + inmultirea);
        System.out.println("Rezultatul modulului cu 6 este:" + modul);
    }
    static void ex8(){
        // ex8
        int x = 2;
        int y = 12;
        //y = x * y

        y = x + y;
        x = y - x;
        y = y - x;
        System.out.println(y);
        System.out.println(x);
    }



}
