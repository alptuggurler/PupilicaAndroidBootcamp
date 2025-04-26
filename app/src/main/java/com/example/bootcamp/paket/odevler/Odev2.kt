package com.example.bootcamp.paket.odevler



fun celsiusToFahrenheit(celsius: Double): Double {
 return (celsius * 1.8) + 32
}

fun rectanglePerimeter(width: Double, height: Double): Double {
    return 2 * (width + height)
}

fun factorial(n: Int): Long {
    var result: Long = 1
    for (i in 1..n) {
        result *= i.toLong()
    }
    return result
}

fun finderA(text: String){
    var count = 0
    for (i in text)
        if (i == 'a')
            count++
    println("a harfi $count adet bulunmaktadır.")
}

fun sumOfInteriorAngles(n: Int): Int {
    return (n - 2) * 180
}

fun salaryCalculator(days: Int): Int {
    val overTimePerHour = 20
    val salaryPerHour = 10
    val dailyHours = 8
    if(days >20){
        val overTimeDays = days - 20
        return (overTimeDays * overTimePerHour) + (dailyHours * salaryPerHour)
    }else
        return days * salaryPerHour * dailyHours
}

fun internetOverageCalculator(quotaLimit:Int , usedInternet:Int):Int{
    //50gb = 100 ₺
   if(quotaLimit % 50 == 0){
       val overage = usedInternet - quotaLimit
       if (overage < 0){
           return ((quotaLimit/50) * 100)
       }
       return (overage * 4) + ((quotaLimit/50) * 100)
   }else{
       println("Kota 50'nin katları olmalıdır.")
       return 0
   }

}