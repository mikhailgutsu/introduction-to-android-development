class MainViewModel : ViewModel() {
    private val _counter = MutableLiveData<Int>(0)
    val counter: LiveData<Int> = _counter

    fun incrementCounter() {
        _counter.value = (_counter.value ?: 0) + 1
    }
}
