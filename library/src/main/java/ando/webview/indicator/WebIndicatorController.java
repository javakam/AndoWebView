package ando.webview.indicator;

import android.webkit.WebView;

public class WebIndicatorController {
    private IWebIndicator mIWebIndicator;

    public void progress(WebView v, int newProgress) {
        if (newProgress == 0) {
            reset();
        } else if (newProgress > 0 && newProgress <= 10) {
            showIndicator();
        } else if (newProgress > 10 && newProgress < 95) {
            setProgress(newProgress);
        } else {
            setProgress(newProgress);
            finish();
        }

    }

    public void reset() {
        if (mIWebIndicator != null) {
            mIWebIndicator.reset();
        }
    }

    public void finish() {
        if (mIWebIndicator != null) {
            mIWebIndicator.hide();
        }
    }

    public void setProgress(int n) {
        if (mIWebIndicator != null) {
            mIWebIndicator.setProgress(n);
        }
    }

    public void showIndicator() {
        if (mIWebIndicator != null) {
            mIWebIndicator.show();
        }
    }

    public static WebIndicatorController getInstance() {
        return new WebIndicatorController();
    }

    public WebIndicatorController injectIndicator(IWebIndicator indicator) {
        this.mIWebIndicator = indicator;
        return this;
    }
}