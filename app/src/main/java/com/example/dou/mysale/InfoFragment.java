package com.example.dou.mysale;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Dou on 2016/4/11.
 */
public class InfoFragment extends Fragment{
    private Button mButtonLoginOne;
    private TextView mTextViewOrder;
    private TextView mTextViewTicket;
    private TextView mTextViewCustomer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        Log.d("mark", "onCreate()--------->news Fragment");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.infolayout,container,false);
        mButtonLoginOne = (Button)v.findViewById(R.id.infobuttonlogin);
        mButtonLoginOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent_1);
            }
        });

        mTextViewOrder = (TextView)v.findViewById(R.id.order);
        mTextViewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent(getActivity(), OrderListActivity.class);
                startActivity(intent_2);
            }
        });

        mTextViewTicket = (TextView)v.findViewById(R.id.ticket);
        mTextViewTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_3 = new Intent(getActivity(), TicketActivity.class);
                startActivity(intent_3);
            }
        });
        mTextViewCustomer = (TextView)v.findViewById(R.id.customer);
        mTextViewCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_4 = new Intent(getActivity(), AdressActivity.class);
                startActivity(intent_4);
            }
        });
        return v;
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d("mark", "onPause()--------->news Fragment");
    }
}
