package learn.ex2025.ex5;

public class SmartSpeaker extends SmartHome{

    private String currentTrack;
    private String nextTrack;

    SmartSpeaker(){}

    SmartSpeaker(String deviceName,String state, String currentTrack, String nextTrack){
        setDeviceName(deviceName);
        setState(state);
        this.currentTrack = currentTrack;
        this.nextTrack = nextTrack;
    }

    public String getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(String currentTrack) {
        this.currentTrack = currentTrack;
    }

    public String getNextTrack() {
        return nextTrack;
    }

    public void setNextTrack(String nextTrack) {
        this.nextTrack = nextTrack;
    }

    @Override
    public String toString(){
        return "设备名为"+getDeviceName()+"，状态为"+getState()+"，当前播放曲目为"+getCurrentTrack()+"，下一首曲目为"+getNextTrack()+"。";
    }

    public void displayStatus(){
        System.out.println("设备【"+getDeviceName()+"】：当前播放《"+getCurrentTrack()+"》，请享受音乐。");
    }
}
