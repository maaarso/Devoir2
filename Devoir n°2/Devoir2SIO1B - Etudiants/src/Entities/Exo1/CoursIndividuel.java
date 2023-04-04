package Entities.Exo1;

public class CoursIndividuel extends Cours implements ICalcul
{
    private Instrument lInstrument;

    public CoursIndividuel(int idCours, int prixCours) {
        super(idCours, prixCours);
    }

    public CoursIndividuel(int idCours, int prixCours, Instrument lInstrument) {
        super(idCours, prixCours);
        this.lInstrument = lInstrument;
    }

    public Instrument getlInstrument() {
        return lInstrument;
    }

    public void setlInstrument(Instrument lInstrument) {
        this.lInstrument = lInstrument;
    }
}
