package thinkinginjava.innerclasses;


// ����ط���Eclipse�Ҳ���main����Ҫ��������ʾָ��class
public interface ClassInInterface {
  void howdy();
  
  class Test implements ClassInInterface {
    public void howdy() {
      System.out.println("Howdy!");
    }
    
    public static void main(String[] args) {
      new Test().howdy();
    }
  }
} 
