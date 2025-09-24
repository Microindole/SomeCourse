package learn.ex2025.ex5;

public class SmartLight extends SmartHome{
    private int brightness;

    SmartLight(){}

    SmartLight(String deviceName,String state, int brightness){
        setDeviceName(deviceName);
        setState(state);
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString(){
        return "SmartLight类：设备名为"+getDeviceName()+"，状态为"+getState()+"，亮度为"+getBrightness()+"。";
    }

    public void displayStatus(){
        System.out.println("设备【"+getDeviceName()+"】：当前亮度为 "+getBrightness()+"%，请合理节能。");
    }

}
