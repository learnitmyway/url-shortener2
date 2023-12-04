package com.learnitmyway.urlshortener2.url

import java.util.zip.CRC32

@OptIn(ExperimentalStdlibApi::class)
internal fun toCrc32Hex (longUrl: String): String {
    val crc32 = CRC32()
    crc32.update(longUrl.toByteArray())
    return crc32.value.toHexString(HexFormat {
        number {
            removeLeadingZeros = true
        }
    })
}
