public class Pas {

    public String imePsa;
    public String rasa;
    public String boja;
    static int duzinaRepa = 1;

    public Pas (String ime, String rasa, String boja) {
        this.imePsa = ime;
        this.rasa = rasa;
        this.boja = boja;
    }

    public void igrajSeSaPsom() {

        duzinaRepa = duzinaRepa + 1 ;
        System.out.println("Pas se igrao, rep mu je sada "+duzinaRepa+"cm."
                +" \nKako zelis da nastavis: broj 1 da se igras, broj 2 da proveris da li je srecan.");
    }

    static void proveriDaLiJeSrecan () {

        if (duzinaRepa <5) {
            System.out.println("Pas nije srecan.");
        }else {
            System.out.println("Pas je sad srecan.");
        }
    }
}
