package com.ahmetmatematikci.kitapuygulamalari;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by a on 1/19/17.
 */
public class HayvanAdapter extends  ArrayAdapter {
    int listitem_row;
    ArrayList<Hayvan> hayvanlar;
    LayoutInflater inflater;

    public HayvanAdapter(Context customListView, int listitem_row, ArrayList<Hayvan>hayvanlar) {
        super(customListView, listitem_row, hayvanlar);
        this.listitem_row = listitem_row;
        this.hayvanlar = hayvanlar;
        inflater = (LayoutInflater)customListView.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HayvanHolder  holder;
        if (convertView == null) {
            convertView = inflater.inflate(listitem_row, null);
            holder = new HayvanHolder();
            holder.image1 = (ImageView)convertView.findViewById(R.id.imageView2);
            holder.tv1 = (TextView)convertView.findViewById(R.id.textView15);
            holder.imageButton1 = (ImageButton)convertView.findViewById(R.id.imageButton);
            convertView.setTag(holder);

        } else {
            holder = (HayvanHolder)convertView.getTag();
        }

        holder.tv1.setText(hayvanlar.get(position).getIsim());
        holder.image1.setImageResource(hayvanlar.get(position).getResim());
        return convertView;



        //return super.getView(position, convertView, parent);
    }

    static  class HayvanHolder{
        private TextView tv1;
        private ImageView image1;
        private ImageButton imageButton1;
    }
}
