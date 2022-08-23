object q4 extends App{

  def isEven(n:Int):Boolean=n match{
    case 0 =>true
    case _ =>isOdd(n-1)
  }

  def isOdd(n:Int):Boolean= !(isEven(n))

  print("Enter  a number : ")
    var x = scala.io.StdIn.readInt()
    println(isEven(x))


  

}