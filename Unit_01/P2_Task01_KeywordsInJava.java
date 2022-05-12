package Unit_01;

public class P2_Task01_KeywordsInJava {

    public static void main(String[] args) {
//      Identifier expected
     int double = 1.5f;
     //Not a statement
     int("hello");
  }
  //Identifier expected
  int int(string x)
  {
      //Cannot resolve method 'println(string)
      System.out.println(x);
      //Cannot return a value from a method with void result type
      return 0;
  }
  //Invalid method declaration; return type required
  SampleClass boolean = new SampleClass();
}

class SampleClass
{
  int a;
}