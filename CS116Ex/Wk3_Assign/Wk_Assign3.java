import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class Wk_Assign3{
  //PLEASE Note THAT THIS CLASS IS NOT FOR PERCISION-- EX: the actual age of the patient is not needed to self-diagnose; hence, "anyAge" is allowed

  /*MANUAL INPUT CHOICES FOR MUTATORS
    {{"age"},{"10-30","anyAge","30-40"}},
    {{"duration"},{"4-72",".50-168","constant"}},
    {{"frequency"},{"varFrequency","occasional","daily"}},
    {{"timeOfDay"},{"anyTime","worse in PM","constant"}},
    {{"quality"},{"pulsatile","dull aching,band-like","var"}},
    {{"location"},{"retro-obital,temporal,hemicranium","bilater,bitemporal or occipital nuchal","var"}},
    {{"associated"},{"nausea/vomiting, photophobia & phonophobia","other symptoms rare","may have history of Migraine or psychiatric illness. Analgesic abuse common"}}
    *var means any condition
    *if info varible doesn't have var and sytompym is NOT IN LIST, INPUT -1;

  Ex: {{infoV},{1,2,3}}
  infoV = info variable
  For Manual input in mutator, enter in the 1-3 range of choice above.
  Ex: object.setAge(1);  --- the 1 means the age of 10-30
  Ex: object.setAge(2);  --- the 2 means the age of anyAge
  Ex: object.setAge(3);  --- the 1 means the age of 30-40
  */
  public static void main(String arg[]){
    Diagnose report = new Diagnose();
    report.userFriendly();
    //userFriendly method creates interface for user

    Diagnose report2 = new Diagnose(1,2,1,3,1,1,2);
    System.out.println("Report2's condition is "+report2.compute());

    Diagnose report3 = new Diagnose();
    report3.setAge(1);
    report3.setDuration(2);
    report3.setFrequency(1);
    report3.setTimeOfDay(3);
    report3.setQuality(2);
    report3.setLocation(2);
    report3.setAssociated(2);
    System.out.println("Report3's condition is "+report3.compute());
    System.out.println("Info of Report3 is " + report3.toString());
    System.out.println("Report3's age is "+report3.getAge());
    System.out.println("Report3's duration is "+report3.getDuration());
    System.out.println("Report3's frequency is "+report3.getFrequency());
    System.out.println("Report3's timeOfDay is "+report3.getTimeOfDay());
    System.out.println("Report3's quality is "+report3.getQuality());
    System.out.println("Report3's location is "+report3.getLocation());
    System.out.println("Report3's associated is "+report3.getAssociated());

    //I don't know how you guys grade for breakpoints or stepovers
    //Note: I am using Atom instead of eclipse so there might be a difference.
    //Toggle Breakpoint this line
  }
}
