package com.example.dialog;

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


public class MyDialog  extends Dialog{
    private  String dialogName;
    private TextView tvMsg;
    public MyDialog(Context context, String dialogName){
        super(context);
        this.dialogName = dialogName;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_dialog);
        
       // tvMsg = (TextView) findViewById(R.id.tv_msg);
      //  tvMsg.setText(dialogName);
    }
}