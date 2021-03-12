import java.util.Scanner;

public class Controleur {

    private PartieBean partieBean;

    public void demanderNom(){
        System.out.print("Nom Joueur 1: ");
        Scanner scanner = new Scanner(System.in);
        String nomJ1 = scanner.next();
        System.out.print("Nom Joueur 2: ");
        String nomJ2 = scanner.next();
        System.out.println("___________");

        partieBean = new PartieBean(nomJ1, nomJ2);
    }

    public void lancer(){
        while(partieBean.getTour() <= 5){
            System.out.println("Tour n° " + partieBean.getTour());
            for(int i = 0; i < 2 ; i++){
                partieBean.getjCourant().lancer();
                System.out.println(partieBean.getjCourant().getNom()+ " a fait: " + partieBean.getjCourant().getGobelet().getScoreDes());

                if(partieBean.getjCourant().getGobelet().getScoreDes() >= 7){
                    partieBean.getjCourant().ajouter1pt();
                }
                partieBean.changerJoueurCourant();
            }
            System.out.println("___________");

            partieBean.ajouter1tour();
        }

        System.out.println(partieBean.getJ1().getNom() + " a fait: " + partieBean.getJ1().getScore() + " points");
        System.out.println(partieBean.getJ2().getNom() + " a fait: " + partieBean.getJ2().getScore() + " points");
        System.out.println("___________");
    }

    public void afficherScore(){
        if(partieBean.getJ1().getScore() > partieBean.getJ2().getScore()){
            System.out.println(partieBean.getJ1().getNom() + " a gagné <3 <3 ");
        } else if (partieBean.getJ1().getScore() == partieBean.getJ2().getScore()){
            System.out.println(" Egalité ");
        } else {
            System.out.println(partieBean.getJ2().getNom() + " a gagné <3 <3 ");
        }
    }
}
