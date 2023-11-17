import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import network.Question

@Composable
internal fun ActionButtons(questions: List<Question>, questionProgress: Int, chooseAnswer: Int, score: Int, onNextQuestion: (Int) -> Unit, onScore: (Int) -> Unit) {
  Column(
    modifier = Modifier.fillMaxHeight(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Bottom
  ) {
    Button(
      modifier = Modifier.padding(bottom = 20.dp),
      onClick = {
        if (chooseAnswer == questions[questionProgress].correctAnswerId) {
          onScore(score + 1)
        }
        if (questionProgress < questions.size - 1) {
          onNextQuestion(questionProgress + 1)
        }
      }
    ) {
      if (questionProgress < questions.size - 1) {
        actionButton(Icons.Filled.ArrowForward, "Next")
      } else {
        actionButton(Icons.Filled.Done, "Finish")
      }
    }
    LinearProgressIndicator(
      modifier = Modifier.fillMaxWidth().height(20.dp),
      progress = (questionProgress + 1).toFloat() / questions.size
    )
  }
}


@Composable
internal fun actionButton(iv: ImageVector, label: String) {
  Icon(
    iv,
    contentDescription = "Description",
    Modifier.padding(end = 10.dp)
  )
  Text(label)
}