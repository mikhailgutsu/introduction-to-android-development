class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        // Observe LiveData changes
        viewModel.counter.observe(this, Observer { value ->
            textView.text = value.toString()
        })

        button.setOnClickListener {
            viewModel.incrementCounter()
        }
    }
}

//  📌 LiveData automatically updates the UI when counter changes.