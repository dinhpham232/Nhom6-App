package com.example.phamg.quanly;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by phamg on 9/17/2017.
 */

public class HoatDongActivity extends Activity {

    String urlGetRoom = "http://192.168.0.104/data/getdata.php";
    ListView lv;
    ArrayList<Room> listRoom;
    AdapterRoom adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hoat_dong);

        controls();
        getData(urlGetRoom);
    }

    public void controls(){
        lv = (ListView) findViewById(R.id.list_view);
        listRoom = new ArrayList<>();
        adapter = new AdapterRoom(this, listRoom);
        lv.setAdapter(adapter);
    }

    public void getData(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>(){
                    @Override
                    public void onResponse(JSONArray response){
                        for (int i = 0; i < response.length(); i++){
                            try {
                                JSONObject obj = response.getJSONObject(i);
                                Room n = new Room();
                                n.setId(obj.getString("Id"));
                                n.setPrice(obj.getDouble("Price"));
                                n.setType(obj.getString("Type"));
                                n.setStatus(obj.getString("Status"));
                                listRoom.add(n);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter.notifyDataSetChanged();
                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                        Toast.makeText(HoatDongActivity.this, "Lỗi", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);
    }
}
