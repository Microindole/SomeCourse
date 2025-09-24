package learn.ex2025.ex5;
public class TestSmart {
    public static void m1(SmartHome device){
        System.out.println("设备名为: "+device.getDeviceName());
    }
    public static void m2(SmartHome device) {
        System.out.println(device.toString());
    }
    public static void m3(SmartHome device){
        if (device instanceof SmartLight) {
            ((SmartLight) device).displayStatus();
        } else if (device instanceof SmartSpeaker) {
            ((SmartSpeaker) device).displayStatus();
        }
    }
    public static void main(String[] args) {
        SmartHome d1 = new SmartHome("电脑","关闭");
        SmartHome d2 = new SmartLight("智能灯","打开", 80);
        SmartHome d3 = new SmartSpeaker("智能音箱", "打开","啦哒哒","万分之一的光");
        m1(d1);m1(d2);m1(d3);
        m2(d1);m2(d2);m2(d3);
        m3(d1);m3(d2);m3(d3);
    }
}
