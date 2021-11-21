package AnimalRescue.Animals;

public class AnimalFood {
    private String foodname;
    private String price;
    private String quantity;
    private String stock;

    public String getFoodname(){
        return foodname;
    }
    public void setFoodname(String foodname){
        this.foodname = foodname;
    }

    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }

    public String getQuantity(){
        return quantity;
    }
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public String getStock(){
        return stock;
    }
    public void setStock(String stock){
        this.stock = stock;
    }
}
