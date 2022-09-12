 import scala.io.StdIn.readDouble

 class Account(id:String,n:Int,b:Double){

    val nic:String=id
    val acno=n
    var balance=b
    
    override def toString = "[ " + nic + " : " + acno + " : " + balance +" ]"

    def withdraw(a:Double)=this.balance-a
   
    def deposit(a:Double)=this.balance+a
    
    def transfer(a:Account,b:Double)={

        if(b>this.balance){

          println("No funds sufficient")
        }
        else{
          this.balance=this.withdraw(b)
          a.balance=a.deposit(b)
        }
    }
}
object q3 extends App{
  val acc1=new Account("011",111,10000)
  val acc2=new Account("012",222,40000)

  var bank:List[Account]=List(acc1,acc2)

  println("Before  transaction:")
  println("Account "+acc1.acno+" balance:"+acc1.balance)
  println("Account "+acc2.acno+" balance:"+acc2.balance+"\n")

  print("Enter transfer amount:")

  var amount=readDouble()
  acc1.transfer(acc2,amount)

  println("After transaction:")

  println("Account "+acc1.acno+" balance:"+acc1.balance)
  println("Account "+acc2.acno+" balance:"+acc2.balance)

}

