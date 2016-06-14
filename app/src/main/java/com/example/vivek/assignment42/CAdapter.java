package com.example.vivek.assignment42;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CAdapter extends ArrayAdapter<Integer> {

    Activity context;
    String[] contactName;
    Integer[] img1;

    public CAdapter(Activity context,String[] contactName, Integer[] img1) {
        super(context, R.layout.listview_layout, img1);
        this.contactName = contactName;
        this.img1 = img1;
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View customView = inflater.inflate(R.layout.listview_layout, null, true);

        ImageView image1 =(ImageView)customView.findViewById(R.id.image1);
        TextView text1 = (TextView)customView.findViewById(R.id.text1);

        image1.setImageResource(img1[position]);
        text1.setText(contactName[position]);

        return customView;
    }
}
