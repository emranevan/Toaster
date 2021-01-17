package com.example.myapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Toasty {
    private Toast mToast;
    public Toasty(Context context) {
        mToast = Toast.makeText(context, "", Toast.LENGTH_LONG);
        mToast.setGravity(Gravity.FILL_HORIZONTAL|Gravity.BOTTOM, 0, 0);

    }

    public void setText(String s){
        mToast.setText(s);
    }

    public void show(){
        mToast.show();
    }

    public void setBackground(String color){
        View view = mToast.getView();
        int bg_color = Color.parseColor(color);
        view.getBackground().setColorFilter(bg_color, PorterDuff.Mode.SRC_IN);

    }

    public void setTextColor(String color){
        View view = mToast.getView();
        TextView text = view.findViewById(android.R.id.message);
        int text_color = Color.parseColor(color);
        text.setTextColor(text_color);
    }

    public static void successToast(Context context, String message, Color color){



    }

    public static void errorToast(Context context, String message){

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        View view = toast.getView();
        int bg_color = Color.parseColor("#E21717");
        view.getBackground().setColorFilter(bg_color, PorterDuff.Mode.SRC_IN);
        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(Color.WHITE);
        toast.setGravity(Gravity.FILL_HORIZONTAL, 0, 0);
        toast.show();
    }

    public static void InfoToast(Context context, String message){

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        View view = toast.getView();
        int bg_color = Color.parseColor("#F4BE2C");
        view.getBackground().setColorFilter(bg_color, PorterDuff.Mode.SRC_IN);
        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(Color.WHITE);
        toast.setGravity(Gravity.FILL_HORIZONTAL, 0, 0);
        toast.show();
    }
}
