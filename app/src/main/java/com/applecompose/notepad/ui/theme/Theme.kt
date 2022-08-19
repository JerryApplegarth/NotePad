package com.applecompose.notepad.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
	primary = DarkPrimary,
	primaryVariant = DarkPrimaryVariant,
	secondary = DarkSecondary,
	onPrimary = DarkOnPrimary,
	onSecondary = DarkOnSecondary,
	onSurface = DarkOnSurface,
)

private val LightColorPalette = lightColors(
	primary = Primary,
	primaryVariant = PrimaryVariant,
	secondary = Secondary,
	onSurface = OnSurface,



	/* Other default colors to override
    background = Color.White,
    surface = Color.White,


    */
)


	/* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */




@Composable
fun NotePadTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
	val colors = if (darkTheme) {
		DarkColorPalette
	} else {
		LightColorPalette
	}

	MaterialTheme(
		colors = colors,
		typography = Typography,
		shapes = Shapes,
		content = content
	)
}