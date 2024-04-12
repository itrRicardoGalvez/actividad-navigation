package ricardo.galvez.actividadri

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class fragment_Codigos : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment__codigos, container, false)

        val btn_Ingresar = root.findViewById<Button>(R.id.btnCodigos)

        btn_Ingresar.setOnClickListener {
            Toast.makeText(context, "Usted va a ser expulsado.", Toast.LENGTH_LONG).show()
        }
        return root
    }

}