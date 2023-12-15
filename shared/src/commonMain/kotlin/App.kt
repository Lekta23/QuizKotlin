import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.resources.ExperimentalResourceApi


private val repository = QuizRepository()
@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
  PreComposeApp {
    MaterialTheme {
      rootNavHost()
      //welcomeScreen()
      // myCV()
      // ScoreScreen("10/20")
      // QuestionsScreen(listOf(
      //  Question(1, "What is the capital of France ?", 1, listOf(Answer(1, "Paris"), Answer(2, "London"))),
      //  Question(2, "What is the capital of England ?", 1, listOf(Answer(1, "London"), Answer(2, "Paris"))),
      //  Question(3, "What is the capital of Spain ?", 2, listOf(Answer(1, "Paris"), Answer(2, "Madrid"))),
      //   Question(4, "What is the capital of Italy ?", 1, listOf(Answer(1, "Rome"), Answer(2, "Paris"))),
      // Question(5, "What is the capital of Germany ?", 2, listOf(Answer(1, "Paris"), Answer(2, "Berlin"))),
      // ))

      //val questions = repository.questionState.collectAsState()

      //if(questions.value.isNotEmpty()) {
      //  QuestionsScreen(questions.value)
      //  }
    }
    }
}


expect fun getPlatformName(): String