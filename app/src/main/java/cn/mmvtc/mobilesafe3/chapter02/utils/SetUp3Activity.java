package cn.mmvtc.mobilesafe3.chapter02.utils;


import android.os.Bundle;
import android.widget.RadioButton;

import cn.mmvtc.mobilesafe3.R;

public class SetUp3Activity extends BaseSetUpActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup3);
        initView();
    }

    private void initView() {
    //设置小圆点的颜色   view是没有setChecked这个值   需要找到所需要的控件强转
        ((RadioButton)findViewById(R.id.rb_third)).setChecked(true);
    }

    @Override
    public void showNext() {
    startActivityAndFinishSelf(SetUp4Activity.class);
    }

    @Override
    public void showPre() {
        startActivityAndFinishSelf(SetUp2Activity.class);
    }
}
