// Generated by view binder compiler. Do not edit!
package com.example.checkmateapp_grp1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
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

public final class ActivityForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnForgotPass;

  @NonNull
  public final EditText edtEmailForgotPass;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final TextView txtDes;

  @NonNull
  public final TextView txtDes3;

  @NonNull
  public final TextView txtDes4;

  @NonNull
  public final TextView txtDes5;

  @NonNull
  public final TextView txtDes6;

  @NonNull
  public final TextView txtLogIn2;

  @NonNull
  public final TextView txtTitle2;

  private ActivityForgotPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnForgotPass, @NonNull EditText edtEmailForgotPass,
      @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4,
      @NonNull TextView txtDes, @NonNull TextView txtDes3, @NonNull TextView txtDes4,
      @NonNull TextView txtDes5, @NonNull TextView txtDes6, @NonNull TextView txtLogIn2,
      @NonNull TextView txtTitle2) {
    this.rootView = rootView;
    this.btnForgotPass = btnForgotPass;
    this.edtEmailForgotPass = edtEmailForgotPass;
    this.linearLayout3 = linearLayout3;
    this.linearLayout4 = linearLayout4;
    this.txtDes = txtDes;
    this.txtDes3 = txtDes3;
    this.txtDes4 = txtDes4;
    this.txtDes5 = txtDes5;
    this.txtDes6 = txtDes6;
    this.txtLogIn2 = txtLogIn2;
    this.txtTitle2 = txtTitle2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnForgotPass;
      Button btnForgotPass = ViewBindings.findChildViewById(rootView, id);
      if (btnForgotPass == null) {
        break missingId;
      }

      id = R.id.edtEmailForgotPass;
      EditText edtEmailForgotPass = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailForgotPass == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.txtDes;
      TextView txtDes = ViewBindings.findChildViewById(rootView, id);
      if (txtDes == null) {
        break missingId;
      }

      id = R.id.txtDes3;
      TextView txtDes3 = ViewBindings.findChildViewById(rootView, id);
      if (txtDes3 == null) {
        break missingId;
      }

      id = R.id.txtDes4;
      TextView txtDes4 = ViewBindings.findChildViewById(rootView, id);
      if (txtDes4 == null) {
        break missingId;
      }

      id = R.id.txtDes5;
      TextView txtDes5 = ViewBindings.findChildViewById(rootView, id);
      if (txtDes5 == null) {
        break missingId;
      }

      id = R.id.txtDes6;
      TextView txtDes6 = ViewBindings.findChildViewById(rootView, id);
      if (txtDes6 == null) {
        break missingId;
      }

      id = R.id.txtLogIn2;
      TextView txtLogIn2 = ViewBindings.findChildViewById(rootView, id);
      if (txtLogIn2 == null) {
        break missingId;
      }

      id = R.id.txtTitle2;
      TextView txtTitle2 = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle2 == null) {
        break missingId;
      }

      return new ActivityForgotPasswordBinding((ConstraintLayout) rootView, btnForgotPass,
          edtEmailForgotPass, linearLayout3, linearLayout4, txtDes, txtDes3, txtDes4, txtDes5,
          txtDes6, txtLogIn2, txtTitle2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
