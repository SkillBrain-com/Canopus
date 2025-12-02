package HomeWork.IoanaNegulici.Java1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Java1HomeWork {
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
        exe4();
        exe5();
        exe6();
        exe7();
        exe8();

    }


   public static void exe1 (){
        //exercitiu 1 Scrieti un program care afiseaza “Imi place Java”
        System.out.println("Imi place Java");
    }
    static void exe2 (){
        //exercitiu 2 Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
        System.out.println("Cursul asta este foarte fain");
        System.out.println("Cursul asta este foarte fain");
        System.out.println("Cursul asta este foarte fain");
        System.out.println("Cursul asta este foarte fain");
        System.out.println("Cursul asta este foarte fain");
        System.out.println("Cursul asta este foarte fain");
    }
    static void exe3(){
        // exercitiu 3 Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
        int Ana = 24;
        int David = Ana - 6;
        System.out.println("Ana = " + Ana);
        System.out.println("David = " + David);
    }
    static void exe4 (){
        // exercitiu 4 Scrieti un program in care cititi o propozitie de la tastatura
        Scanner cititor = new Scanner( System.in);
        System.out.println("Introdu un text din tastatura!");
        String input =  cititor.next();
        System.out.println("Cititorul a introdus:" + input);

        System.out.println("Se introduce un numar!");
        int number = cititor.nextInt();
        System.out.println("Numarul est:" + number);
    }

    static void exe5 (){
    // exercitiu 5 Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
        //String si un boolean, apoi apelati metoda din metoda “main”
//        public static void main(String[] args) {
//            myVariables();
//        }
//        public static void myVariables (){
            // declarare variabile si afisare
            int varsta = 27;
            String nume = "Ioana";
            Boolean variable = true;
            System.out.println("Numele meu este:" + nume);
            System.out.println("Am" + " " + varsta +" " + "ani");
            System.out.println(variable);
    }

         static void exe6(){
            // exercitiul 6 Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
            //stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran
            Scanner number = new Scanner(System.in);
            System.out.println("Se introduce un numar din tastatura:");
            int Primulnumar = number.nextInt();
            System.out.println("Se introduce un alt numar de la tastatura:");
            int Aldoileanumar = number.nextInt();
            System.out.println("Primul numar este:" + Primulnumar);
            System.out.println("Al doilea numar este:" + Aldoileanumar);
        }

     static void exe7() {
         // exercitiu 7 Scrieti un program incare cititi de la tastatura un numar, si
         //calculati:
         Scanner number = new Scanner(System.in);
         System.out.println("Se introduce un numar din tastatura:");
         int x = number.nextInt();
         // rezultatul sumei cu 5
         System.out.println("Rezultatul adunarii este: ");
         System.out.println(x + 5);
         // rezultatul scaderii cu 12.3
         System.out.println("Rezultatul scaderii este: ");
         System.out.println(x - 12.3);
         //rezultatul inmultirii cu -3.2
         System.out.println("Rezultatul inmultirii este: ");
         System.out.println(x * (-3.2));
         //rezultatul impartirii cu 4
         System.out.println("Rezultatul impartirii este: ");
         System.out.println(x / 4);
         //rezultatul modulului cu 6
         System.out.println("Rezultatul modulului este: ");
         System.out.println(x % 6);
     }


    static void exe8 (){
    // exercitiu 8 Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
        //fie 12 si 2:
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