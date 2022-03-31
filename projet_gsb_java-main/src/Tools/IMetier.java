/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tools;

import Entity.Laboratoire;
import Entity.Region;
import Entity.Secteur;
import Entity.Travailler;
import Entity.User;
import Entity.Visiteur;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author dimmi
 */
public interface IMetier 
{
    public User GetUnUser(String login, String mdp);
    public ArrayList<Region> GetAllRegions();
    public ArrayList<Secteur> GetAllSecteurs();
    public ArrayList<Visiteur> GetAllVisiteurs();
    public ArrayList<Laboratoire> GetAllLaboratoires();
    public ArrayList<Travailler> GetListTravail();
    public void InsererRegion(int regCode, String regNom, int secCode);
    public void ModifierRegion(int regCode, String regNom, int secCode);
    public void InsererVisiteur(int visMatricule, String visNom, String visPrenom, String visAdresse, int visCodePostal, String visVille, String visDateEmbauche, int secCode, int labCode);
    public void ModifierVisiteur(int visMatricule, String visNom, String visPrenom, String visAdresse, int visCodePostal, String visVille, String visDateEmbauche, int secCode, int labCode);
    public int GetLastRegCode();
    public int GetLastMatriculeCode();
    public String GetNomVille(int codePostal);
    public void InsererTravailleur(int visMatricule, int regCode, String date, String role);
    public Travailler GetUnTravailleur(int visId, int unCodeReg, String uneDate);
    public Region GetUnRegion(int unCode);
    public Region GetUnRegion(String unNom);
    public Visiteur GetUnVisiteur(int uneMatricule);
    public Visiteur GetUnVisiteur(String nom, String prenom, int codePostal, String adresse);
    public Visiteur GetUnVisiteur(String nom, String prenom, String adresse);
    public Secteur GetUnSecteurRegion (int regCode);
    public Secteur GetUnSecteurVisiteur(int secCode);
    public Laboratoire GetUnLaboratoireVisiteur(int labCode);
    public Dimension getPreferredSize(int largeur, int hauteur);

}
