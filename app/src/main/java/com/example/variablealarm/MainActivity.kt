package com.example.variablealarm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.variablealarm.ui.theme.VariableAlarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val people = listOf("John", "Jack", "Luke", "Cave Johnson", "Graggle", "Luke", "Cave Johnson", "Greckle", "Luke", "Cave Johnson", "Greckle", "Luke", "Cave Johnson", "Greckle")

        setContent {
            VariableAlarmTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )

                    LazyColumn {
                        items(people) {
                            // 'it' == iterator for the list. In this case, each iterator is a String
                            ListItem(it)
                        }
                    }//lazy column

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VariableAlarmTheme {
        Greeting("Android")
    }
}

//Creating our list item function
@Composable
fun ListItem(name: String) {
    Card(
        modifier = Modifier.fillMaxSize().padding(12.dp)
    ) {
        Column {
            Row {
                Image(
                    //Refers to the folder 'drawable'. Path is res/drawable/baseline_person_24
                    painter = painterResource(id = R.drawable.baseline_person_24), //'painter' refers to the image name
                    contentDescription = "Photo of person whose name it is",
                    modifier = Modifier.width(100.dp).height(100.dp)
                )
                Text(
                    text = name,
                    modifier = Modifier.padding(24.dp)
                )
            }//row
        }//column
    }//card

}//ListItem function
