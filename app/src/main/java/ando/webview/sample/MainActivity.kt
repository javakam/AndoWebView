package ando.webview.sample

import ando.webview.core.CustomWebChromeClient
import ando.webview.core.CustomWebClient
import ando.webview.core.WebViewUtils
import ando.webview.indicator.WebIndicatorController
import ando.webview.indicator.WebIndicatorView
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mWebViewIndicator: WebIndicatorView
    private lateinit var mWebView: WebView
    private val url = "https://fhy.bgy.com.cn/fhyH5/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mWebView = findViewById(R.id.webView)
        mWebViewIndicator = findViewById(R.id.webViewIndicator)
        mWebViewIndicator.setColor(resources.getColor(R.color.color_web_indicator_blue))

        letsGoSimplify()
        //letsGoCustom()
    }

    //返回键处理
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return WebViewUtils.performKeyDown(this, mWebView, keyCode, event)
    }

    override fun onDestroy() {
        super.onDestroy()
        mWebView.clearHistory()
        mWebView.removeAllViews()
    }

    private fun letsGoSimplify() {
        WebViewUtils.initWebView(this, mWebView, mWebViewIndicator)
        mWebView.loadUrl(url)
    }

    private fun letsGoCustom() {
        WebViewUtils.initWebView(this, mWebView)
        mWebView.webViewClient = CustomWebClient(this)

        val controller: WebIndicatorController =
            WebIndicatorController.getInstance().injectIndicator(mWebViewIndicator)
        mWebView.webChromeClient = CustomWebChromeClient(this, controller)

        mWebView.loadUrl(url)
        //mWebView.loadDataWithBaseURL(null, url, "text/html", "utf-8", null)
    }
}