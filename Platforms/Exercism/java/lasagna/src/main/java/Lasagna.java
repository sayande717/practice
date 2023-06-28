public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }
    
    public static int remainingMinutesInOven(int timeInOven) {
        return(expectedMinutesInOven()-timeInOven);
    }
    
    public static int preparationTimeInMinutes(int numberOfLayers) {
        return (numberOfLayers*2);
    }
    
    public static int totalTimeInMinutes(int numberOfLayers,int timeInOven) {
        return preparationTimeInMinutes(numberOfLayers)+timeInOven;
    }
    public static void main(String[] args) {
    }
}
