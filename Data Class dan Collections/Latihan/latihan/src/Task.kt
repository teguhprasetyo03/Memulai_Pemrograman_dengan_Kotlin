fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to "Motorcylce",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle.getValue("type")
    val maxSpeed = vehicle.getValue("maxSpeed")
    val maxTank = vehicle.getValue("maxTank")

    // TODO 3
    println("""
    Vehicle
    Type: Motorcycle
    Maximal Speed: 230Km/s
    Maximal Tank: 10Ltr
    """.trimIndent())
}