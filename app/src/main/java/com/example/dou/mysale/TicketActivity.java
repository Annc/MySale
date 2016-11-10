package com.example.dou.mysale;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dou on 2016/4/27.
 */
public class TicketActivity extends ListActivity {
    private List listItem;
    private ArrayAdapter<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listItem = new ArrayList<String>();

        listItem.add("我是抵用券");
        listItem.add("我是抵用券");
        listItem.add("我是抵用券");
        listItem.add("我是抵用券");
        listItem.add("我是抵用券");
        listItem.add("我是抵用券");

        //建立adapter,并且绑定数据源
        list = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, listItem);
        //绑定UI
        setListAdapter(list);
    }
}
