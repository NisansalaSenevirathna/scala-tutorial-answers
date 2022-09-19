import scala.math._

case class Point(var x:Int, var y:Int){

    def +(p:Point)=Point(this.x+p.x,this.y+p.y)

    def move(a:Int,b:Int)={
        this.x=a+this.x
        this.y=b+this.y
    }

    def distance(p:Point)=sqrt(pow(p.x-x,2)+pow(p.y-y,2))

    def invert()={
        var a=this.x
        this.x=this.y
        this.y=a
    }

}

object q1 extends App{
      val p1=Point(3,4)
      val p2=Point(4,5)
      val p3=Point(2,3)

      //add(+) should add two given points
      println(p1+p2)
      
      //move a point by a given distance dx and dy
      p1.move(2,2)
      println(p1)

      // return the distance between two given points
      var reault1=p1.distance(p2)
      println(reault1)
      
      //d switch the x and y coordinates.
      p3.invert()
      println(p3)
}
