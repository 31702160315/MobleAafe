package cn.mmvtc.mobilesafe3.chapter02.utils;


import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import cn.mmvtc.mobilesafe3.R;

public class SetUp4Activity extends BaseSetUpActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup4);
        initView();
    }

    private void initView() {
    //设置小圆点的颜色   view是没有setChecked这个值   需要找到所需要的控件强转
        ((RadioButton)findViewById(R.id.rb_four)).setChecked(true);
    }

    @Override
    public void showNext() {
        Toast.makeText(this, "当前页面已经是最后一页", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showPre() {
        startActivityAndFinishSelf(SetUp3Activity.class);
    }
}
