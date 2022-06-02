package com.example.controlecontinue2;

public class Entreprise {
    private Integer ID ;
    private String Raison_Sociale;
    private String Adresse ;
    private Double Capitale ;
    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setRaison_Sociale(String raison_Sociale) {
        Raison_Sociale = raison_Sociale;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public void setCapitale(Double capitale) {
        Capitale = capitale;
    }


    public Integer getID() {
        return ID;
    }

    public String getRaison_Sociale() {
        return Raison_Sociale;
    }

    public String getAdresse() {
        return Adresse;
    }

    public Double getCapitale() {
        return Capitale;
    }


    public Entreprise (){};
    public Entreprise(Integer id,String RS,String AD,Double CP){
        this.ID=id;
        this.Raison_Sociale=RS;
        this.Adresse=AD;
        this.Capitale=CP;


    }

}
