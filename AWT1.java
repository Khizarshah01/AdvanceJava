    // importing Java AWT class  
    import java.awt.*;    
      
    // instating Frame class to our class AWTExample1  
    public class AWT1 {    
      
       // initializing using constructor  
       AWT1() {   
         Frame d = new Frame();
         Label lb = new Label("instating method");
         d.add(lb);
         d.setSize(300, 300);
         d.setVisible(true);     
      }    
      
      
    // main method  
    public static void main(String args[]) {   
      
    // creating instance of Frame class   
    AWT1 f = new AWT1();    
      
    }  
      
    }    