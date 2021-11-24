import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("unesite ime psa");
        String imePsa = input.nextLine();

        System.out.println("unesite rasu psa");
        String rasa = input.nextLine();

        System.out.println("unesite boju psa");
        String boja = input.nextLine();


        Pas mojPas = new Pas(imePsa,rasa,boja);

        System.out.println(mojPas.imePsa +" "+ mojPas.rasa + " " + mojPas.boja  );

        System.out.println("Ako zelis da se igras sa psom, ukucaj 1:");
        System.out.println("Ako zelis da proveris da li je srecan, ukucaj 2:");
        System.out.println("Ako zelis da prekines igru, ukucaj 3:");


        int izbor;

        while (true) {

            izbor = input.nextInt();

            if (izbor == 1) {
                mojPas.igrajSeSaPsom();
            }
            if (izbor == 2) {
                Pas.proveriDaLiJeSrecan();
            }
            if (izbor == 3) {
                System.out.println("Hvala sto ste igrali");
                break;

            }
        }
    }
}

