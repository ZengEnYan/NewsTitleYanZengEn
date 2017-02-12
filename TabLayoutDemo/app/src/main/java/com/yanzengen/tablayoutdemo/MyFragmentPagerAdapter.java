package com.yanzengen.tablayoutdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/2/12.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    Context context;
    String[] TITLE;
    List<Fragment> list;
    //构造方法
    public MyFragmentPagerAdapter(FragmentManager fm, Context context, String[] TITLE, List<Fragment> list) {
        super(fm);
        this.context = context;
        this.TITLE=TITLE;
        this.list = list;
    }
    //得到数组的TITLE
    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE[position];
    }
    //获取创建FFRAGMENT
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }
    //fragment的数量
    @Override
    public int getCount() {
        return TITLE.length;
    }
}
