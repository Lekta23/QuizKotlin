import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.Question

@Composable
internal fun QuestionCard(question: Question) {
  Card(
    shape = RoundedCornerShape(5.dp),
    modifier = Modifier.padding(60.dp)
  ) {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier.padding(horizontal = 10.dp)
    ) {
      Text(
        modifier = Modifier.padding(all = 10.dp),
        text = question.label,
        fontSize = 25.sp,
        textAlign = TextAlign.Center
      )
    }
  }
}