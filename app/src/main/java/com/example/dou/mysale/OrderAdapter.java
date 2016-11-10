package com.example.dou.mysale;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dou on 2016/4/27.
 */
public class OrderAdapter extends BaseAdapter {
    List<Order> mOrders;
    Context mContext;

    public OrderAdapter(Context context, List<Order> orders){
        mOrders = orders;
        mContext = context;
    }

    //得到orders大小
    @Override
    public int getCount() {
        return mOrders.size();
    }
//返回该position对应的order类的值
    @Override
    public Object getItem(int position) {
        return mOrders.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.orderlist, null);

        TextView textView1 = (TextView)convertView.findViewById(R.id.text_buy_list);
        TextView textView2 = (TextView)convertView.findViewById(R.id.text_time_list);

        textView1.setText(mOrders.get(position).getProject());
        textView2.setText(mOrders.get(position).getDate());

        return convertView;
    }
}
