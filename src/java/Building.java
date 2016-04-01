/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuyu
 */
public class Building {
    @Override
    public String toString() {
        return "Building{" + "Building_Name=" + Building_Name + ", Building_Adress=" + Building_Adress + ", Building_No=" + Building_No + ", Building_Size=" + Building_Size + ",Building_cond=" + Building_cond + '}';
    }

    public String getBuilding_Name() {
        return Building_Name;
    }

    public void setBuilding_Name(String Building_Name) {
        this.Building_Name = Building_Name;
    }

    public String getBuilding_Adress() {
        return Building_Adress;
    }

    public void setBuilding_Adress(String Building_Adress) {
        this.Building_Adress = Building_Adress;
    }

    public int getBuilding_No() {
        return Building_No;
    }

    public void setBuilding_No(int Building_No) {
        this.Building_No = Building_No;
    }

    public int getBuilding_Size() {
        return Building_Size;
    }

    public void setBuilding_Size(int Building_Size) {
        this.Building_Size = Building_Size;
    }

    public int getBuilding_cond() {
        return Building_cond;
    }

    public void setBuilding_cond(int Building_cond) {
        this.Building_cond = Building_cond;
    }
    private String Building_Name;
    private String Building_Adress;
    private int Building_No;
    private int Building_Size;
    private int Building_cond;
    
    
}
