import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.Answer
import network.Question

@Composable
internal fun QuestionsScreen(questions: List<Question>) {
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
    ActionButtons(questions, questionProgress, chooseAnswer, score, { questionProgress = it }, { score = it })
  }
}
