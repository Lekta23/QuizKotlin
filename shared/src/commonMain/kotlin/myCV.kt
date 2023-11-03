import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
@Composable
fun myCV() {
  Box(modifier = Modifier.fillMaxSize()) {
    Row(
      modifier = Modifier.fillMaxSize(),
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      // Colonne de gauche (20% de largeur)
      Column(
        modifier = Modifier
          .fillMaxHeight()
          .fillMaxWidth(0.3f).background(color = androidx.compose.ui.graphics.Color.Gray)
      ) {
        Image(painter = imageResources("photo.jpg"), contentDescription = "Ouais")
        PersonnalInfo(personnalData = personnalite)
      }

      Column(
        modifier = Modifier
          .fillMaxHeight()
          .fillMaxWidth(0.8f) // 80% de la largeur
      ) {
        DataCard(items = formations)
        Spacer(modifier = Modifier.height(16.dp)) // Espace entre les listes

        DataCard(items = competences)
        Spacer(modifier = Modifier.height(16.dp)) // Espace entre les listes

        DataCard(items = experiences)
        }
      }
    }
  }


val experiences = items(
  title = "Expériences",
  data = listOf(
    "EDUKEASY - SEPTEMBRE 2021 - FEVRIER 2022",
    "INFOTEL - MAI 2022 - Aujourd'hui",
  )
)

val competences = items(
  title = "Compétences",
  data = listOf(
    "JAVA / Spring",
    "Angular / React",
    "Flutter"
  )
)

val formations = items(
  title = "Formations",
  data = listOf(
    "2015-2018 : Bac PRO SEN",
    "2018-2020 : BTS SIO",
    "2021-2022 : Licence Pro DIM",
    "2022-2024 : Mastere Expert en ingerierie informatique"
  )
)

val personnalite = personnalData(
  data = listOf(
    "Nom : BOIDIN",
    "Prénom : Mathieu",
    "Date de naissance : 02/07/2000",
    "Adresse : 27 rue de fives",
    "Téléphone : 0600000000",
    "Email : myMail@gmail.com"
  )
)