//SIMPLE TEXT
setContent {
	NewApplicationTheme {
                Text(text = "Simple text")
        }
}

//COLORED TEXT
setContent {
	NewApplicationTheme {
                Text(text = "Colored text", color = Color.Red)
        }
}

//FONT SIZE
setContent {
	NewApplicationTheme {
                Text(text = "Colored text of size 30", color = Color.Red, fontSize = 30.sp)
        }
}

//ITALICISE
setContent {
	NewApplicationTheme {
                Text(text = "Italicise", fontStyle = FontStyle.Italic)
        }
}

//EMBOLDEN
setContent 
{
	NewApplicationTheme {
        	Text(text = "Embolden", fontWeight = FontWeight.Bold)
        }
}

//SHADOW
setContent {
	NewApplicationTheme {
        	Text(text = "Shadow",
                style = TextStyle(
                	fontSize = 47.sp,
               		shadow = Shadow(
                        color = Color.Cyan,offset = Offset(16.0f,16.0f) , blurRadius = 4.0f)
                	)
                )
	}
}

//MULTIPLE STYLES
setContent {
	NewApplicationTheme {
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.Green, fontWeight = FontWeight.Bold)){
                            append("M")
                    	}
                        append("ultiple ")

                        withStyle(style = SpanStyle(color = Color.Magenta, fontWeight = FontWeight.Bold)){
                            append("S")
                        }
                        append("tyles")
                    }
                )
        }
}

//STYLING USING BRUSH
setContent {
	NewApplicationTheme {
                Text(
                    text = "Sunrisers Hyderabad",
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Red, Color.Yellow, Color.Black)
                        )
                    )
                )
        }
}

//ADVANCED STYLING
setContent {
	NewApplicationTheme {
                Text(
                    text = buildAnnotatedString {
                        append("Abhishek Sharma\n")
                        append("Nitish Reddy\n")
                        withStyle(
                            SpanStyle(
                                fontWeight = FontWeight.Bold,
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Red, Color.Yellow, Color.Black)
                                )
                            )
                        ){
                            append("Pat Cummins\n")
                        }
                        append("Heinrich Klaasen\n")
                        append("Bhuvneshwar Kumar\n")
                    }
                )
        }
}
