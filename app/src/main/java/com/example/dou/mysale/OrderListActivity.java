package com.example.dou.mysale;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by Dou on 2016/4/27.
 */
public class OrderListActivity extends ListActivity {
    private ArrayList orders;
    private OrderAdapter orderList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        orders = new ArrayList<Order>();
        orders.add(new Order("金币100个", "2016/4/27 21:25:30"));
        orders.add(new Order("金币100个", "2016/4/27 21:25:30"));
        orders.add(new Order("金币100个", "2016/4/27 21:25:30"));
        orders.add(new Order("金币100个", "2016/4/27 21:25:30"));
        orders.add(new Order("金币100个", "2016/4/27 21:25:30"));
        orders.add(new Order("金币100个", "2016/4/27 21:25:30"));
        orders.add(new Order("金币100个", "2016/4/27 21:25:30"));

        orderList = new OrderAdapter(this,orders);

        setListAdapter(orderList);
    }
}
