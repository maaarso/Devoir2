package Entities.Exo1;

import java.util.ArrayList;

public class Cours implements ICalcul
{
    private int idCours;

    private int prixCours;

    public Cours(int idCours, int prixCours) {
        this.idCours = idCours;
        this.prixCours = prixCours;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public int getPrixCours() {
        return prixCours;
    }

    public void setPrixCours(int prixCours) {
        this.prixCours = prixCours;
    }



}
