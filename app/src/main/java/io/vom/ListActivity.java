package io.vom;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);

        ListView lv = findViewById(R.id.list);

        List<String> list = new ArrayList<>();
        list.add("ატამი");
        list.add("მსხალი");
        list.add("ვაშლი");
        list.add("გრეიფრუტი");
        list.add("ალუბალი");
        list.add("ბალი");
        list.add("მაყვალი");
        list.add("მარწყვი");
        list.add("ქლიავი");
        list.add("ჭანჭური");
        list.add("ნესვი");
        list.add("საზამთრო");
        list.add("ბანანი");
        list.add("ანანასი");
        list.add("მანდარინი");
        list.add("ფორთოხალი");
        list.add("ლიმონი");
        list.add("მალინა");
        list.add("ყურძენი");

        lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list));
    }
}