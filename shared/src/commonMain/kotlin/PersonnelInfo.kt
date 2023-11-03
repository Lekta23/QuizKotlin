
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class personnalData(val data : List<String>)

@Composable
fun PersonnalInfo (personnalData : personnalData){
  LazyColumn {
    items(personnalData.data) { text ->
      Text(text = text, modifier = Modifier.padding(4.dp))
    }
  }
}