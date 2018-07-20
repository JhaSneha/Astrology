package com.example.gradle.GradleExternalJar

import app.astrosoft.beans.BirthData
import app.astrosoft.beans.Place
import app.astrosoft.core.Horoscope
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*


@SpringBootApplication
class GradleExternalJarApplication

fun main(args: Array<String>) {
    runApplication<GradleExternalJarApplication>(*args)
   val testG = TestG()

    testG.sample()

    println("*********** kotlin class*********")
}

class TestG {

    fun sample() {
        try {
           val place = Place("Bangalore","Karnataka","India", 25.51, 85.47, 5.30)
            val calendar:Calendar=GregorianCalendar(1995, 5, 18, 5, 12, 1)
          val birthData = BirthData("Ashwini",calendar,place)

            val horoscope = Horoscope(birthData)
            horoscope.calculateAll()

            println("$place ")
            println("$calendar")
          println("$birthData")

        } catch (e: Exception) {
            throw e
        }

    }

}
