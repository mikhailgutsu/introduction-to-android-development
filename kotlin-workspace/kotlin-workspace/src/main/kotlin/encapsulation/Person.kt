package encapsulation

open class Person(val name: String, public val age: Int) {

    private val privateInfo: String = "Private"

    protected val protectedInfo: String = "Protected"

    internal val internalInfo: String = "Internal"

    public val publicInfo: String = "Public"

    private fun showPrivateInfo() {
        println("Private: $privateInfo")
    }

    protected fun showProtectedInfo() {
        println("Protected: $protectedInfo")
    }

    internal fun showInternalInfo() {
        println("Internal: $internalInfo")
    }

    public fun showPublicInfo() {
        println("Public: $publicInfo")
    }

    fun accessPrivateInside() {
        showPrivateInfo()
    }
}