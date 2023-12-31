// Generated by view binder compiler. Do not edit!
package com.example.checkmateapp_grp1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.checkmateapp_grp1.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomePageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSignout;

  @NonNull
  public final FloatingActionButton floatingActionButton1;

  @NonNull
  public final TextView txtTitle1;

  @NonNull
  public final TextView txtTitle4;

  private ActivityHomePageBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSignout,
      @NonNull FloatingActionButton floatingActionButton1, @NonNull TextView txtTitle1,
      @NonNull TextView txtTitle4) {
    this.rootView = rootView;
    this.btnSignout = btnSignout;
    this.floatingActionButton1 = floatingActionButton1;
    this.txtTitle1 = txtTitle1;
    this.txtTitle4 = txtTitle4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignout;
      Button btnSignout = ViewBindings.findChildViewById(rootView, id);
      if (btnSignout == null) {
        break missingId;
      }

      id = R.id.floatingActionButton1;
      FloatingActionButton floatingActionButton1 = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButton1 == null) {
        break missingId;
      }

      id = R.id.txtTitle1;
      TextView txtTitle1 = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle1 == null) {
        break missingId;
      }

      id = R.id.txtTitle4;
      TextView txtTitle4 = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle4 == null) {
        break missingId;
      }

      return new ActivityHomePageBinding((ConstraintLayout) rootView, btnSignout,
          floatingActionButton1, txtTitle1, txtTitle4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
