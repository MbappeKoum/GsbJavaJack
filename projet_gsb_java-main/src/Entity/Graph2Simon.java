/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class Graph2Simon {
    private String  region_nom;
    private int     total_visiteur ;
    
    public Graph2Simon (String UnNomRegion, int unTotalVisiteur)
    {
        region_nom = UnNomRegion;
        total_visiteur = unTotalVisiteur;
    }

    /**
     * @return the region_nom
     */
    public String getRegion_nom() {
        return region_nom;
    }

    /**
     * @return the total_visiteur
     */
    public int getTotal_visiteur() {
        return total_visiteur;
    }
}
