package kg.tutorialapp.hw_47

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    companion object{
        const val MESSAGE = "BroadcastReceiver"
        const val ACTION = "kg.tutorialapp.hw_47"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn)
        button.setOnClickListener {
            val intent = Intent()
            intent.setAction(ACTION)
            intent.putExtra("kg.tutorialapp.hw_47.broadcast.Message", MESSAGE)
            intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
            sendBroadcast(intent)
        }
    }
}