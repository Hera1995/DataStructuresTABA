
package q4_health_eating;

public class HealthyFoodApp {

    public static void main(String[] args) {
        BinaryTreeInterface<FoodProduct> foodTree = new BinarySearchTree<>();

        // create and add 10 food product objects
        foodTree.addNode(new FoodProduct("Apple", 1.0, 2));
        foodTree.addNode(new FoodProduct("Beer", 4.5, 6));
        foodTree.addNode(new FoodProduct("Chocolate", 2.0, 7));
        foodTree.addNode(new FoodProduct("Durian", 2.5, 6));
        foodTree.addNode(new FoodProduct("Egg", 3, 1));
        foodTree.addNode(new FoodProduct("Honey", 5.0, 9));
        foodTree.addNode(new FoodProduct("Ice cream", 6.0, 8));
        foodTree.addNode(new FoodProduct("Rice", 27.0, 5));
        foodTree.addNode(new FoodProduct("Tofu", 3.0, 4));
        foodTree.addNode(new FoodProduct("Yogurt", 3.5, 3));

        System.out.println("Is the food tree empty? " + foodTree.isEmpty());
        System.out.println("The number of food products: " + foodTree.countNodes());
        System.out.println("Best food: " + foodTree.findBest().getName());
        System.out.println("Worst food: " + foodTree.findWorst().getName());

    }
}
