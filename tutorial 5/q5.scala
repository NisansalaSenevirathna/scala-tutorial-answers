object q5 extends App{


  def addEven(n:Int):Int = n match{

    case x if x<=2 =>0
    case x if (x-1)%2==0 =>(n-1)+ addEven(n-1)
    case x =>addEven(n-1)
  }

  
    print("Enter  a number : ")
    var x = scala.io.StdIn.readInt()
    println(addEven(x))


}