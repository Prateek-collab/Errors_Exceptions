//null safety operator '?'
//used to declare a var whose value maybe null.
//Elvis operator ?:
//filterNotNull()
fun main(){
    val nullValue:String?=null
    val nullList=listOf(1,2,3,null,4,5,null,6)
    val nullArrayList=arrayListOf("This",null,"is","a",null,"statement")


    //omitts the null values
    println(nullValue?.length ?: "This is null")
    println("This list without the null value is ${nullList.filterNotNull()}")
    println("The array list without the null values is ${nullArrayList.filterNotNull()}")
}
