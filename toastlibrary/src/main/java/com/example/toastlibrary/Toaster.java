package com.example.toastlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {
    public static void toaster(Context context, String message){

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        View view = toast.getView();
        view.setBackgroundResource(R.drawable.toast_bg);
        toast.show();
    }
}
