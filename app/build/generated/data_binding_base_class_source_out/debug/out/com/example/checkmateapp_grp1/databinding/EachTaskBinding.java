// Generated by view binder compiler. Do not edit!
package com.example.checkmateapp_grp1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.checkmateapp_grp1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EachTaskBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CheckBox mcheckBox;

  @NonNull
  public final TextView txtDueDate;

  private EachTaskBinding(@NonNull ConstraintLayout rootView, @NonNull CheckBox mcheckBox,
      @NonNull TextView txtDueDate) {
    this.rootView = rootView;
    this.mcheckBox = mcheckBox;
    this.txtDueDate = txtDueDate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EachTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EachTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.each_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EachTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mcheckBox;
      CheckBox mcheckBox = ViewBindings.findChildViewById(rootView, id);
      if (mcheckBox == null) {
        break missingId;
      }

      id = R.id.txtDueDate;
      TextView txtDueDate = ViewBindings.findChildViewById(rootView, id);
      if (txtDueDate == null) {
        break missingId;
      }

      return new EachTaskBinding((ConstraintLayout) rootView, mcheckBox, txtDueDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
