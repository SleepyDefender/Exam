package comp3607_2023.cwt1_main;

public class CarScreenMaster implements CarScreen{
    private String carScreenType;
    public CarScreenMaster(String carScreenType){
        this.carScreenType = carScreenType;
    }
    public void turnOn(){
        System.out.println(carScreenType + " turned on");
        switch(carScreenType){
            case("Sapple Screen"):
                showRadioControls(true);
                break;
            case("Tapple Screen"):
                showRadioControls(true);
                showNavigationMap(true);
                break;
            case("Wapple Screen"):
                showFrontCameraControls(true);
                showRearCameraControls(true);
                break;
            case("Vapple Screen"):
                showFrontCameraControls(true);
                showRearCameraControls(true);
                showSideCameraControls(true);
                showTopCameraSimulation(true);
                connectToPhone();
                break;
        }
    }
    public void turnOff(){
        switch(carScreenType){
            case("Sapple Screen"):
                showRadioControls(false);
                break;
            case("Tapple Screen"):
                showRadioControls(false);
                showNavigationMap(false);
                break;
            case("Wapple Screen"):
                showFrontCameraControls(false);
                showRearCameraControls(false);
                break;
            case("Vapple Screen"):
                showFrontCameraControls(false);
                showRearCameraControls(false);
                showSideCameraControls(false);
                showTopCameraSimulation(false);
                break;
        }
        System.out.println(carScreenType+ " turned off \n");
    }

    public void showRadioControls(boolean show){
        if(show)
            System.out.println("\t Radio Screen visible on " + carScreenType );
        else
            System.out.println("\t Radio Screen hidden on " + carScreenType );
    }
    public void showNavigationMap(boolean show){
        if(show)
            System.out.println("\t Navigation Screen visible on " + carScreenType );
        else
            System.out.println("\t Navigation Screen hidden on " + carScreenType );
    }
    public void showFrontCameraControls(boolean show){
        if(show)
            System.out.println("\t Front Camera visible on " + carScreenType );
        else
            System.out.println("\t Front Camera hidden on " + carScreenType );
    }
    public void showRearCameraControls(boolean show){
        if(show)
            System.out.println("\t Rear Camera visible on " + carScreenType );
        else
            System.out.println("\t Rear Camera hidden on " + carScreenType );
    }
    public void showSideCameraControls(boolean show){
        if(show)
           System.out.println("\t\t Side Camera Controls visible on Vapple Screen" );
       else
           System.out.println("\t\t Side Camera Controls hidden on Vapple Screen");
   }
   public void showTopCameraSimulation(boolean show){
       if(show)
           System.out.println("\t\t Top Camera Simulation visible on Vapple Screen" );
       else
           System.out.println("\t\t Top Camera Simulation hidden on Vapple Screen");
   }
   private void connectToPhone(){ //Only appplies to Vapple Screens when the radio is turned on
        if(carScreenType.equals("Vapple Screen")){
            showRadioControls(true);
            System.out.println("\t\t\t Connecting to Phone on Vapple Screen" );
        }
        else    
            System.out.println("\t\t\t This feature is unavailable on " + carScreenType );        
   }
}
