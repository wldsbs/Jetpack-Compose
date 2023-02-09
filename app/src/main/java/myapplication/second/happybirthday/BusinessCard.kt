package myapplication.second.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import myapplication.second.happybirthday.ui.theme.HappyBirthdayTheme
import java.time.format.TextStyle

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(Modifier.background(Color.DarkGray)) {
        MyProfile("Jennifer Doe", "Android Developer Extraordinaire")
        ContactItem(painterResource(R.drawable.ic_baseline_call_24), "+11(123) 444 555 666")
        ContactItem(painterResource(id = R.drawable.ic_baseline_call_24), "@AndroidDev")
        ContactItem(painterResource(id = R.drawable.ic_baseline_call_24), "jen.doe@android.com")
    }
}

@Composable
fun MyProfile(name: String, role: String) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 180.dp, bottom = 180.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(image, null, modifier = Modifier.size(100.dp))
        Text(
            text = name,
            color = Color.White,
            fontSize = 44.sp
        )
        Text(
            text = role,
            fontWeight = FontWeight.Bold,
            color = Color.Green
        )
    }
}

@Composable
fun ContactItem(icon: Painter, item: String) {
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
            .padding(start = 40.dp, end = 40.dp, top = 10.dp, bottom = 10.dp)
    ) {
        Row {
            Icon(icon, null, tint = Color.Green)
            Text(
                text = item,
                color = Color.White,
                modifier = Modifier.padding(start = 20.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    HappyBirthdayTheme {
        BusinessCardApp()
    }
}