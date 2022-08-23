package com.appboy.cordova;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.inappmessage.InAppMessageCloser;
import com.braze.ui.inappmessage.InAppMessageOperation;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;

import java.util.Map;

public class BrazeInAppMessageLifecycle implements IInAppMessageManagerListener {
  private final Activity mActivity;

  public BrazeInAppMessageLifecycle(Activity activity) {
    mActivity = activity;
  }

  @Override
  public InAppMessageOperation beforeInAppMessageDisplayed(boolean requeue) {
    if(requeue) {
        return InAppMessageOperation.DISPLAY_LATER;
    }
    return InAppMessageOperation.DISPLAY_NOW;
  }
}