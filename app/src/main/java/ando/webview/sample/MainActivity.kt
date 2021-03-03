package ando.webview.sample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fun0(view: View?) {
        startActivity(Intent(this, WebViewUsageActivity::class.java))
    }

    fun fun1(view: View?) {
        startActivity(Intent(this, WebViewVideoActivity::class.java))
    }

    fun fun2(view: View?) {
        startActivity(Intent(this, WebViewCoordinatorActivity::class.java))
    }
}