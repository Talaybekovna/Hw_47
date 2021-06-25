package kg.tutorialapp.hw_47

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Сообщение: " +
                intent.getStringExtra("kg.tutorialapp.hw_47.broadcast.Message"), Toast.LENGTH_LONG).show()
    }
}