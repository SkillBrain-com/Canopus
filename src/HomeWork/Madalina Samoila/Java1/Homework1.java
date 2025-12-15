package Java1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
        myVariablesEx5();
        Ex6();
        Ex7();
        Ex8();


    }


        public static void Ex1() {
            System.out.println("Imi place Java!");
        }

         public static void Ex2() {
             System.out.println("Cursul acesta este foarte fain!!!!");
             System.out.println("Cursul acesta este foarte fain!!!!");
             System.out.println("Cursul acesta este foarte fain!!!!");
             System.out.println("Cursul acesta este foarte fain!!!!");
             System.out.println("Cursul acesta este foarte fain!!!!");
             System.out.println("Cursul acesta este foarte fain!!!!");
         }
     public static void Ex3() {
         int Ana = 24;
         int David = Ana - 6;
         System.out.println("Ana =" + Ana);
         System.out.println("david =" + David);
     }

      public static void Ex6() {
          Scanner scanner = new Scanner(System.in);
          double numar1 =  scanner.nextDouble();

          System.out.println("Introduceti primul numar:");
          double numar2 = scanner.nextDouble();
          System.out.println("Introduceti al doilea numar: ");
      }


       public static void Ex7() {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Introdu un numar: ");
           double numar = scanner.nextDouble();
           // Calculam rezultatele cerute
           double suma = numar + 5;
           double scadere = numar - 12.3;
           double inmultire = numar * -3.2;
           double impartire = numar / 4;
           double modul = numar % 6; // restul impartirii la 6
           System.out.println("Rezultatul sumei cu 5: " + suma);
           System.out.println("Rezultatul scaderii cu 12.3: " + scadere);
           System.out.println("Rezultatul inmultirii cu -3.2: " + inmultire);
           System.out.println("Rezultatul impartirii cu 4: " + impartire);
           System.out.println("Rezultatul modulului cu 6: " + modul);

           scanner.close();
       }


       public static void Ex4(){
           Scanner scanner = new Scanner(System.in);

           System.out.print("Introduceti o propozitie: ");
           String propozitie = scanner.nextLine();

           System.out.println("Propozitia introdusa este:");
           System.out.println(propozitie);

           scanner.close();
       }

    public static void myVariablesEx5() {
        int numar = 10;
        String text = "Salut IntelliJ";
        boolean esteAdevarat = true;

        System.out.println("Int: " + numar);
        System.out.println("String: " + text);
        System.out.println("Boolean: " + esteAdevarat);
    }






    public static void Ex8() {
        int x = 2;

        int y = 12;


        // y = x * y;

        y = x + y;


        x = y - x;

        y = y - x;


        System.out.println(x);

        System.out.println(y);
    }












}
