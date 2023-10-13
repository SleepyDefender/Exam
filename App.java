package comp3607_2023.cwt1_main;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<CarScreen> carScreens = new ArrayList<>();
        carScreens.add(new CarScreenMaster("Sapple Screen"));
        carScreens.add(new CarScreenMaster("Tapple Screen"));
        carScreens.add(new CarScreenMaster("Wapple Screen"));
        carScreens.add(new CarScreenMaster("Vapple Screen"));
        
        for(CarScreen screen: carScreens){
            screen.turnOn();
            screen.turnOff();
        }
    }
}
