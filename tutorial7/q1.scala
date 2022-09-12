class Rational(x:Int,y:Int){

    require(y>0,"denominator  positive")

    val numer=x
    val denom=y
    def neg=new Rational(-this.numer,this.denom)
}
object q1 extends App{

    val x = new Rational(1,7)
    val result=x.neg

    println("Negative value of "+x.numer+"/"+x.denom+" is equal to "+result.numer+"/"+result.denom)

}
