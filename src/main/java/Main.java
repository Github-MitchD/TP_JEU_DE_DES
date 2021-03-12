import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Controleur controleur = new Controleur();

        controleur.demanderNom();
        controleur.lancer();
        controleur.afficherScore();
    }
}
