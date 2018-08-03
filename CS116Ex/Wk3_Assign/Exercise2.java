import java.text.*;
public class Exercise2{
  public static void main(String[] arg){
    DecimalFormat dd = new DecimalFormat("0.##");
    NumberFormat nf = NumberFormat.getPercentInstance();
    AbsenceRate report1 = new AbsenceRate();
    AbsenceRate report2 = new AbsenceRate(10,56,"4/12/40");
    double report2AbsRate = report1.instanceAbsentRate(report2)*100.0;
    report1.setStuAbs(23);
    report1.setTotStu(50);
    report1.setDate("3/21/19");
    System.out.println(dd.format(report2AbsRate)+"% of the class is absent in report2.");
    double report1AbsRate = report1.absentRate();
    System.out.println(nf.format(report1AbsRate)+" of the class is absent in report1.");
    System.out.printf("%.2f %% of the class is absent in report2. \n",report2AbsRate);
  }
}
