package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun GradesScreen(innerPadding : PaddingValues, navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)) {

        // Información del alumno
        Text("Nombre: Juan Frausto")
        Text("Carrera: Ingeniería en Sistemas")
        Text("Semestre: 5to")
        Text("Promedio acumulado: 9.5")

        // Encabezados de tabla
        Row(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Materia",
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "Promedio",
                modifier = Modifier.weight(1f)
            )
        }

        // Lista de materias y promedios
        val materias = listOf("Matemáticas" to 9.0, "Programación" to 9.5, "Redes" to 8.8)
        LazyColumn {
            items(materias) { materia ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { navController.navigate("detalle_materia/${materia.first}") }
                        .padding(16.dp)
                ) {
                    Text(
                        text = materia.first,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = materia.second.toString(),
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}
