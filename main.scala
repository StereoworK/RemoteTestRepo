class MyClass{
  def print(): Unit = println("This is MyClass method")
}

object MyApp{
  def Main(args: Array[String]): Unit = {
      println("this is main function")
      val myClass = new MyClass()
      myClass.print()
  }
}
