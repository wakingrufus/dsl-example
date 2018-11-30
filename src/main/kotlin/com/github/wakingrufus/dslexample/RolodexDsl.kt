package com.github.wakingrufus.dslexample

import kotlinx.html.BODY

fun BODY.rolodex(rolodex: ROLODEX.() -> Unit) {
    ROLODEX().apply(rolodex)(this)
}