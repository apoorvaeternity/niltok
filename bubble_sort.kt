fun main(args: Array<String>){
val a=arrayOf(6,5,4,3,2,1)
val length=a.size
for (i in 0..length-2)
{
for (j in 0..length-i-2)
{var temp: Int
if (a[j]>a[j+1]){
temp=a[j]
a[j]=a[j+1]
a[j+1]=temp
}
}
}
println("After sorting:")
for (index in a.indices) print(a[index])	
}



