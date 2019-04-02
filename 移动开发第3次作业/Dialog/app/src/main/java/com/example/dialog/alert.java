package com.example.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Context;
import android.widget.TextView;


public class alert  extends AlertDialog {
    private  String dialogName;
    private TextView tvMsg;
    public alert(Context context, String dialogName){
        super(context);
        this.dialogName = dialogName;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_dialog);

//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setTitle("login");
//        LayoutInflater layoutInflater = LayoutInflater.from(this);
//
//        final View myLoginView = layoutInflater.inflate(
//                R.layout.my_dialog, null);
//        dialog.setView(myLoginView);
//        dialog.show();

    }
}