public class GobeletBean {
    private DeBean d1;
    private DeBean d2;

    public void lancer(){
        d1.lancer();
        d2.lancer();
    }
    //methode qui retourne le resultat des 2 des
    public int getScoreDes(){
        return d1.getValeur() + d2.getValeur();
    }
    //constructeur
    public GobeletBean() {
        d1 = new DeBean();
        d2 = new DeBean();
    }
}