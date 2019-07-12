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

public abstract class ItemCounterBinding extends ViewDataBinding {
  @Bindable
  protected int mCount;

  @Bindable
  protected String mTitle;

  protected ItemCounterBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setCount(int count);

  public int getCount() {
    return mCount;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  @NonNull
  public static ItemCounterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_counter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCounterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCounterBinding>inflateInternal(inflater, com.troy379.databindingexample.R.layout.item_counter, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCounterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_counter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCounterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCounterBinding>inflateInternal(inflater, com.troy379.databindingexample.R.layout.item_counter, null, false, component);
  }

  public static ItemCounterBinding bind(@NonNull View view) {
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
  public static ItemCounterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCounterBinding)bind(component, view, com.troy379.databindingexample.R.layout.item_counter);
  }
}
