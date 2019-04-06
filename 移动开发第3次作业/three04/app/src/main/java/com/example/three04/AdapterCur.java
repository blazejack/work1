package com.example.three04;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdapterCur extends BaseAdapter {


    List<Item> list;
    Context context;


    //初始化
    public AdapterCur(List<Item> list, Context context) {
        this.context = context;
        this.list = list;
        notifyDataSetChanged();
    }

    public int getCount() {
        return list.size();
    }

    public Item getItem(int position) {
        return list.get(position);
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.checkbox_item, null);
            viewHolder=new ViewHolder();
            viewHolder.imageView=(ImageView) convertView.findViewById(R.id.img);
            viewHolder.textView=(TextView) convertView.findViewById(R.id.text_view);
            convertView.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder) convertView.getTag();
        }

        int green = Color.parseColor("#00FF00");
        int white = Color.parseColor("#FFFFFF");
        viewHolder.textView.setText(list.get(position).getName());
        //改变选中颜色
        if(list.get(position).isBo() == true){
            viewHolder.textView.setBackgroundColor(green);
            viewHolder.imageView.setBackgroundColor(green);
        }
        else {
            viewHolder.textView.setBackgroundColor(white);
            viewHolder.imageView.setBackgroundColor(white);

        }

        return convertView;

    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}



