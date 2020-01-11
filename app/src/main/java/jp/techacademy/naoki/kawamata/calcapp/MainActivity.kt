package jp.techacademy.naoki.kawamata.calcapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.support.design.widget.Snackbar

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
                val v1 = editText1.text.toString().toFloat()
                val v2 = editText2.text.toString().toFloat()
                if (v1 == null) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }
                val v3 = v1 + v2
                intent.putExtra("VALUE1", v3)
                startActivity(intent)
            }
            R.id.button2 -> {
                val intent = Intent(this, SecondActivity::class.java)
                val v1 = editText1.text.toString().toFloat()
                val v2 = editText2.text.toString().toFloat()
                val v3 = v1 - v2
                intent.putExtra("VALUE1", v3)
                startActivity(intent)
            }
            R.id.button3 -> {
                val intent = Intent(this, SecondActivity::class.java)
                val v1 = editText1.text.toString().toFloat()
                val v2 = editText2.text.toString().toFloat()
                val v3 = v1 * v2
                intent.putExtra("VALUE1", v3)
                startActivity(intent)
            }
            R.id.button4 -> {
                val intent = Intent(this, SecondActivity::class.java)
                val v1 = editText1.text.toString().toFloat()
                val v2 = editText2.text.toString().toFloat()
                val v3 = v1 / v2
                intent.putExtra("VALUE1", v3)
                startActivity(intent)
            }
        }
    }
}
