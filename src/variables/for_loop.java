package variables;

public class for_loop {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println("intellij"+i);
        }
        for ( int i=1; i<=10; i++) {
            int seventytwo = 72;
            int output = seventytwo*i;
            System.out.println("table of seventytwo="+output);
        }
          for (int i=10; i>=0;i--){
              System.out.println("reverse"+i);
          }
          for (int i=10; i>=1; i--){
              int six=6;
              int output=six*i;
              System.out.println("reverse the table six="+output);
          }
    }
}
