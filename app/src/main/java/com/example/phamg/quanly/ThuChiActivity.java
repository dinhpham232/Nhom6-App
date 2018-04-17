package com.example.phamg.quanly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by phamg on 9/17/2017.
 */

public class ThuChiActivity extends Activity {

    Button chiTiet;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thu_chi);

        controls();

        chiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ThuChiActivity.this, ChiTietThuChiActivity.class);
                startActivity(myIntent);
            }
        });
    }

    public void controls(){
        chiTiet = (Button) findViewById(R.id.btn_chitiet);
    }
}
