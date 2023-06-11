interface MemeCreator {
    fun makeMeme(): String
    fun describeMeme(meme: String): String
}

class MemeCreatorImpl private constructor(author: String) : MemeCreator {
    private val _author = author

    override fun makeMeme(): String = "${_author}: Kolobok hanged himself"

    override fun describeMeme(meme: String): String = "$meme is RZHAKA"

    companion object Factory {
        fun create() = MemeCreatorImpl("Me")
    }
}

class MemeCreatorUnfunny(b: MemeCreator) : MemeCreator by b {
    override fun describeMeme(meme: String): String = "$meme is unfunny >:3"
}

fun main() {
    val creator = MemeCreatorImpl.create()
    val meme = creator.makeMeme()
    println(meme)
    println(creator.describeMeme(meme))
    val creatorDecorator = MemeCreatorUnfunny(creator)
    println(creatorDecorator.describeMeme(meme))
}

main()