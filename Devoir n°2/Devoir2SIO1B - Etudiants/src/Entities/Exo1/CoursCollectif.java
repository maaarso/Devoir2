package Entities.Exo1;

public class CoursCollectif extends Cours implements ICalcul
{
    private String nomCours;

    private int nbPlaceMaxi;

    private int ageMini;

    public CoursCollectif(int idCours, int prixCours) {
        super(idCours, prixCours);
    }

    public CoursCollectif(int idCours, int prixCours, String nomCours, int nbPlaceMaxi, int ageMini) {
        super(idCours, prixCours);
        this.nomCours = nomCours;
        this.nbPlaceMaxi = nbPlaceMaxi;
        this.ageMini = ageMini;
    }

    public String getNomCours() {
        return nomCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public int getNbPlaceMaxi() {
        return nbPlaceMaxi;
    }

    public void setNbPlaceMaxi(int nbPlaceMaxi) {
        this.nbPlaceMaxi = nbPlaceMaxi;
    }

    public int getAgeMini() {
        return ageMini;
    }

    public void setAgeMini(int ageMini) {
        this.ageMini = ageMini;
    }

    @Override
    public int getPrixCours() {
        return super.getPrixCours();
    }

}
