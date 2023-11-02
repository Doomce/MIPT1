package com.dom.mipt4.elements;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.dom.mipt4.R;

public class Alert {

    private AlertDialog dialog;
    public Alert(Context context, String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(message).setTitle(title);
        builder.setCancelable(true);
        builder.setNegativeButton("Atgal", ((dialog, which) -> dialog.dismiss()));

        dialog = builder.create();
    }

    public Alert(Context context, int title, int message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(message).setTitle(title);
        builder.setCancelable(true);
        builder.setNegativeButton("Atgal", ((dialog, which) -> dialog.dismiss()));

        dialog = builder.create();
    }

    public void show() {
        dialog.show();
    }

}