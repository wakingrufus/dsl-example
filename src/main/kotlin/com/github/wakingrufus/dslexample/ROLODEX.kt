package com.github.wakingrufus.dslexample

import kotlinx.css.BorderStyle
import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.properties.borderBottom
import kotlinx.css.px
import kotlinx.html.*

@HtmlTagMarker
class ROLODEX {
    var contactList: List<CONTACT> = listOf()

    fun contact(contact: CONTACT.() -> Unit) {
        contactList += CONTACT().apply(contact)
    }

    operator fun invoke(body: BODY) {
        body.apply {
            h1 { +"Rolodex" }
            div {
                this@ROLODEX.contactList
                        .groupBy { it.name.split(" ").last()[0] }
                        .toList()
                        .sortedBy { it.first }
                        .forEach {
                            h2 {
                                style = css {
                                    display = Display.block
                                    borderBottom(width = 1.px, style = BorderStyle.solid, color = Color.black)
                                }
                                +it.first.toString()
                            }
                            it.second.forEach {
                                it(this)
                            }
                        }
            }
        }
    }
}