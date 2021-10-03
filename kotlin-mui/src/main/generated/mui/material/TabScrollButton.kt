// Automatically generated - do not modify!

@file:JsModule("@mui/material/TabScrollButton")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface TabScrollButtonProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TabScrollButtonClasses

    /**
     * The direction the button should indicate.
     */
    var direction: Union /* 'left' | 'right' */

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean

    /**
     * The component orientation (layout flow direction).
     */
    var orientation: Union /* 'horizontal' | 'vertical' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/components/tabs/)
 *
 * API:
 *
 * - [TabScrollButton API](https://mui.com/api/tab-scroll-button/)
 */
@JsName("default")
external val TabScrollButton: react.FC<TabScrollButtonProps>