class Rectangle{

int length, breadth;
 Rectangle(int l, int b)
 {
length =l;
breadth = b;
}
Rectangle() {
length = 0;
breadth = 0;
}
int area () {
return length * breadth;
}
int perimeter () {
return 2*(length + breadth);
}
}
 class main {
public static void main (String arr []) {
Rectangle r1 = new Rectangle(8, 5);
System.out.println("Area "+r1.area());
System.out.println("Perimeter = " + r1.perimeter());
Rectangle r2 = new Rectangle(200, 500);
System.out.println("Area = " + r2.area());
System.out.println("Perimeter = " + r2.perimeter());
Rectangle r3 = new Rectangle();
System.out.println("Area = " + r3.area());
System.out.println("Perimeter = " + r3.perimeter());
}
}