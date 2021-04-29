class Time{
    private int hour;           // 0<= x < 24
    private int minute;         // 0<= x < 60
    private int second;         // 0<= x < 60

    //setter/getter
    public void setHour(int hour){
        if(hour < 0 || hour > 24 ) return;
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }

    public void setMinute(int minute){
        if(minute < 0 || minute > 60 ) return;
        this.minute = minute;
    }
    public int getMinute(){
        return minute;
    }

    public void setSecond(int second){
        if(second < 0 || second > 60 ) return;
        this.second = second;
    }
    public int getSecond(){
        return second;
    }
    
}
public class TimeEx{
    public static void main(String[] args){
        Time t = new Time();

        t.setHour(10);
        t.setMinute(40);
        t.setSecond(50);

        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
    }
}