object q1 extends App{

  def GCD(x:Int ,y:Int):Int =y match{
    case 0=>x
    case y if y>x =>GCD(y,x)
    case _ =>GCD(y , x%y)
  }

  def prime(p:Int ,n:Int=2):Boolean=n match{

    case x if x<=1=>false
    case x if(x==p)=>true
    case x if GCD(p,x)>1=>false
    case x=> prime(p,x+1)
  }

  println(prime(5))
  println(prime(8))



}

