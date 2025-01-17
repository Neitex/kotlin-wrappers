// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""(/*union*/{auto: 'auto', content: 'content', fitContent: 'fit-content', maxContent: 'max-content', minContent: 'min-content', none: 'none'}/*union*/)""")
sealed external interface Flex {
    companion object {
        val auto: Flex
        val content: Flex
        val fitContent: Flex
        val maxContent: Flex
        val minContent: Flex
        val none: Flex
    }
}

inline fun Flex(
    grow: FlexGrow,
    basis: FlexBasis,
): Flex =
    "$grow $basis".unsafeCast<Flex>()

inline fun Flex(
    grow: FlexGrow,
    shrink: FlexShrink,
): Flex =
    "$grow $shrink".unsafeCast<Flex>()

inline fun Flex(
    grow: FlexGrow,
    shrink: FlexShrink,
    basis: FlexBasis,
): Flex =
    "$grow $shrink $basis".unsafeCast<Flex>()
