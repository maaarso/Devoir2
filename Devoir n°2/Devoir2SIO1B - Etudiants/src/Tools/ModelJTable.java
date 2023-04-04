package Tools;

import Entities.Exo1.Cours;
import Entities.Exo1.CoursCollectif;
import Entities.Exo1.CoursIndividuel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasCours(ArrayList<Cours> uneListe)
        {
            colonnes = new String[]{"Description","Prix"};
            lignes = new Object[uneListe.size()][2];
            int i = 0;

            for(Cours cours : uneListe)
            {
                if (cours instanceof CoursCollectif)
                {
                    lignes[i][0] = "Numéro : " + cours.getIdCours() + "Nom : " ;
                    lignes[i][1] = cours.getPrixCours();
                }
                else if (cours instanceof CoursIndividuel)
                {
                    lignes[i][0] = "Numéro : " + cours.getIdCours() + "Instrument : " ;
                    if (cours.getIdCours()==3)
                    lignes[i][1] = cours.getPrixCours();
                }
                else
                    lignes[i][0] = "Numéro : " + cours.getIdCours() ;
                    lignes[i][1] = cours.getPrixCours();


                i++;
            }
            fireTableChanged(null);
        }

}
