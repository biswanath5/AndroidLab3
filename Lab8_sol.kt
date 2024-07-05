//Arrangements and Alignments for Row
//ROW ARRANGAMENT : START, ALIGNMENT : TOP
setContent {
	NewApplicationTheme {
                Row(modifier = Modifier
                    .fillMaxSize(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.Top
                )
                {
                    Text(text = "Row element 1 ")
                    Text(text = "Row element 2 ")
                    Text(text = "Row element 3 ")
                }
}

//ROW ARRANGAMENT : END, ALIGNMENT : TOP
Row(modifier = Modifier
		    .fillMaxSize(),
        	    horizontalArrangement = Arrangement.End,
        	    verticalAlignment = Alignment.Top
		)	

//ROW ARRANGEMENT : CENTER, ALIGNMENT : TOP
Row(modifier = Modifier
                    .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Top
                )

//ARR: CENTER, AL: BOTTOM
Row(modifier = Modifier
                    .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                )

//ARR: END, AL: BOTTOM
Row(modifier = Modifier
                    .fillMaxSize(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom
                )

//ARR: START, AL: BOTTOM
Row(modifier = Modifier
                    .fillMaxSize(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.Bottom
                )

//ARR: START, AL: CENTER VERT
Row(modifier = Modifier
                    .fillMaxSize(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                )

//ARR: CENTER, AL: CENTER VERT
Row(modifier = Modifier
                    .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                )


//ARR: END, AL: CENTER VERT
Row(modifier = Modifier
                    .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                )

//Arrangements and Alignments for Column
//ARR: TOP, AL: START
setContent {
            NewApplicationTheme {
                Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                )
                {
                    Text(text = "Column element 1 ")
                    Text(text = "Column element 2 ")
                    Text(text = "Column element 3 ")
                }
            }
        }

//ARR: BOTTOM, AL: START
Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start
                )

//ARR: CENTER, AL: START
Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                )

//top X end
Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.End
                )

//bottom x end
Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End
                )

//center x end
Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.End
                )

//bottom x center horizontal
Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                )

//top x center horizontal
Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                )

//center x center horizontal
Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                )





