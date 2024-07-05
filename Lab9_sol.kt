//SIMPLE BUTTON
setContent {
            NewApplicationTheme {
                Button(onClick = {}) {
                    Text(text = "Simple Button")
                }
            }
        }

//FILLED TONAL BUTTON
setContent {
            NewApplicationTheme {
                FilledTonalButton(onClick = {}) {
                    Text(text = "Filled Tonal Button")
                }
            }
        }

//OUTLINED BUTTON
setContent {
            NewApplicationTheme {
                OutlinedButton(onClick = {}) {
                    Text(text = "Outlined Button")
                }
            }
        }

//ELEVATED BUTTON
setContent {
            NewApplicationTheme {
                ElevatedButton(onClick = {}) {
                    Text(text = "Elevated Button")
                }
            }
        }

//COLORED BUTTON
setContent {
            NewApplicationTheme {
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor  = Color.Red)
                ) {
                    Text(text = "Add to Cart")
                }
            }
        }

//CARD
setContent {
            NewApplicationTheme {
                Row (
                    modifier = Modifier
                        .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                ){
                    Card(onClick = {},
                        modifier = Modifier
                            .size(width = 300.dp, height = 100.dp)) {
                        Text(text = "Card Created",
                            Modifier.padding(30.dp),
                            textAlign = TextAlign.Center)
                    }

                }
            }
        }

//ASSIST CHIP
setContent {
            NewApplicationTheme {
                Row (
                    modifier = Modifier
                        .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                ){
                    AssistChip(onClick = {}, label = { Text(text = "Assist Chip")})
                }
            }
        }

//SUGGESTION CHIP
setContent {
            NewApplicationTheme {
                Row (
                    modifier = Modifier
                        .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                ){
                    SuggestionChip(onClick = {}, label = { Text(
                        text = "Suggestion Chip"
                    )})
                }
            }

//SLIDER
setContent {
            var value by remember { mutableFloatStateOf(0f) }
            NewApplicationTheme {
                Row (
                    modifier = Modifier
                        .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                ){
                    Slider(value = value, onValueChange = {
                        value=it
                    })
                    Text(text = value.toString())
                }

            }

//SWITCH
setContent {
            var checked by remember { mutableStateOf(true) }
            NewApplicationTheme {
                Row (
                    modifier = Modifier
                        .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                ){
                    Switch(checked = checked,
                        onCheckedChange ={
                            checked = it
                        } )
                }
            }
        }

//VERTICAL DIVIDER
setContent {
            NewApplicationTheme {
                @Composable
                fun VerticalDivider() {
                    Row (
                        modifier = Modifier
                            .height(IntrinsicSize.Min),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                    ){
                        Text("Left of divider ")
                        VerticalDivider(color = Color.Red)
                        Text(" Right of divider")
                    }
                }
                VerticalDivider()
            }
        }

//HORIZONTAL DIVIDER
setContent {
            NewApplicationTheme {
                @Composable
                fun HorizontalD() {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Text("Above divider")
                        HorizontalDivider(thickness = 16.dp)
                        Text("Below divider")
                    }
                }
                HorizontalD()
            }
        }
