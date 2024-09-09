package com.example.imepac

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imepac.ui.theme.ImepacTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImepacTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        // Ícone para a imagem do usuário
        Image(
            painter = painterResource(id = R.drawable.logo), // Substitua 'logo' pelo nome do ícone ou imagem
            contentDescription = "User Image",
            modifier = Modifier
                .size(100.dp)  // Define o tamanho do ícone
                .clip(CircleShape)  // Define o formato circular
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nome do usuário
        Text(
            text = "Marcos Paulo"
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Campo de email do usuário
        Text(
            text = "Email: marcos.paulo@example.com"
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Campo de telefone do usuário
        Text(
            text = "Telefone: (11) 98765-4321"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ImepacTheme {
        ProfileScreen()
    }
}
