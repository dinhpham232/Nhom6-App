package com.example.phamg.quanly;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * Created by phamg on 9/18/2017.
 */

public class ChiTietThuChiActivity extends TabActivity {

    TabHost.TabSpec hoanTat, chuaHoanTat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_host);

        controls();

    }

    public void controls(){
        TabHost tabHost = getTabHost();

        hoanTat = tabHost.newTabSpec("Tag1");
        hoanTat.setIndicator("Đã hoàn tất");
        Intent hoanTatIntent = new Intent(this, ThuChiHoanTatActivity.class);
        hoanTat.setContent(hoanTatIntent);

        chuaHoanTat = tabHost.newTabSpec("Tag2");
        chuaHoanTat.setIndicator("Chưa hoàn tất");
        Intent chuaHoanTatIntent = new Intent(this, ThuChiChuaHoanTatActivity.class);
        chuaHoanTat.setContent(chuaHoanTatIntent);

        tabHost.addTab(hoanTat);
        tabHost.addTab(chuaHoanTat);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#d1a17c"));
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#bc977c"));

        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
    }
}
