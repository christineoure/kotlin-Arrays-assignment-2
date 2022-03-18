fun main (){
     var multiply = product(arrayOf(30,40,50))
    println(multiply)
    var sum = mixedArray(arrayOf(25,4.5,45,2.5F,"Evan",true))
    println(sum)
    var alphabet = charArray(arrayOf('a','u','r','o','r','a','i','s','i','a','o','l','g','a','o','p'))
    println(alphabet)
}
//Crreating a function that takes in an array of integers
// and returns the product of all elements in the array
fun product (nums:Array<Int>):Int{
    var prod = 1
    nums.forEach { digits->
       prod*=digits
    }
   return prod
}
//Creating a function that takes in an array of mixed array
// and returns the sum of the doubles in the array
fun mixedArray ( Inters: Array<Any>): Number{
    var sum = 0.0
    Inters.forEach { nums->
        if (nums is Double){
            sum+=nums.toString().toDouble()
        }
    }
    return sum
}
//Creating a function that takes in an array of characters
// and returns the number of vowels in the array
fun charArray (Chars:Array<Char>):Int{
    var char = 0
    Chars.forEach { vowels->
        if (vowels == 'a' ||vowels == 'e' ||vowels == 'i' ||vowels == 'o' ||vowels == 'u'){
            ++char
        }

    }
    return char
}