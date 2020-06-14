package lvov.zero.and.convertor

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertButtonClicked(view: View){

        val currencyInput: EditText = findViewById(R.id.currencyInput)
        val currencyValue = DecimalFormat("#.##").format(currencyInput.text.toString().toDouble()).toDouble()
        Toast.makeText(this,"$currencyValue rubl' = ${"%.2f".format(currencyValue * 74)} dollars",Toast.LENGTH_LONG).show()

    }
}