// Generated by view binder compiler. Do not edit!
package com.example.nasaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.nasaclient.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySecurityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final Switch switch1;

  @NonNull
  public final Switch switch2;

  @NonNull
  public final Switch switch3;

  @NonNull
  public final TextView titleText;

  private ActivitySecurityBinding(@NonNull LinearLayout rootView, @NonNull ImageButton backButton,
      @NonNull LinearLayout main, @NonNull Switch switch1, @NonNull Switch switch2,
      @NonNull Switch switch3, @NonNull TextView titleText) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.main = main;
    this.switch1 = switch1;
    this.switch2 = switch2;
    this.switch3 = switch3;
    this.titleText = titleText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySecurityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySecurityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_security, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySecurityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.switch1;
      Switch switch1 = ViewBindings.findChildViewById(rootView, id);
      if (switch1 == null) {
        break missingId;
      }

      id = R.id.switch2;
      Switch switch2 = ViewBindings.findChildViewById(rootView, id);
      if (switch2 == null) {
        break missingId;
      }

      id = R.id.switch3;
      Switch switch3 = ViewBindings.findChildViewById(rootView, id);
      if (switch3 == null) {
        break missingId;
      }

      id = R.id.titleText;
      TextView titleText = ViewBindings.findChildViewById(rootView, id);
      if (titleText == null) {
        break missingId;
      }

      return new ActivitySecurityBinding((LinearLayout) rootView, backButton, main, switch1,
          switch2, switch3, titleText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
