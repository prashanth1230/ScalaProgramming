import com.pras.{Box, Department, Manager}

/**
  * Created by Prashanth.Manjunath on 15-02-2017.
  */

val intBox = new Box(1)
val intBox2: Box[Int] = Box(2)
val intBox3 = Box(2): Box[Int]
println(intBox3.t)

val managerBox = Box(new Manager("Kathy", "Sierra", Department("Programming"), null))
println(managerBox.t)