import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import moe.tlaster.precompose.navigation.Navigator

@Composable()
internal fun ScoreScreen(navigator: Navigator, score: String){
  Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = Color.DarkGray)
  ) {
    Card(
      shape = RoundedCornerShape(8.dp),
      modifier = Modifier.padding(10.dp),
      backgroundColor = Color.Green
    ) {
      Column(horizontalAlignment = Alignment.CenterHorizontally) {


        Column(horizontalAlignment = Alignment.CenterHorizontally) {
          Text(
            text = "Score",
            fontSize = 15.sp,
          )
          Text(
            modifier = Modifier.padding(all = 10.dp),
            text = "$score",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
          )
          Button(
            modifier = Modifier.padding(all = 20.dp),
            onClick = {
              navigator.navigate(route = "/quiz")
            }
          ) {
            Icon(Icons.Filled.Refresh, contentDescription = "Localized description")
            Text(text = "Retake the Quizz",)
          }
        }
      }
    }
  }
}