package learn.ex2025.ex5;

public class SmartHome {

    private String deviceName;
    private String state;

    SmartHome() {}

    SmartHome(String deviceName, String state) {
        this.deviceName = deviceName;
        this.state = state;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString(){
        return "SmartHome类：设备名为"+deviceName+"  状态为"+state;
    }
}
