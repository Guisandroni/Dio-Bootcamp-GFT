public abstract class Clock {
 private int   hour;
 private int   minute;
  private int  second;
   private double formatHour;

   public Clock( int hour,int minute,int second){
       this.hour=hour;
       this.minute=minute;
       this.second=second;

   }

   public int getHour(){
       return hour;
   }

   public int getMinute(){
       return minute;
   }

   public int getSecond(){
       return second;
   }


   public void setHour(int hour){
       if (hour >= 24){
           this.hour=24;
           return;
       }
       this.hour=hour;
   }

   public void setMinute(int minute){
       if (minute >= 60){
           this.minute=60;
           return;
       }
       this.minute=minute;
   }

   public void setSecond(int second){
       if (second >= 60){
           this.second=60;
           return;
       }
       this.second=second;
   }

   abstract Clock convert(Clock clock);
}
