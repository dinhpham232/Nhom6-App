package com.example.phamg.quanly;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by phamg on 9/19/2017.
 */

public class AdapterRoom extends BaseAdapter {
    Activity context;
    ArrayList<Room> list;

    public AdapterRoom(Activity context, ArrayList<Room> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layout.inflate(R.layout.row_list_room, null);
        TextView txtId = (TextView) row.findViewById(R.id.room_id);
        TextView txtStatus = (TextView) row.findViewById(R.id.room_status);

        Room n = list.get(position);
        txtId.setText(n.getId());
        txtStatus.setText(n.getStatus());
        return row;
    }
}
