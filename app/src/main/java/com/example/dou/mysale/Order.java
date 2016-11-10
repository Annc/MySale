package com.example.dou.mysale;

/**
 * Created by Dou on 2016/4/27.
 */
public class Order {
    private String mProject;
    //时间暂时不确定用DATE还是STRING，先用string；
    private  String mDate;

    public Order(String first,String second){
        mProject = first;
        mDate = second;
    }

    public String getProject() {
        return mProject;
    }

    public String getDate() {
        return mDate;
    }

    public void setProject(String project) {
        mProject = project;
    }

    public void setDate(String date) {
        mDate = date;
    }
}
