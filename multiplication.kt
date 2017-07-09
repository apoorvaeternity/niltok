fun main(args: Array<String>){
print("Enter a number to print it's table:")
var num=readLine()!!.toInt()
for (i in 1..10){
println("$num*$i=${num*i}")
}}
