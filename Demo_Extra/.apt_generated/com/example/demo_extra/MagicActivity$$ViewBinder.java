// Generated code from Butter Knife. Do not modify!
package com.example.demo_extra;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MagicActivity$$ViewBinder<T extends com.example.demo_extra.MagicActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230722, "field 'tvSmall'");
    target.tvSmall = finder.castView(view, 2131230722, "field 'tvSmall'");
    view = finder.findRequiredView(source, 2131230720, "field 'tvLarge'");
    target.tvLarge = finder.castView(view, 2131230720, "field 'tvLarge'");
    view = finder.findRequiredView(source, 2131230721, "field 'tvMedium'");
    target.tvMedium = finder.castView(view, 2131230721, "field 'tvMedium'");
    view = finder.findRequiredView(source, 2131230724, "method 'myToggleCheckChangeCallback'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.myToggleCheckChangeCallback(finder.<android.widget.ToggleButton>castParam(p0, "onCheckedChanged", 0, "myToggleCheckChangeCallback", 0));
        }
      });
    view = finder.findRequiredView(source, 2131230723, "method 'myCheckChangeCallback'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.myCheckChangeCallback(finder.<android.widget.CheckBox>castParam(p0, "onCheckedChanged", 0, "myCheckChangeCallback", 0));
        }
      });
    view = finder.findRequiredView(source, 2131230725, "method 'myBtnClickCallback'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.myBtnClickCallback(finder.<android.widget.Button>castParam(p0, "doClick", 0, "myBtnClickCallback", 0));
        }
      });
    view = finder.findRequiredView(source, 2131230726, "method 'myBtnClickCallback'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.myBtnClickCallback(finder.<android.widget.Button>castParam(p0, "doClick", 0, "myBtnClickCallback", 0));
        }
      });
  }

  @Override public void unbind(T target) {
    target.tvSmall = null;
    target.tvLarge = null;
    target.tvMedium = null;
  }
}
