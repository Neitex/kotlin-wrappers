// Automatically generated - do not modify!

package typescript

sealed external interface JSDoc : Node, Union.JSDoc_ {
    override val kind: SyntaxKind.JSDocComment
    override val parent: HasJSDoc
    val tags: NodeArray<JSDocTag>?
    val comment: dynamic /* string | NodeArray<JSDocComment> */
}
