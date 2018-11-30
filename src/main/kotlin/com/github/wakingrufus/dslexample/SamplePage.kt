package com.github.wakingrufus.dslexample

import kotlinx.html.HTML
import kotlinx.html.body
import kotlinx.html.head
import java.util.*

fun samplePage(): HTML.() -> Unit = {
    head {

    }
    body {
        rolodex {
            contact {
                name = "Finn Mertens"
                email = "finnthehuman@hero.gov"
                phone = "+11325554321"
                picture = "finn.jpeg"
            }
            contact {
                name = "Bonnibel Bubblegum"
                email = "princessbubblegum@candykingdom.gov"
                phone = "+11235551234"
                picture = "bubblegum.jpeg"
            }
        }
    }
}

fun resourceAsBase64(path: String): String {
    val imageResource = ClassLoader.getSystemResourceAsStream(path)
    return Base64.getEncoder().encodeToString(imageResource.readBytes())
}