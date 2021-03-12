public class PartieBean {
    //attributs
    private int tour;
    private JoueurBean j1;
    private JoueurBean j2;
    private JoueurBean jCourant;

    //methodes
    public void ajouter1tour(){
        tour++;
    }
    public void changerJoueurCourant(){
        if(jCourant == j1){
            jCourant = j2;
        } else {
            jCourant = j1;
        }
    }

    //constructeurs
    public PartieBean(String nomJ1, String nomJ2){
        j1 = new JoueurBean(nomJ1);
        j2 = new JoueurBean(nomJ2);
        tour = 1;
        jCourant = j1;
    }

    //getter & Setter
    public int getTour() {
        return tour;
    }

    public void setTour(int tour) {
        this.tour = tour;
    }

    public JoueurBean getJ1() {
        return j1;
    }

    public void setJ1(JoueurBean j1) {
        this.j1 = j1;
    }

    public JoueurBean getJ2() {
        return j2;
    }

    public void setJ2(JoueurBean j2) {
        this.j2 = j2;
    }

    public JoueurBean getjCourant() {
        return jCourant;
    }

    public void setjCourant(JoueurBean jCourant) {
        this.jCourant = jCourant;
    }
}