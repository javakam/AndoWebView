package ando.webview.indicator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;

/**
 * Title:AbsWebIndicatorView
 * <p>
 * Description:
 * </p>
 * @author javakam
 * @date 2020/8/24 15:43
 */
public abstract class AbsWebIndicatorView extends FrameLayout implements IWebIndicator {
    public AbsWebIndicatorView(Context context) {
        super(context);
    }

    public AbsWebIndicatorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AbsWebIndicatorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void reset() {
    }

    @Override
    public void setProgress(int newProgress) {
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
    }
}