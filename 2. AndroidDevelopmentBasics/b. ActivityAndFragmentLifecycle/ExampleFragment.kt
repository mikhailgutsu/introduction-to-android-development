class ExampleFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Lifecycle", "onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Lifecycle", "onCreateView called")
        return inflater.inflate(R.layout.fragment_example, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Lifecycle", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Lifecycle", "onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Lifecycle", "onDetach called")
    }
}
