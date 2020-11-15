// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KOTLIN_CONFIGURATION_FLAGS: +JVM.USE_OLD_INLINE_CLASSES_MANGLING_SCHEME
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in (1u until 9u).reversed() step 2) {
        uintList += i
    }
    assertEquals(listOf(8u, 6u, 4u, 2u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in (1uL until 9uL).reversed() step 2L) {
        ulongList += i
    }
    assertEquals(listOf(8uL, 6uL, 4uL, 2uL), ulongList)

    return "OK"
}