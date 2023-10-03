import javax.swing.*;    
public class progressBar extends JFrame{    
JProgressBar jb;    
int i=0,num=0;
JLabel l1;
progressBar(){    
jb=new JProgressBar(0,2000);    
jb.setBounds(40,40,160,30);         
jb.setValue(0);    
jb.setStringPainted(true);
//JLabel l1;
l1 = new JLabel("completed!");
l1.setBounds(80,80,170,40);
l1.setVisible(false);
add(l1);
add(jb);    
setSize(250,150);    
setLayout(null);    
}    
public void iterate(){    
while(i<=2000){    
  jb.setValue(i);    
  i=i+20;    
  try{Thread.sleep(150);}catch(Exception e){}    
}
//
l1.setVisible(true);
}    
public static void main(String[] args) {    
    progressBar m=new progressBar();    
    m.setVisible(true);    
    m.iterate();
    
}    
}    
