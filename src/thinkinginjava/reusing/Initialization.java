package thinkinginjava.reusing;


public class Initialization {
    public static void main(String[] args) {
           new B();
          new A.C();
   }
}

class A {
    private P p1 = new P("A--p1");
    static P p3 = new P("A--p3");

    public A() {
          System. out.println("A()" );
   }

    private P p2 = new P("A--p2");
    static {
           new P("A--static" );
   }
   {
           new P("A{...}" );
   }

    public static class C {
           private P p1 = new P("C--p1");
           static P p3 = new P("C--p3");

           public C() {
                 System. out.println("C()" );
          }

           private P p2 = new P("C--p2");
           static {
                  new P("C--static" );
          }
          {
                  new P("C{...}" );
          }
   }
}

class B extends A {
    private P p1 = new P("B --p1");
    static P p3 = new P("B -- p3");

    public B() {
          System. out.println("B()" );
   }

    public P p2 = new P("B -- p2");
    static {
           new P("B -- static" );
   }

   {
           new P("B{...}" );
   }
}

class P {
    public P(String s) {
          System. out.println(s);
   }
}
/*
* ������
A--p3     //��������������еľ�̬���Ǿ�̬����
A--static
B -- p3
B -- static
A--p1
A--p2
A{...}
A()
B --p1
B -- p2
B{...}
B()
C--p3
C--static
C--p1
C--p2
C{...}
C()

�и�������
1. ���ظ���
1.1 Ϊ��̬���Է���洢�ռ䲢����ʼֵ
1.2 ִ�о�̬��ʼ����;�̬��ʼ����䣨�������£�
2. ��������
2.1 Ϊ��̬���Է���洢�ռ�
2.2 ִ�о�̬��ʼ����;�̬��ʼ����䣨�������£�
3. ���ظ��๹����
3.1 Ϊʵ�����Է�������ռ䲢����ʼֵ
3.2 ִ��ʵ����ʼ�����ʵ����ʼ�����
3.3 ִ�й���������
4. �������๹����
4.1 Ϊʵ�����Է�������ռ䲢����ʼֵ
4.2 ִ��ʵ����ʼ�����ʵ����ʼ�����
4.3 ִ�й���������
5  �ص�main()
�ڲ���ļ��ع���Ҳһ��


static������������̬�飬��������Ⱥ�˳��ִֻ��һ�Σ�ֻ�е�һ�����󱻴�����ʱ����ߵ�һ�η��ʾ�̬���ݵ�ʱ��Żᱻ��ʼ������ʼ�����о�̬������
��ͨ��������������Ⱥ�˳�����ڶ������Ա�����ع��캯��ʱ�Ż���س�ʼ���ⲿ�֣����򲻳�ʼ����
���췽����ʵ�����Ǿ�̬������
�༶�ڲ��ࣨ��̬�ڲ��ֻࣩ���ڵ�һ��ʹ�õ�ʱ��Ż���ء�
*/