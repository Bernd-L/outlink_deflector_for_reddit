package pw.bernd.outlink_deflector_for_reddit

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity


const val TAG = "deflector_dbg";

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val data = intent.data
        val urlString = data.toString()
        Log.e(TAG, urlString)


        Toast.makeText(applicationContext, "Got whole URL: $urlString", LENGTH_SHORT).show()
//        exitProcess(0)
    }
}
