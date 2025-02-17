class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        // Collect StateFlow using lifecycleScope
        lifecycleScope.launch {
            viewModel.counter.collect { value ->
                textView.text = value.toString()
            }
        }

        button.setOnClickListener {
            viewModel.incrementCounter()
        }
    }
}
//  📌 StateFlow is a better alternative to LiveData for UI state management! 🚀