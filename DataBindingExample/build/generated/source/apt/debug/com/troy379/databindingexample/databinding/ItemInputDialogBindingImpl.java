package com.troy379.databindingexample.databinding;
import com.troy379.databindingexample.R;
import com.troy379.databindingexample.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemInputDialogBindingImpl extends ItemInputDialogBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.EditText mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemInputDialogBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ItemInputDialogBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.EditText) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.text == variableId) {
            setText((com.troy379.databindingexample.binding.fields.ObservableString) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setText(@Nullable com.troy379.databindingexample.binding.fields.ObservableString Text) {
        updateRegistration(0, Text);
        this.mText = Text;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.text);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeText((com.troy379.databindingexample.binding.fields.ObservableString) object, fieldId);
        }
        return false;
    }
    private boolean onChangeText(com.troy379.databindingexample.binding.fields.ObservableString Text, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.troy379.databindingexample.binding.fields.ObservableString text = mText;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.troy379.databindingexample.binding.BindingAdapters.bindEditText(this.mboundView0, text);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): text
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}