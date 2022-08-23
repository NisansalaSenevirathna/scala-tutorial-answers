object q3 extends App{
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

    def primeSeq(n:Int):Any={
      if(n>1){  
        if(prime(n-1)){
          primeSeq(n-1)
          println(n-1)
        }else{
          primeSeq(n-1)
        }
      }
    }
    (primeSeq(7))
}