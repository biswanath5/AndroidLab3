@Composable
    fun CounterView(counterVM: CounterViewModel = viewModel()){
        val counterState = counterVM.counter.value
        Column{
            Text(text = "Current counter value: ${counterState.count}")
            Row {
                FilledTonalButton(onClick = { counterVM.incrementCounter() }) {
                    Text(text = "Increment Value")
                }
                Spacer(modifier = Modifier.width(20.dp))
                FilledTonalButton(onClick = { counterVM.decrementCounter() }) {
                    Text(text = "Decrement Value")
                }
            }
            FilledTonalButton(onClick = {counterVM.resetCounter()}) {
                Text(text = "Reset Value")
            }
        }
    }

//Model class
data class Counter(val count: Int)
data class User(val Username: String,val Pass: String)

//ViewModel Class
class CounterViewModel : ViewModel() {
    private var _counter = mutableStateOf(Counter(0))
    val counter: State<Counter> = _counter

    fun incrementCounter(){
        _counter.value=Counter(_counter.value.count+1)
    }
    fun decrementCounter(){
        _counter.value=Counter(_counter.value.count-1)
    }
    fun resetCounter(){
        _counter.value=Counter(0)
    }
}
