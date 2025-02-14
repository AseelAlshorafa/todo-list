package com.example.todolist;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

public class ProgressDialogGenerator {

    public static ProgressDialog showLoadingDialog(Context context) {

        ProgressDialog progressDialog = ProgressDialog.show(context, null, null, true, false);
        progressDialog.setContentView(R.layout.activity_progress_bar);

        if (progressDialog.getWindow() != null) {
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        return progressDialog;

    }


}