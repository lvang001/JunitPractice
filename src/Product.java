public class Product {
    private double productCost;
    private int amount;
    private String productName;

    Product(double productCost, int amount, String productName) {
        this.productCost = productCost;
        this.amount = amount;
        this.productName = productName;
    }
    

    /**
     * @return double return the productCost
     */
    public double getProductCost() {
        return productCost;
    }

    /**
     * @param productCost the productCost to set
     */
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    /**
     * @return int return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return String return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void totalCost() {
        double totalAmount = productCost*amount;
        System.out.println("It will cost you: "+totalAmount);
    }

    public void show () {
        System.out.println("Product brought was " + getProductName());
        System.out.println("The amount of products bought: " + getAmount());
        System.out.println("This product cost: " + getProductCost());
    }

}
