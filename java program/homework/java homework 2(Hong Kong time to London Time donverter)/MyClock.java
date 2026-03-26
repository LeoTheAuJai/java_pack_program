
/**
 * Au Sai Chun
 * 21105253D
 *
 * 
 */
public class MyClock
{
 public static void main(String[] args) {
 ClockDisplay hkTime = new ClockDisplay(11,59);
 ClockDisplay londonTime = new ClockDisplay(10,30);
 hkTime.timeTick();
 londonTime.timeTick();
 boolean night=false;
 int hours=Integer.parseInt(hkTime.gethour());//start executing hk time
 if(hours>=12)
 {
     night=true;
 }
 else
 {
     night=false;
 }
 hours=hours%12;
 if(hours==0)
 {
     hours=12;
 }
 hkTime.setTime(hours,Integer.parseInt(hkTime.getminute()));
 if(night)
 {
      System.out.println(hkTime.getTime()+"P.M.");
 }
 else
 {
     System.out.println(hkTime.getTime()+"A.M.");
 }
 
 hours=Integer.parseInt(londonTime.gethour());//start executing london time
  if(hours>=12)
 {
     night=true;
 }
 else
 {
     night=false;
 }
 hours=hours%12;
 if(hours==0)
 {
     hours=12;
 }
 londonTime.setTime(hours,Integer.parseInt(londonTime.getminute()));
 if(night)
 {
      System.out.println(londonTime.getTime()+"P.M.");
 }
 else
 {
     System.out.println(londonTime.getTime()+"A.M.");
 }
 }
}

