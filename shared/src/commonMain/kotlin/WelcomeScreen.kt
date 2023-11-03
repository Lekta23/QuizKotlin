import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable()
internal fun welcomeScreen(){
 // Create a Card rounded shape container
  //
  //a Text
  //
  //a Button

  Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
    Card (modifier = Modifier.fillMaxWidth(), backgroundColor = Color.Blue){
      Column {
        Text(text = "Welcome to the app!", color = Color.White)
        Button(onClick = { /*TODO*/ }) {
          Text(text = "Click me!")
        }
      }
    }
  }
}