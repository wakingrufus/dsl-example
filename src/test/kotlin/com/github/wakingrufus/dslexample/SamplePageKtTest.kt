package com.github.wakingrufus.dslexample

import org.junit.jupiter.api.Test
import java.io.File
import java.io.FileWriter

internal class SamplePageKtTest {

    @Test
    fun `test sample page`() {
        writeHtmlPage(FileWriter(File(testOutputDir(), "index.html")), samplePage())
    }
}

fun testOutputDir(): File {
    val d = File(File("build"), "output")
    if (!d.exists()) d.mkdir()
    return d
}
