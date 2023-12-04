package com.learnitmyway.urlshortener2.url

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ToCrc32HexKtTest {
    @Test
    fun `hashes string using CRC32 and encodes to hex`() {
        Assertions.assertThat(toCrc32Hex("https://www.learnitmyway.com")).isEqualTo("40616eb8")
    }
}
