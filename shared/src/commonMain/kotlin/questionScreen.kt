import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import moe.tlaster.precompose.navigation.Navigator

@Composable
internal fun QuestionsScreen(navigator: Navigator, questions: List<Question>) {
  var questionProgress by remember { mutableStateOf(0) }
  var chooseAnswer by remember { mutableStateOf(1) }
  var score by remember { mutableStateOf(0) }

  Column(
    modifier = Modifier.fillMaxSize().background(color = Color.DarkGray),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    QuestionCard(questions[questionProgress])
    AnswerOptions(questions[questionProgress].answers, chooseAnswer) { chooseAnswer = it }
    Text(
      modifier = Modifier.padding(top = 20.dp),
      text = "Score: $score",
      fontSize = 25.sp,
      textAlign = TextAlign.Center
    )
    ActionButtons(navigator, questions, questionProgress, chooseAnswer, score, { questionProgress = it }, { score = it })
  }
}
