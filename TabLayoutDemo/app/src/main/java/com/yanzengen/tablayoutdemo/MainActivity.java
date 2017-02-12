package com.yanzengen.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] TITLE ={"推荐", "热点", "阳光宽带", "北京", "社会", "娱乐", "问答", "图片", "科技", "汽车", "体育", "财经", "军事", "国际", "段子", "趣图", "美女", "健康", "正能量", "特卖", "房产"};
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<Fragment> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        viewPager= (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout_Title);
        //初始化数据
        initData();
        //实例化适配器
        MyFragmentPagerAdapter pagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),this,TITLE,list);

        viewPager.setAdapter(pagerAdapter);
        //tabLayout绑定ViewPager标题栏
        tabLayout.setupWithViewPager(viewPager);
        //设置tabLayout的显示模式
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    private void initData() {
        list = new ArrayList<>();
        for (int i = 0;i<TITLE.length;i++){
            TitleFragment fragment = new TitleFragment();
            list.add(fragment);
        }
    }
}
