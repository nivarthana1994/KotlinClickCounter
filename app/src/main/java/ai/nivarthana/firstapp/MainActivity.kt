package ai.nivarthana.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.ClickBtn)
        val text1 = findViewById<TextView>(R.id.textView1)
        var timesClicked = 0
        btn1.setOnClickListener {

            timesClicked += 1

            text1.text = timesClicked.toString()

            Toast.makeText(this, "Clicked toast", Toast.LENGTH_SHORT).show()
        }
    }
}