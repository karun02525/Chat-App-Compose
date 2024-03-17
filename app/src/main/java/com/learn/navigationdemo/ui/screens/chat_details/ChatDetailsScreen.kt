import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.learn.navigationdemo.ui.screens.chat_details.DetailsTopBar

@Composable
fun ChatDetailsScreen() {
   Column(
       modifier = Modifier
           .fillMaxSize()

   ) {

   }

    DetailsTopBar(
        onProfileClick = {

        },
        onVideoClick = {

        },
        onCallClick = {

        },
        onMoreClick = {

        },
        onBackClick = {

        },
    )
}