package com.troy379.databindingexample.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.troy379.databindingexample.binding.fields.ObservableString;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemInputDialogBinding extends ViewDataBinding {
  @Bindable
  protected ObservableString mText;

  protected ItemInputDialogBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setText(@Nullable ObservableString text);

  @Nullable
  public ObservableString getText() {
    return mText;
  }

  @NonNull
  public static ItemInputDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_input_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemInputDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemInputDialogBinding>inflateInternal(inflater, com.troy379.databindingexample.R.layout.item_input_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static ItemInputDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_input_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemInputDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemInputDialogBinding>inflateInternal(inflater, com.troy379.databindingexample.R.layout.item_input_dialog, null, false, component);
  }

  public static ItemInputDialogBinding bind(@NonNull View view) {
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
  public static ItemInputDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemInputDialogBinding)bind(component, view, com.troy379.databindingexample.R.layout.item_input_dialog);
  }
}
