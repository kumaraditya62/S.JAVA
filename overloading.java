class Greet {

    void hello(){
    System.out.println("Hello Friend !!");
    }
    void hello(String name) {
    System.out.println("Hello" + name);
    }
    }
    public class overloading {
    public static void main(String[] args) {
    Greet g1 = new Greet();  
    g1.hello(); 
    g1.hello(" shubham");
    }  
    }