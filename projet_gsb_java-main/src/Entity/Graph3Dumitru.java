/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class Graph3Dumitru {
    private String date;
    private int nbVisiteurs;
    

//    Utiliser group by + distenct
    public Graph3Dumitru(String date, int nbVisiteurs )
    {
        this.date = date;
        this.nbVisiteurs = nbVisiteurs;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the nbVisiteurs
     */
    public int getNbVisiteurs() {
        return nbVisiteurs;
    }

    /**
     * @param nbVisiteurs the nbVisiteurs to set
     */
    public void setNbVisiteurs(int nbVisiteurs) {
        this.nbVisiteurs = nbVisiteurs;
    }
    
}
