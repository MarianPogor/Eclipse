package hello;

import hello.stub.HelloStub;

public class Client
{

  
      public static void main( String[] args ) throws Exception
      {
      String URL = "http://localhost:8080/axis2/services/Hello";
      HelloStub stub = new HelloStub( URL );
      HelloStub.GetHelloTextResponse res = stub.getHelloText( new
      HelloStub.GetHelloText() );
      System.out.println( "Received: " + res.get_return() );
      }

   

}
