public class ConvertTest{
  public static void main(String[] args){
    ConvertFe tem1 = new ConvertFe();
    ConvertFe tem2 = new ConvertFe(60);
    tem1.setTempF(70);
    System.out.println(tem2.compareTo(new ConvertFe(60)));
    System.out.println(tem2.equals(tem1));
    System.out.println(tem2.equals(new ConvertFe(60)));

    System.out.println(tem1.convertToCeClass(60));
    System.out.println(tem1.convertToCeInstance(60));
  }
}
