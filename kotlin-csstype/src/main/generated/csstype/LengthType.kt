// Automatically generated - do not modify!

package csstype

sealed external interface LengthType :
    Bleed,
    GridLength,
    LengthProperty,
    LineWidth {

    sealed interface Auto :
        AutoLengthProperty,
        BlockSize,
        BorderImageWidth,
        Columns,
        GridAutoStripes,
        GridTemplateStripes,
        Height,
        InlineSize,
        MaskBorderWidth,
        MinBlockSize,
        MinHeight,
        MinInlineSize,
        MinWidth,
        Width

    sealed interface FitContent :
        BlockSize,
        Height,
        InlineSize,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth,
        MinBlockSize,
        MinHeight,
        MinInlineSize,
        MinWidth,
        Width

    sealed interface Intrinsic :
        MaxHeight,
        MaxWidth,
        MinHeight,
        MinWidth,
        Width

    sealed interface MaxContent :
        BlockSize,
        GridAutoStripes,
        GridTemplateStripes,
        Height,
        InlineSize,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth,
        MinBlockSize,
        MinHeight,
        MinInlineSize,
        MinWidth,
        Width

    sealed interface MinContent :
        BlockSize,
        GridAutoStripes,
        GridTemplateStripes,
        Height,
        InlineSize,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth,
        MinBlockSize,
        MinHeight,
        MinInlineSize,
        MinWidth,
        Width

    sealed interface MinIntrinsic :
        MinWidth,
        Width

    sealed interface None :
        GridTemplateStripes,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth

    sealed interface Normal :
        LineHeight
}
