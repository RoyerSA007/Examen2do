package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items


@Composable
fun DetalleMateriaScreen(materiaId: String?) {
    // Simulamos los datos de los parciales de la materia
    val calcificationParticiples = listOf(9.0, 9.5, 8.7)

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        // Información del alumno
        Text("Nombre: Juan Frausto")
        Text("Carrera: Ingeniería en Sistemas")
        Text("Semestre: 5to")
        Text("Materia: $materiaId")

        Spacer(modifier = Modifier.height(16.dp))

        // Información de calificaciones
        Text("Promedio acumulado: 9.5")

        Spacer(modifier = Modifier.height(16.dp))

        // Encabezados de tabla de parciales
        Row(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Parcial",
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "Calificación",
                modifier = Modifier.weight(1f)
            )
        }

        // Calificaciones de los parciales
        LazyColumn {
            items(calcificationParticiples.toList()) { index ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Parcial ${index + 1}",
                        modifier = Modifier.weight(1f),
                    )
                    Text(
                        text = calcificationParticiples[index.toInt()].toString(),
                        modifier = Modifier.weight(1f),
                    )
                }
            }
        }
    }
}
