package thinkinginjava.innerclasses;

// Creating an inner class directly using the .new syntax.

public class DotNew {
  public class Inner {}
  public static void main(String[] args) {
    DotNew dn = new DotNew();
    DotNew.Inner dni = dn.new Inner();////
    //DotNew.Inner dni2 = new DotNew.Inner(); // wrong
  }
} 
