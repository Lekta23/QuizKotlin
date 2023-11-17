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
        Question(1, "What is the capital of France ?", 1, listOf(Answer(1, "Paris"), Answer(2, "London"))),
        Question(2, "What is the capital of England ?", 1, listOf(Answer(1, "London"), Answer(2, "Paris"))),
        Question(3, "What is the capital of Spain ?", 2, listOf(Answer(1, "Paris"), Answer(2, "Madrid"))),
        Question(4, "What is the capital of Italy ?", 1, listOf(Answer(1, "Rome"), Answer(2, "Paris"))),
        Question(5, "What is the capital of Germany ?", 2, listOf(Answer(1, "Paris"), Answer(2, "Berlin"))),
      ))

    }
}

expect fun getPlatformName(): String