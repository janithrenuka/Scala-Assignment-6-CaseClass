import scala.math.sqrt;

object caseClass{

   def main(args:Array[String]){

          val p1 = Point(5,8);
          val p2 = Point(4,3);

          val p3 = p1.add(p2);
          val p4 = p1.move(2,3);
          val p5 = p2.move(5,1);
          val p6 = p1.invert(p1);
          val p7 = p2.invert(p2);

          println("p1 = Point(5,8)");
          println("p2 = Point(4,3)");
          println(""); 
          println("Addition :" + p3);
          println("Movement of p1 with (2,3) :" + p4);
          println("Movement of p2 with (5,1) :" + p5);
          println("Invert of p1 :" + p6);
          println("Invert of p2 :" + p7);

          val d = p1.distance(p2);
        
   }

}

case class Point(a: Int, b: Int){
            
        def x: Int = a;
        def y: Int = b;

    def add(that:Point)=Point(this.x + that.x , this.y + that.y);

    def move(dx: Int,dy: Int) = Point(this.x+dx , this.y+dy);

    def distance(that:Point) ={

        val result = scala.math.sqrt((this.x - that.x)*(this.x - that.x) + (this.y - that.y)*(this.y - that.y)); 
    
        println("Distance between p1 & p2 :" + result);
    }

    def invert(that:Point) = Point(that.y , that.x); 
              
    

} 