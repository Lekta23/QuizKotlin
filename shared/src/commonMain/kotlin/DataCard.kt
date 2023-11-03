import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
  data class items(val title : String, val data : List<String>)
  @Composable
  fun DataCard (items : items){
      Text(text = items.title , modifier = Modifier.padding(4.dp), style = MaterialTheme.typography.h6)
      LazyColumn(Modifier.padding(4.dp)) {
        items(items.data) { text ->
          Text(text = "• $text", modifier = Modifier.padding(4.dp))
        }
      }
  }