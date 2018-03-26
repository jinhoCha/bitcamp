package step08;



class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
      
  //  static void sum(){
   //     System.out.println();
  //  }
    public static int sum(int left, int rigth) {return left + rigth;}
   
    
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
  
public class Examaaaaa {
       
    public static void main(String[] args) {
          int c = 0;
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
         
        
       c = Calculator.sum(2,3);
       System.out.println(c);
       
        c1.avg();       
          
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
    
        c2.avg();
    }
  
}