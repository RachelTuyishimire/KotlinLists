fun main() {
   println(returnList(listOf("Umbrella", "Car", "Pen", "Book", "Bag", "Jacket", "Sweater", "Door", " Wallet", "Soap")))
   println(average(listOf(5.45, 6.2, 1.76, 3.34)))
    sortedInfo()





}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun returnList (words: List<String>): List<String>{
    var emptyList = listOf<String>()
    for (a in words)
        if (words.indexOf(a)%2==0){
            emptyList+=a

        }
    return emptyList
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class PeopleHeights ( var average: Double, var total: Double)
    fun average(heights: List<Double>): PeopleHeights {
        val average = heights.average()
        var total = heights.sum()
        val info = PeopleHeights ( average, total)
       return info

}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Personobjects( var name: String, var age: Byte, var height: Double, var weight: Double)
open fun sortedInfo(){
    val human = Personobjects("Joshua", 20, 1.80, 70.00)
    val human2 = Personobjects("Prince", 25, 1.73, 60.00)
    val human3 = Personobjects("Christelle", 28, 1.50, 56.02)
    val friends = listOf(human, human2, human3)
    val sortedinfo = friends.sortedByDescending { friends -> friends.age }
    println(sortedinfo)

}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun pushNewInfo(){
    val human4 = Personobjects("Gilbert", 30, 1.75, 80.03)
    val human5 = Personobjects("Yannis", 19, 1.70, 90.05)
    val amigos = listOf(human4, human5)

}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
