package android.com.fajar.ardi.anto.projectuts


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_masuk.*
import kotlinx.android.synthetic.main.fragment_utama.*

/**
 * A simple [Fragment] subclass.
 */
class masuk : Fragment() {

    lateinit var nav : NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_masuk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)
        button2.setOnClickListener {
            if (editText.text.toString().isNotEmpty()) {
                val input = editText.text.toString()
                val bundle = Bundle()
                bundle.putString("args", input)

                nav.navigate(R.id.action_masuk_to_hasil, bundle)
            }
        }
    }
}