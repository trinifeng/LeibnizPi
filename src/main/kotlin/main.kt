import kotlin.math.pow

fun main() {
    print("How many iterations do you want to use to approximate pi? ")
    var count = readln()!!.toInt()
    var pi_approx: Double = 0.0

    for (i in 1..count){
        pi_approx += (-1.0).pow(i - 1) * (1.0 / (i + i - 1))
    }

    pi_approx *= 4
    print("The value of pi is approximately $pi_approx")
}