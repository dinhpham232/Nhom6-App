package com.example.phamg.quanly;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * Created by phamg on 9/17/2017.
 */

public class MainActivity extends AppCompatActivity {

    //TabHost.TabSpec thuChi, hoatDong, nhanVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*public void controls(){
        TabHost tabHost = getTabHost();

        thuChi = tabHost.newTabSpec("Tag1");
        thuChi.setIndicator("Quản lý thu chi");
        Intent photosIntent = new Intent(this, ThuChiActivity.class);
        thuChi.setContent(photosIntent);

        hoatDong = tabHost.newTabSpec("Tag2");
        hoatDong.setIndicator("Hoạt động khách sạn");
        Intent songsIntent = new Intent(this, HoatDongActivity.class);
        hoatDong.setContent(songsIntent);

        nhanVien = tabHost.newTabSpec("Tag3");
        nhanVien.setIndicator("Quản lý nhân viên");
        Intent videosIntent = new Intent(this, NhanVienActivity.class);
        nhanVien.setContent(videosIntent);

        tabHost.addTab(thuChi);
        tabHost.addTab(hoatDong);
        tabHost.addTab(nhanVien);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#d1a17c"));
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#bc977c"));
        tabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#c3a894"));

        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
    }*/
}
