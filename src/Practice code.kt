fun main(){
    var myString:String?="Hello,Kotlin"
    val x: Int? =null
    val myList=mutableListOf(1,null,2,4,null,6,8,10,null)

    myList.add(7,12)

    myString=null

    println(myString?.length)
    println(x ?:0.0)
    println(myList.filterNotNull())

}