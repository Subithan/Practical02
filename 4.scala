object main {
  def main(args: Array[String]): Unit = {
    var profit1=profit(15,120)
    var profit2=profit(10,140)
    var profit3=profit(20,100)
    println("for 120 people with the ticket price of 15, the profit is :")
    println(profit1)
    println("for 140 people with the ticket price of 10, the profit is :")
    println(profit2)
    println("for 100 people with the ticket price of 20, the profit is :")
    println(profit3)
  }
  def earning(price:Int,people:Int):Int={
    price*people
  }
  def profit(price:Int,people:Int):Int={
    earning(price,people)-500-3*people
  }
}
