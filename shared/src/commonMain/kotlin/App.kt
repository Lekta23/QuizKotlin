import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import network.Answer
import network.Question
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
      //welcomeScreen()
      // myCV()
      // ScoreScreen("10/20")
      QuestionsScreen(listOf(
        Question(1, "Android is a great platform ?", 1, listOf(Answer(1, "YES"), Answer(2, "NO"))),
        Question(2, "Kotlin is a great language ?", 1, listOf(Answer(1, "YES"), Answer(2, "NO"))),
        Question(3, "Compose is a great UI toolkit ?", 1, listOf(Answer(1, "YES"), Answer(2, "NO"))),
        Question(4, "KMM is a great technology ?", 1, listOf(Answer(1, "YES"), Answer(2, "NO"))),
        Question(5, "Jetpack is a great library ?", 1, listOf(Answer(1, "YES"), Answer(2, "NO"))),
      ))

    }
}

expect fun getPlatformName(): String