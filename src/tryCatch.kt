//java.lang.ArithmetcException
//ArrayIndexOutOfBoundsException
fun main(){
    val d=arrayOf(3,4,5,6)

    try{
        d[4]=7
        println("I ran and changed the value")
    }
    //or simply exception
    catch(e:ArrayIndexOutOfBoundsException){

        println("I ran and caught Exception")
    }

    println(d[2])
}