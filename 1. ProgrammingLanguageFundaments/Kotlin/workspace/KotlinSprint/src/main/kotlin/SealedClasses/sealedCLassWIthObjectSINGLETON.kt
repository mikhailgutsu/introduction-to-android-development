package SealedClasses

//  You can use object to create singleton instances inside a sealed class.
sealed class NetworkState {
    object Loading : NetworkState()
    object Success : NetworkState()
    object Error : NetworkState()
}

fun checkState(state: NetworkState) {
    when (state) {
        NetworkState.Loading -> println("Loading data...")
        NetworkState.Success -> println("Data loaded successfully!")
        NetworkState.Error -> println("An error occurred!")
    }
}

fun main() {
    checkState(NetworkState.Loading)  // Output: Loading data...
}

//  Why use object?
//      Prevents multiple instances (saves memory).
//      Useful for states or events.