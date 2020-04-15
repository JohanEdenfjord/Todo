package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;
    String[] listItem;
    String[] subItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.simpleListView);
        listItem = getResources().getStringArray(R.array.array_of_Stuff);
        subItem = getResources().getStringArray(R.array.array_of_Stuff_second_coming);

        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        for(int i=0; i<listItem.length; i++){
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("name", listItem[i]);
            hashMap.put("Description",subItem[i]);
            arrayList.add(hashMap);
        }

        String[] from={"name","Description"};
        int[] to = {R.id.textView, R.id.textView2};
        SimpleAdapter adapter = new SimpleAdapter( this, arrayList, R.layout.activity_listview,from,to);
        listView.setAdapter(adapter);


    //    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    //        @Override
     //       public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
       //         // TODO Auto-generated method stub
        //        String value=adapter.getItem(position);
          //      Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
//       }


 //       });

    }
}
