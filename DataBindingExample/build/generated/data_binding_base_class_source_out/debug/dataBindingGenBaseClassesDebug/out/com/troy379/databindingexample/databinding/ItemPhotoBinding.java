package com.troy379.databindingexample.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.String;

public abstract class ItemPhotoBinding extends ViewDataBinding {
  @Bindable
  protected String mUrl;

  protected ItemPhotoBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setUrl(@Nullable String url);

  @Nullable
  public String getUrl() {
    return mUrl;
  }

  @NonNull
  public static ItemPhotoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_photo, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPhotoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPhotoBinding>inflateInternal(inflater, com.troy379.databindingexample.R.layout.item_photo, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPhotoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_photo, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPhotoBinding>inflateInternal(inflater, com.troy379.databindingexample.R.layout.item_photo, null, false, component);
  }

  public static ItemPhotoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemPhotoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPhotoBinding)bind(component, view, com.troy379.databindingexample.R.layout.item_photo);
  }
}
