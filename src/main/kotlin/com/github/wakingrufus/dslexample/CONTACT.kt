package com.github.wakingrufus.dslexample

import kotlinx.css.Display
import kotlinx.css.FontWeight
import kotlinx.css.em
import kotlinx.html.*

@HtmlTagMarker
class CONTACT{
    var picture: String = ""
    var name: String = ""
    var email: String = ""
    var phone: String = ""

    operator fun invoke(div: DIV){
        div.apply {
            div {
                div {
                    div {
                        style = css {
                            height = 3.em
                            display = Display.inlineBlock
                        }
                        val imageBase64 = resourceAsBase64(this@CONTACT.picture)
                        img(src = "data:image/png;base64, $imageBase64") {
                            style = css {
                                height = 3.em
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
                            +this@CONTACT.name
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
                                a(href = "mailto://" + this@CONTACT.email) { +this@CONTACT.email }
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
                                +this@CONTACT.phone
                            }
                        }
                    }
                }
            }
        }
    }
}