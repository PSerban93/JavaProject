package AnimalRescue.Humans;

public abstract class Humans {
    private String adoptionName;
    private double amountofmoney;
    public String getAdoptionName(){
        return adoptionName;
    }
    public void setAdoptionName(String adoptionName){
        this.adoptionName = adoptionName;
    }
    public double getAmountofmoney(){
        return amountofmoney;
    }
    public void setAmountofmoney(double amountofmoney){
        this.amountofmoney = amountofmoney;
    }
    private String vetname;
    private String vetspecialization;
    public String getVetname(){
        return vetname;
    }
    public void setVetname(String vetname) {
        this.vetname = vetname;
    }
    public String getVetspecialization(){
        return vetspecialization ;
    }
    public void setVetspecialization(String vetspecialization) {
        this.vetspecialization = vetspecialization;
    }
}
