package com.example.toastlibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {
    public static void successToast(Context context, String message){

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        View view = toast.getView();
        int bg_color = Color.parseColor("#1FAA59");
        view.getBackground().setColorFilter(bg_color, PorterDuff.Mode.SRC_IN);
        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(Color.WHITE);
        toast.setGravity(Gravity.FILL_HORIZONTAL, 0, 0);
        toast.show();
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
