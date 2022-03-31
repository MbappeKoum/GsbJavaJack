/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class Graph1Jack 
{
    private String regNom;
    private int regCode;
    private int secCode;
    
    public Graph1Jack(String unRegNom, int unRegCode, int unSecCode)
    {
        regNom = unRegNom;
        regCode = unRegCode;
        secCode = unSecCode;
    }

    /**
     * @return the regNom
     */
    public String getRegNom() {
        return regNom;
    }

    /**
     * @return the regCode
     */
    public int getRegCode() {
        return regCode;
    }

    /**
     * @return the secCode
     */
    public int getSecCode() {
        return secCode;
    }
}
