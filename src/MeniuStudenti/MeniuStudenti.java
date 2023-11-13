package MeniuStudenti;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeniuStudenti {


    public static void AdaugareStudent() {

            Map<String, Integer> studenti = new HashMap<>();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti cati studenti vreti sa introduceti: ");
            int n = scanner.nextInt();

            for(int i=1;i<=n;i++)
            {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Dati numele studentului: ");
                String name = scanner1.nextLine();

                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Dati varsta studentului: ");
                String age = scanner2.nextLine();

                studenti.put(name, Integer.valueOf(age));
            }

    }

    public static void AfisareStudent() {
        Map<String, Integer> studenti = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti varsta pe care o cautati: ");
        int seachedAge = scanner.nextInt();

    }

    public static void main(String[] args){

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduceti optiunea: ");
        int optiune = scanner3.nextInt();

        do {

            System.out.println("Meniu");
            System.out.println("1. Adaugare student");
            System.out.println("2. Afisare detalii student");
            System.out.println("3. Iesire");
            switch (optiune) {
                case 1:
                    AdaugareStudent();
                    break;

                case 2:
                    AfisareStudent();
                    break;

                case 3:
                    System.out.println("Iesire");
                    break;

                default:
                    System.out.println("Aceasta optiune nu exista!");
            }

        }while (optiune!=3);

    }

}
