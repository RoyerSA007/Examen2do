package com.example.a511lasalleapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.a511lasalleapp.utils.Screens

data class BottomNavigationItem(
    val title : String,
    val icon : ImageVector,
    val route : String
){
    companion object{
        val items = listOf(
            BottomNavigationItem(
                title = "Inicio",
                icon = Icons.Default.Home,
                route = Screens.Home.route
            ),
            BottomNavigationItem(
                title = "Calificaciones",
                icon = Icons.Default.Menu,
                route = Screens.Grades.route
            ),

            BottomNavigationItem(
                title = "Calendario",
                icon = Icons.Default.DateRange,
                route = Screens.Calendar.route
            ),

            BottomNavigationItem(
                title = "Configuracion",
                icon = Icons.Default.Settings,
                route = Screens.Settings.route
            )
        )
    }
}

