package base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        findView();
        setView();
        setListener();
    }
    protected abstract @LayoutRes
    int getLayoutId();
    protected abstract void findView();
    protected abstract void setView();
    protected abstract void setListener();



}
