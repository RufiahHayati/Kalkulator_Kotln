package comw.example.rplrus26.kalkulator_kotln

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import comw.example.rplrus26.kalkulator_kotln.R.id.text
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTambah.setOnClickListener {
            var a: String = number1.text.toString()
            var b: String = number2.text.toString()

            if(number1.text.isEmpty() && number2.text.isEmpty()){
                Toast.makeText(applicationContext,"silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                var c = a.toInt()
                var d = b.toInt()
                var e = c + d
                text_hasil.setText(e.toString())
            }
        }

        fun tambah(a: Int, b: Int): Int {
            return a + b
        }

        numberKurang.setOnClickListener {
            var a: String = number1.text.toString()
            var b: String = number2.text.toString()

            if(number1.text.isEmpty() && number2.text.isEmpty()){
                Toast.makeText(applicationContext,"silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                var c = a.toInt()
                var d = b.toInt()
                var e = c - d
                text_hasil.setText(e.toString())
            }
        }

        fun kurang(a: Int, b: Int): Int {
            return a - b
        }

        numberKali.setOnClickListener {
            var a: String = number1.text.toString()
            var b: String = number2.text.toString()

            if(number1.text.isEmpty() && number2.text.isEmpty()){
                Toast.makeText(applicationContext,"silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                var c = a.toInt()
                var d = b.toInt()
                var e = c * d
                text_hasil.setText(e.toString())
            }
        }

        fun kali(a: Int, b: Int): Int {
            return a * b
        }

        numberBagi.setOnClickListener {
            var a: String = number1.text.toString()
            var b: String = number2.text.toString()

            if(number1.text.isEmpty() && number2.text.isEmpty()){
                Toast.makeText(applicationContext,"silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                var c = a.toInt()
                var d = b.toInt()
                var e = c / d
                text_hasil.setText(e.toString())
            }
        }

        fun bagi(a: Int, b: Int): Int {
            return a / b
        }

        btnHasil.setOnClickListener {
            text_hasil.setText(" ")
        }
    }
}
