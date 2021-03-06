package interop.observable

fun main() {
    println("Creating ObservableInterop")
    val observableInterop = ObservableInterop()
    observableInterop.getStream().subscribe(::println, ::println)

    Thread.sleep(2000) // Sleep main thread to allow coroutine to complete
}