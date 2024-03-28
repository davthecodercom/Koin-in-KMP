import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GreetingsHelper : KoinComponent {
    private val greeting : Platform by inject()
    fun name() : String = greeting.name
}