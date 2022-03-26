package pw.bernd.outlink_deflector_for_reddit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Extract the (actual) target URL from the incoming intent
        val targetUrl = intent.data?.getQueryParameter("url")

        // Check for errors
        if (targetUrl == null) {
            Toast.makeText(applicationContext, "Couldn't extract target URL", LENGTH_SHORT).show()
            return
        }

        try {
            // Launch the actual browser
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(targetUrl)))
        } catch (_: Throwable) {
            Toast.makeText(applicationContext, "Couldn't parse: $targetUrl", LENGTH_SHORT).show()
        }

        finish()
    }
}
