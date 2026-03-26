package Java_Data_Types;

public class Task03EasyFuelUsage {
    public static void main (String[] args){
        int distanceKm = 150;
        double fuelLiters = 15.5;
        double pricePerLitre = 1.5;

        double litersPer100Km = (fuelLiters / distanceKm) * 100;
        double estimatedTripCost = fuelLiters * pricePerLitre;

        System.out.printf("Distance: %dkm, Litres per 100km: %.2f, Estimate Trip Cost: %.2f$",
                distanceKm, litersPer100Km, estimatedTripCost
                );
    }
}
