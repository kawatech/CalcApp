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
                val x1 = editText1.text.toString().length
                val x2 = editText2.text.toString().length

                if ((x1 >= 1) && (x2 >= 1)){
                    var v1 = editText1.text.toString().toFloat()
                    var v2 = editText2.text.toString().toFloat()
                    var v3 = v1 + v2
                    intent.putExtra("VALUE1", v3)
                    startActivity(intent)
                }
                else {
                    textView.text = "数値が入力されていません"

                }





            }
            R.id.button2 -> {
                val intent = Intent(this, SecondActivity::class.java)
                val x1 = editText1.text.toString().length
                val x2 = editText2.text.toString().length

                if ((x1 >= 1) && (x2 >= 1)){
                    var v1 = editText1.text.toString().toFloat()
                    var v2 = editText2.text.toString().toFloat()
                    var v3 = v1 - v2
                    intent.putExtra("VALUE1", v3)
                    startActivity(intent)
                }
                else {
                    textView.text = "数値が入力されていません"

                }
            }
            R.id.button3 -> {
                val intent = Intent(this, SecondActivity::class.java)
                val x1 = editText1.text.toString().length
                val x2 = editText2.text.toString().length

                if ((x1 >= 1) && (x2 >= 1)){
                    var v1 = editText1.text.toString().toFloat()
                    var v2 = editText2.text.toString().toFloat()
                    var v3 = v1 * v2
                    intent.putExtra("VALUE1", v3)
                    startActivity(intent)
                }
                else {
                    textView.text = "数値が入力されていません"

                }
            }
            R.id.button4 -> {
                val intent = Intent(this, SecondActivity::class.java)
                val x1 = editText1.text.toString().length
                val x2 = editText2.text.toString().length

                if ((x1 >= 1) && (x2 >= 1)){
                    var v1 = editText1.text.toString().toFloat()
                    var v2 = editText2.text.toString().toFloat()
                    var v3 = v1 / v2
                    intent.putExtra("VALUE1", v3)
                    startActivity(intent)
                }
                else {
                    textView.text = "数値が入力されていません"

                }
            }

        }
    }
}
