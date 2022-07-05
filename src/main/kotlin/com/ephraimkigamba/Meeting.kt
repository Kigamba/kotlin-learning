package com.ephraimkigamba

class Meeting (val name: String) {
    val start = this

    infix fun at (time: IntRange) {
        println("$name starts at ${time.start}:${time.last}")
    }
}

infix fun String.meeting(block: Meeting.() -> Unit) {
    return Meeting(this)
        .block()
}

class Robot {

    val left = "left"
    val right = "right"
    val fast = "fast"

    val it = this

    infix fun turns(side: String) {
        println("Robot turning $side")
    }


    infix fun runs (speed: String) {
        println("Robot running $speed")
    }

    class RobotSide {

    }

}

fun operate (block: Robot.() -> Unit ) {
    Robot()
        .block()
}
