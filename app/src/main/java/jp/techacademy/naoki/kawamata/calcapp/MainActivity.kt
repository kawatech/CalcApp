package jp.techacademy.naoki.kawamata.calcapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", editText1.text.toString())
                startActivity(intent)
            }
         //   R.id.button2 -> showAlertDialog()
         //   R.id.button3 -> showTimePickerDialog()
         //   R.id.button4 -> showDatePickerDialog()
        }
    }
}
