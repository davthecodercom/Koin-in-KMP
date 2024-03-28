import androidx.compose.ui.window.ComposeUIViewController
import di.initKoin

fun MainViewController() = ComposeUIViewController {
    initKoin()
    App(
        greeting = GreetingsHelper().name()
    )
}