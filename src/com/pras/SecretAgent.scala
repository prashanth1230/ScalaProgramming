package com.pras

/**
  * Created by Prashanth.Manjunath on 15-02-2017.
  */
class SecretAgent(val name: String) {
  def shoot(n: Int) = {
    import SecretAgent._
    decrementBullets(n)
  }
}

object SecretAgent {
  private var b: Int = 3000

  private def decrementBullets(count: Int): Unit = {
    if (b - count <= 0) {
      b = 0
    } else {
      b = b - count
    }
  }

  def bullets = b
}

object SecretAgentRunner extends App {
  val bond = new SecretAgent("James Bond")
  val felix = new SecretAgent("Felix Leitner")
  val json = new SecretAgent("Jason Bourne")
  val _99 = new SecretAgent("Agent 99")
  val max = new SecretAgent("Max Smart")

  bond.shoot(800)
  felix.shoot(200)
  json.shoot(150)
  _99.shoot(150)
  max.shoot(200)

  println(SecretAgent.bullets)
}
