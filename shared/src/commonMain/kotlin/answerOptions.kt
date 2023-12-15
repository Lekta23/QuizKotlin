import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import network.data.Answer

@Composable
internal fun AnswerOptions(answers: List<Answer>, chooseAnswer: Int, onAnswerSelected: (Int) -> Unit) {
  Column(modifier = Modifier.selectableGroup()) {
    answers.forEach { answer ->
      Row(
        modifier = Modifier.padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
      ) {
        RadioButton(
          modifier = Modifier.padding(end = 16.dp),
          selected = chooseAnswer == answer.id,
          onClick = { onAnswerSelected(answer.id) }
        )
        Text(text = answer.label)
      }
    }
  }
}