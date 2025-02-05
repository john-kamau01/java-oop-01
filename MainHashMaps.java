import java.util.HashMap; // Import Hashmap class

public class MainHashMaps{
    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>(); // hashmap object

        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");

        System.out.println(capitalCities.get("Kenya"));

        for(String key : capitalCities.keySet()){
            System.out.println(key + " - " + capitalCities.get(key));
        }
    }
}