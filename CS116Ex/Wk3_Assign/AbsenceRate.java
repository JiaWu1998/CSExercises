public class AbsenceRate{
  public int studentAbsent, totalStudent;
  public String classDate;

  public AbsenceRate(){
    studentAbsent = 0;
    totalStudent = 0;
    classDate = "";
  }
  public AbsenceRate(int stuAb, int tStu, String claDate){
    studentAbsent = stuAb;
    totalStudent = tStu;
    classDate = claDate;
  }
  public void setStuAbs(int stuA){
    studentAbsent = stuA;
  }
  public void setTotStu(int stuT){
    totalStudent = stuT;
  }
  public void setDate(String datee){
    classDate = datee;
  }
  public int getStuAbs(){
    return studentAbsent;
  }
  public int getTotStu(){
    return totalStudent;
  }
  public String getDate(){
    return classDate;
  }
  public String toString(){
    return "studentAbsents="+studentAbsent+",totalStudent="+totalStudent+",classDate="+classDate;
  }
  public double absentRate(){
    return ((double) studentAbsent / (double) totalStudent);
  }
  public double instanceAbsentRate(AbsenceRate obj){
    return ((double) obj.studentAbsent / (double) obj.totalStudent);
  }
}
