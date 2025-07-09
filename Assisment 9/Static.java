class A {
  void f1() { System.out.println("Non-static function"); }
  static void f2() { System.out.println("Static function"); }
 }
 class Hello1 {
  public static void main(String[] args) {
    A obj = new A(); 
    obj.f1(); 
    A.f2();
  }
 }
