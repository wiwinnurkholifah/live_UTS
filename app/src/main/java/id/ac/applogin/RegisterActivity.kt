package id.ac.applogin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() , View.OnClickListener {
    private  lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnIntent = findViewById(R.id.backregist)
        btnIntent.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.backregist -> run {
                val intenBiasa = Intent(this@RegisterActivity, MainActivity::class.java)
                startActivity(intenBiasa)
            }
        }
    }
}