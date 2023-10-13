package comp3607_2023.cwt1_main;

public interface CarScreen {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void showRadioControls(boolean show);
    public abstract void showNavigationMap(boolean show);
    public abstract void showFrontCameraControls(boolean show);
    public abstract void showRearCameraControls(boolean show);
    public abstract void showSideCameraControls(boolean show);
    public abstract void showTopCameraSimulation(boolean show); 
}
