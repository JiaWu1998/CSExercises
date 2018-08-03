import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

//self-note: Java is not spaghetti code -- try creating all jcomponent->add to Jframe and render and ! render JFrame first and then add jcomponents. *Stupid mistake-- the jframe only renders once(i can fix if it renders multiple but too lazy)
public class Diagnose{
  private String[][][] descript = {
    {{"age"},{"10-30","anyAge","30-40"}},
    {{"duration"},{"4-72hr",".50-168hr","constant"}},
    {{"frequency"},{"anyFrequency","occasional","daily"}},
    {{"timeOfDay"},{"anyTime","worse in PM","constant"}},
    {{"quality"},{"pulsatile","dull aching,band-like","anyQuality"}},
    {{"location"},{"<html>retro-obital,<br>temporal,<br>hemicranium</html>","<html>bilater,<br>bitemporal,<br> or occipital nuchal</html>","var"}},
    {{"associated"},{"<html>nausea/vomiting,<br> photophobia <br>& phonophobia</html>","other symptoms rare","<html>history of Migraine,<br> psychiatric illness,<br>or Analgesic abuse </html>"}}
  };
  private int age,duration,frequency,timeOfDay,quality,location,associated;
  private int[] allInfo = {age,duration,frequency,timeOfDay,quality,location,associated};
  //ints above are within the ranges of 1-3 with sytompyms equating the numbers
  //0 = undefined
  //1 = sytompyms of Migraine
  //2 = sytompyms of Tension Headache
  //3 = sytompyms of Chronic Daily Headache

  public Diagnose(){
    allInfo[0] = -1;
    allInfo[1] = -1;
    allInfo[2] = -1;
    allInfo[3] = -1;
    allInfo[4] = -1;
    allInfo[5] = -1;
    allInfo[6] = -1;
  }
  public Diagnose(int ag,int duratio, int frequenc,int timeOfDa,int qualit,int locatio,int associate){
    allInfo[0] = ag;
    allInfo[1] = duratio;
    allInfo[2] = frequenc;
    allInfo[3] = timeOfDa;
    allInfo[4] = qualit;
    allInfo[5] = locatio;
    allInfo[6] = associate;
  }
  public String toString(){
    return "age="+allInfo[0]+",duration="+allInfo[1]+",frequency="+allInfo[2]+",timeOfDay="+allInfo[3]+",quality="+allInfo[4]+",location="+allInfo[5]+",associated="+allInfo[6];
  }
  public void setAge(int numAge){
    allInfo[0] = numAge;
  }
  public void setDuration(int dur){
    allInfo[1] = dur;
  }
  public void setFrequency(int fre){
    allInfo[2] = fre;
  }
  public void setTimeOfDay(int tim){
    allInfo[3] = tim;
  }
  public void setQuality(int qua){
    allInfo[4] = qua;
  }
  public void setLocation(int loca){
    allInfo[5] = loca;
  }
  public void setAssociated(int asso){
    allInfo[6] = asso;
  }
  public String getAge(){
    if(age != -1){
      return descript[0][1][allInfo[0]-1];
    }else{
      return "indiscrimate";
    }
  }
  public String getDuration(){
    if(duration != -1){
      return descript[1][1][allInfo[1]-1];
    }else{
      return "indiscrimate";
    }
  }
  public String getFrequency(){
    if(frequency != -1){
      return descript[2][1][allInfo[2]-1];
    }else{
      return "indiscrimate";
    }
  }
  public String getTimeOfDay(){
    if(timeOfDay != -1){
      return descript[3][1][allInfo[3]-1];
    }else{
      return "indiscrimate";
    }
  }
  public String getQuality(){
    if(quality != -1){
      return descript[4][1][allInfo[4]-1];
    }else{
      return "indiscrimate";
    }
  }
  public String getLocation(){
    if(location != -1){
      return descript[5][1][allInfo[5]-1];
    }else{
      return "indiscrimate";
    }
  }
  public String getAssociated(){
    if(associated != -1){
      return descript[6][1][allInfo[6]-1];
    }else{
      return "indiscrimate";
    }
  }
  public String compute(){
    double condition1 = 0.0;
    double condition2 = 0.0;
    double condition3 = 0.0;
    double condition4 = 0.0;
    for(int s=0; s<7;s++){
      switch(allInfo[s]){
        case 1:
          condition1 += 1.0;
        break;
        case 2:
          condition2 += 1.0;
        break;
        case 3:
          condition3 += 1.0;
        break;
        case -1:
          condition4 += 1.0;
        break;
      }
    }
      condition1 /= 7.0;
      condition2 /= 7.0;
      condition3 /= 7.0;
      condition4 /= 7.0;
      if(condition1>condition2 && condition1>condition3 && condition1>condition4){
        return "Migraine";
      }else if(condition2>condition1 && condition2>condition3 && condition2>condition4){
        return "Tension Headache";
      }else if(condition3>condition2 && condition3>condition1 && condition3>condition4){
        return "Chronic Daily Headache";
      }else{
        return "indiscrimate";
      }
  }

/////////////////////////
public void userFriendly(){
  JFrame window = new JFrame("Diagnose");

  JButton but = new JButton("Submit");

  JPanel panel = new JPanel(new GridLayout(8,5));
  panel.setBorder(new EmptyBorder(20,20,20,100));

  for(int h=0; h<8;h++){
    switch(h){
      case 7:
        for(int g=1;g<=5;g++){
            if(g == 5){
              panel.add(but);
              but.addActionListener(e -> {
                JPanel result = new JPanel(new GridLayout(8,0));
                JLabel resultText = new JLabel("Your condition:" + this.compute());
                JLabel ageText = new JLabel("Age: " + this.getAge());
                JLabel durText = new JLabel("Duration: " + this.getDuration());
                JLabel freText = new JLabel("Frequency: " + this.getFrequency());
                JLabel timText = new JLabel("Time of Day: " + this.getTimeOfDay());
                JLabel quaText = new JLabel("Quality: " + this.getQuality());
                JLabel locText = new JLabel("Location: " + this.getLocation());
                JLabel assText = new JLabel("Associated symptoms: " + this.getAssociated());

                result.add(resultText);
                result.add(ageText);
                result.add(durText);
                result.add(freText);
                result.add(timText);
                result.add(quaText);
                result.add(locText);
                result.add(assText);
                window.getContentPane().removeAll();
                window.getContentPane().add(result);
                window.pack();
                window.revalidate();
                window.repaint(); //revisualizes the window or updates

              });
            }
            else{
              panel.add(new JLabel(""));
            }
          }
        break;
        default:
          panel.add(new JLabel(descript[h][0][0]));
          for (int i=0; i<4; i++) {
                  switch(i){
                    case 3:
                      panel.add(new JTextField("Others"));
                    break;
                    default:
                      JCheckBox checks = new JCheckBox(descript[h][1][i]);
                      panel.add(checks);
                      checks.addItemListener(new ItemListener(){
                        public void itemStateChanged(ItemEvent e){
                          if(e.getStateChange() == ItemEvent.SELECTED){
                            for(int b=0; b<7;b++){
                              for(int c=0; c<3;c++){
                                if(descript[b][1][c] == checks.getText()){
                                  allInfo[b] = c+1;
                                }
                              }
                            }
                          }
                        }
                      });
                    break;
                  }
                }
          break;
      }
    }
      window.pack();
      window.setSize((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
      window.setLocationRelativeTo(null);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setContentPane(panel);
      window.setMinimumSize(window.getSize());
      window.setVisible(true);

}

}//end of class
