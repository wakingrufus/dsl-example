package com.github.wakingrufus.dslexample

import kotlinx.css.*
import kotlinx.css.properties.borderBottom
import kotlinx.html.*
import java.util.*

fun samplePage(): HTML.() -> Unit = {
    head {

    }
    body {
        h1 { +"Rolodex" }
        h2 {
            style = css {
                display = Display.block
                borderBottom(width = 1.px, style = BorderStyle.solid, color = Color.black)
            }
            +"B"
        }
        div {
            div {
                div {
                    style = css {
                        height = 3.em
                        display = Display.inlineBlock
                    }
                    val imageBase64 = resourceAsBase64("bubblegum.jpeg")
                    img(src = "data:image/png;base64, $imageBase64") {
                        style = css {
                            //   verticalAlign = VerticalAlign.top
                            height = 3.em
                            //   width = LinearDimension.auto
                            maxHeight = 3.em
                        }
                    }
                }
                div {
                    style = css {
                        display = Display.inlineBlock
                    }
                    span {
                        style = css {
                            display = Display.block
                            fontWeight = FontWeight.bold
                            fontSize = 1.17.em
                        }
                        +"Bonnibel Bubblegum"
                    }
                    div {
                        style = css {
                            display = Display.inlineBlock
                        }
                        span {
                            style = css {
                                display = Display.inlineBlock
                                width = 6.em
                            }
                            +"Email"
                        }
                        span {
                            style = css {
                                display = Display.inlineBlock
                            }
                            a(href = "mailto://princessbubblegum@candykingdom.gov") { +"princessbubblegum@candykingdom.gov" }
                        }
                    }
                    div {
                        span {
                            style = css {
                                display = Display.inlineBlock
                                width = 6.em
                            }
                            +"Phone"
                        }
                        span {
                            style = css {
                                display = Display.inlineBlock
                            }
                            +"+11235551234"
                        }
                    }
                }
            }
        }

        h2 {
            style = css {
                display = Display.block
                borderBottom(width = 1.px, style = BorderStyle.solid, color = Color.black)
            }
            +"M"
        }
        div {
            div {
                div {
                    style = css {
                        height = 3.em
                        display = Display.inlineBlock
                    }
                    val imageBase64 = resourceAsBase64("finn.jpeg")
                    img(src = "data:image/png;base64, $imageBase64") {
                        style = css {
                            //   verticalAlign = VerticalAlign.top
                            height = 3.em
                            //   width = LinearDimension.auto
                            maxHeight = 3.em
                        }
                    }
                }
                div {
                    style = css {
                        display = Display.inlineBlock
                    }
                    span {
                        style = css {
                            display = Display.block
                            fontWeight = FontWeight.bold
                            fontSize = 1.17.em
                        }
                        +"Finn Mertens"
                    }
                    div {
                        style = css {
                            display = Display.inlineBlock
                        }
                        span {
                            style = css {
                                display = Display.inlineBlock
                                width = 6.em
                            }
                            +"Email"
                        }
                        span {
                            style = css {
                                display = Display.inlineBlock
                            }
                            a(href = "mailto://finnthehuman@hero.org") { +"finnthehuman@hero.gov" }
                        }
                    }
                    div {
                        span {
                            style = css {
                                display = Display.inlineBlock
                                width = 6.em
                            }
                            +"Phone"
                        }
                        span {
                            style = css {
                                display = Display.inlineBlock
                            }
                            +"+11325554321"
                        }
                    }
                }
            }
        }
    }
}

fun resourceAsBase64(path: String): String {
    val imageResource = ClassLoader.getSystemResourceAsStream(path)
    return Base64.getEncoder().encodeToString(imageResource.readBytes())
}