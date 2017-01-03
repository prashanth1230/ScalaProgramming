package com.pras
import scala.beans.BeanProperty

/**
  * Created by Prashanth.Manjunath on 03-01-2017.
  */
class Person(@BeanProperty var age: Int)
//@BeanProperty allows us to use Java style getters and setters.
