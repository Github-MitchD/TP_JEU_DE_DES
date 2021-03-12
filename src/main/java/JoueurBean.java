public class JoueurBean {
    private String nom;
    private GobeletBean gobelet;
    private int score;

    public void lancer(){
        gobelet.lancer();
    }

    public void ajouter1pt(){
        score++;
    }

    public JoueurBean(String nom) {
        this.nom = nom;
        gobelet = new GobeletBean();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public GobeletBean getGobelet() {
        return gobelet;
    }

    public void setGobelet(GobeletBean gobelet) {
        this.gobelet = gobelet;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
