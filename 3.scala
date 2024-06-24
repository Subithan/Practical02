object main {
  def main(args: Array[String]): Unit = {
    var salary=NWSalary(40)+OTSalary(30)-tax(NWSalary(40)+OTSalary(30))
    println(salary)
  }
  def NWSalary(h:Int):Int={
    250*h
  }
  def OTSalary(h:Int):Int={
    85*h
  }
  def tax(s:Int):Double={
    s*0.12
  }
}
