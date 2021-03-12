import java.util.Random;

public class DeBean {
    private int valeur;
    private int taille;

    //getter
    public int getValeur() {
        return valeur;
    }
    //setter
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    //constructeurs avec paramètres de DeBean
    public DeBean(int taille) {
        this.taille = taille;
        valeur = 1;
    }
    //constructeurs sans paramètres de DeBean
    public DeBean() {
        this(6);
    }

    //methode lancer
    public void lancer(){
        valeur = new Random().nextInt(taille) + 1;
        //System.out.print(valeur);
    }

}
