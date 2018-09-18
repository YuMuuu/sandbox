import org.scalatest._

class HelloSpec extends FlatSpec with DiagrammedAssertions {
  val hello = new Hello

  "hello関数" should "hello関数を呼び出すとHelloという文字列を返す" in {
    assert(hello.hello == "Hello")
  }

}
