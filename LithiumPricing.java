import java.util.HashMap;

public class LithiumPricing {
    //Hash map that assigns every unique lithium sample (Integer), a price (Double),
    //duplicate samples are not added onto the hash map therefore there usually
    //are less hash map entries than number of lithium samples generated
    private HashMap<Integer, Double> prices;
    private int[][] tray;

    /**
     * Constructor initialises the hash map
     */
    public LithiumPricing(){
        prices = new HashMap<>();
    }

    /**
     * Assigns a price to each lithium sample based on how high its grade is
     * 1-9 price is set to £300
     * 10-19 price is set to £600
     * 20-29 price is set to £900
     * >29 price is set to £1250
     * @param generateLithium Object that holds tray of generated lithium
     */
    public void setPrice(GenerateLithium generateLithium){
        tray = generateLithium.getTray();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                int grade = tray[i][j];
                if(grade < 10){
                    prices.put(tray[i][j],300.00);
                }else if(grade < 20){
                    prices.put(tray[i][j],600.00);
                }else if(grade < 30){
                    prices.put(tray[i][j],900.00);
                }else{
                    prices.put(tray[i][j],1250.00);
                }
            }
        }
    }

    /**
     * Prints lithium grade and its assigned price to console in a format,
     * "Grade -> Price"
     * @param tray Tray that was generated by GenerateLithium class
     */
    public void printPrice(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(tray[i][j] + " -> £" + prices.get(tray[i][j]));
            }
        }
    }

    /**
     * Returns Hash map with key value pair of grades and prices
     * @return Hash map with grades corresponding to prices
     */
    public HashMap<Integer, Double> getPrices() {
        return prices;
    }
}
