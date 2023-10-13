
package q4_health_eating;


public class FoodProduct implements Comparable<FoodProduct> {
    private String name;
    private double price;
    private int healthyIndex;

    //constructors
    public FoodProduct(String name, double price, int healthyIndex) {
        this.name = name;
        this.price = price;
        this.healthyIndex = healthyIndex;
    }

    public FoodProduct() {
    }

    
    @Override
    public int compareTo(FoodProduct other) {
        return Integer.compare(this.healthyIndex, other.healthyIndex);
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHealthyIndex() {
        return healthyIndex;
    }

    public void setHealthyIndex(int healthyIndex) {
        this.healthyIndex = healthyIndex;
    }
    
}
