object q3 extends App{
  def ADD(x:Int):Int=x match{

    case 0=>0
    case _=>x +ADD(x-1)


  }
  print(ADD(5))
}