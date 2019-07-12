package com.troy379.databindingexample.databinding;
import com.troy379.databindingexample.R;
import com.troy379.databindingexample.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(6, 
            new String[] {"item_counter", "item_counter", "item_counter"},
            new int[] {14, 15, 16},
            new int[] {com.troy379.databindingexample.R.layout.item_counter,
                com.troy379.databindingexample.R.layout.item_counter,
                com.troy379.databindingexample.R.layout.item_counter});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.avatarLayout, 17);
    }
    // views
    @NonNull
    private final com.troy379.databindingexample.ui.custom.CenteredIconButton mboundView10;
    @NonNull
    private final android.widget.ProgressBar mboundView11;
    @NonNull
    private final de.hdodenhof.circleimageview.CircleImageView mboundView2;
    @NonNull
    private final android.view.View mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @Nullable
    private final com.troy379.databindingexample.databinding.ItemCounterBinding mboundView61;
    @Nullable
    private final com.troy379.databindingexample.databinding.ItemCounterBinding mboundView62;
    @Nullable
    private final com.troy379.databindingexample.databinding.ItemCounterBinding mboundView63;
    @NonNull
    private final android.widget.Button mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    @NonNull
    private final android.widget.Button mboundView9;
    // variables
    // values
    // listeners
    private RunnableImpl mViewModelShowDevMessageJavaLangRunnable;
    private RunnableImpl1 mViewModelChangeFriendshipStatusJavaLangRunnable;
    private RunnableImpl2 mViewModelEditJavaLangRunnable;
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.RelativeLayout) bindings[17]
            , (android.support.design.widget.CoordinatorLayout) bindings[0]
            , (android.support.design.widget.FloatingActionButton) bindings[13]
            , (android.support.v7.widget.RecyclerView) bindings[12]
            , (android.support.v7.widget.Toolbar) bindings[1]
            );
        this.coordinator.setTag(null);
        this.fab.setTag(null);
        this.mboundView10 = (com.troy379.databindingexample.ui.custom.CenteredIconButton) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.ProgressBar) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (de.hdodenhof.circleimageview.CircleImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.view.View) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView61 = (com.troy379.databindingexample.databinding.ItemCounterBinding) bindings[14];
        setContainedBinding(this.mboundView61);
        this.mboundView62 = (com.troy379.databindingexample.databinding.ItemCounterBinding) bindings[15];
        setContainedBinding(this.mboundView62);
        this.mboundView63 = (com.troy379.databindingexample.databinding.ItemCounterBinding) bindings[16];
        setContainedBinding(this.mboundView63);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.Button) bindings[9];
        this.mboundView9.setTag(null);
        this.recycler.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        mboundView61.invalidateAll();
        mboundView62.invalidateAll();
        mboundView63.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView61.hasPendingBindings()) {
            return true;
        }
        if (mboundView62.hasPendingBindings()) {
            return true;
        }
        if (mboundView63.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.troy379.databindingexample.ui.activities.main.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.troy379.databindingexample.ui.activities.main.ProfileViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView61.setLifecycleOwner(lifecycleOwner);
        mboundView62.setLifecycleOwner(lifecycleOwner);
        mboundView63.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRecyclerConfiguration((com.troy379.databindingexample.binding.fields.RecyclerConfiguration) object, fieldId);
            case 1 :
                return onChangeViewModelIsOnline((com.troy379.databindingexample.binding.fields.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelIsFriend((com.troy379.databindingexample.binding.fields.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelStatus((com.troy379.databindingexample.binding.fields.ObservableString) object, fieldId);
            case 4 :
                return onChangeViewModelFriendsCount((com.troy379.databindingexample.binding.fields.ObservableInt) object, fieldId);
            case 5 :
                return onChangeViewModelStarsCount((com.troy379.databindingexample.binding.fields.ObservableInt) object, fieldId);
            case 6 :
                return onChangeViewModelIsLoaded((com.troy379.databindingexample.binding.fields.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRecyclerConfiguration(com.troy379.databindingexample.binding.fields.RecyclerConfiguration ViewModelRecyclerConfiguration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsOnline(com.troy379.databindingexample.binding.fields.ObservableBoolean ViewModelIsOnline, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsFriend(com.troy379.databindingexample.binding.fields.ObservableBoolean ViewModelIsFriend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStatus(com.troy379.databindingexample.binding.fields.ObservableString ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFriendsCount(com.troy379.databindingexample.binding.fields.ObservableInt ViewModelFriendsCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStarsCount(com.troy379.databindingexample.binding.fields.ObservableInt ViewModelStarsCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoaded(com.troy379.databindingexample.binding.fields.ObservableBoolean ViewModelIsLoaded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        java.lang.String viewModelUserNameCharViewModelUserSurname = null;
        int viewModelStarsCountGet = 0;
        java.lang.String androidPluralsPhotosViewModelUserCountersPhotos = null;
        boolean viewModelIsLoadedGet = false;
        com.troy379.databindingexample.binding.fields.RecyclerConfiguration viewModelRecyclerConfiguration = null;
        java.lang.Runnable viewModelShowDevMessageJavaLangRunnable = null;
        boolean viewModelIsOnlineGet = false;
        com.troy379.databindingexample.data.models.User viewModelUser = null;
        com.troy379.databindingexample.binding.fields.ObservableBoolean viewModelIsOnline = null;
        com.troy379.databindingexample.binding.fields.ObservableBoolean viewModelIsFriend = null;
        java.lang.String viewModelUserName = null;
        java.lang.String viewModelUserPhoto = null;
        java.lang.String viewModelUserSurname = null;
        java.lang.String androidPluralsStarsViewModelStarsCount = null;
        java.lang.String toolbarAndroidStringProfileViewModelUserName = null;
        java.lang.String viewModelUserNameChar = null;
        boolean viewModelIsFriendGet = false;
        java.lang.String androidPluralsFriendsViewModelFriendsCount = null;
        java.lang.Runnable viewModelChangeFriendshipStatusJavaLangRunnable = null;
        com.troy379.databindingexample.binding.fields.ObservableString viewModelStatus = null;
        java.lang.Runnable viewModelEditJavaLangRunnable = null;
        com.troy379.databindingexample.binding.fields.ObservableInt viewModelFriendsCount = null;
        int viewModelFriendsCountGet = 0;
        android.graphics.drawable.Drawable viewModelIsOnlineGetMboundView3AndroidDrawableShapeOnlineMboundView3AndroidDrawableShapeEmpty = null;
        com.troy379.databindingexample.binding.fields.ObservableInt viewModelStarsCount = null;
        com.troy379.databindingexample.data.models.Counters viewModelUserCounters = null;
        boolean ViewModelIsLoadedGet1 = false;
        int viewModelUserCountersPhotos = 0;
        com.troy379.databindingexample.binding.fields.ObservableBoolean viewModelIsLoaded = null;
        boolean ViewModelIsFriendGet1 = false;
        com.troy379.databindingexample.ui.activities.main.ProfileViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.recyclerConfiguration
                        viewModelRecyclerConfiguration = viewModel.recyclerConfiguration;
                    }
                    updateRegistration(0, viewModelRecyclerConfiguration);
            }
            if ((dirtyFlags & 0x180L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::showDevMessage
                        viewModelShowDevMessageJavaLangRunnable = (((mViewModelShowDevMessageJavaLangRunnable == null) ? (mViewModelShowDevMessageJavaLangRunnable = new RunnableImpl()) : mViewModelShowDevMessageJavaLangRunnable).setValue(viewModel));
                        // read viewModel.user
                        viewModelUser = viewModel.user;
                        // read viewModel::changeFriendshipStatus
                        viewModelChangeFriendshipStatusJavaLangRunnable = (((mViewModelChangeFriendshipStatusJavaLangRunnable == null) ? (mViewModelChangeFriendshipStatusJavaLangRunnable = new RunnableImpl1()) : mViewModelChangeFriendshipStatusJavaLangRunnable).setValue(viewModel));
                        // read viewModel::edit
                        viewModelEditJavaLangRunnable = (((mViewModelEditJavaLangRunnable == null) ? (mViewModelEditJavaLangRunnable = new RunnableImpl2()) : mViewModelEditJavaLangRunnable).setValue(viewModel));
                    }


                    if (viewModelUser != null) {
                        // read viewModel.user.name
                        viewModelUserName = viewModelUser.getName();
                        // read viewModel.user.photo
                        viewModelUserPhoto = viewModelUser.getPhoto();
                        // read viewModel.user.surname
                        viewModelUserSurname = viewModelUser.getSurname();
                        // read viewModel.user.counters
                        viewModelUserCounters = viewModelUser.getCounters();
                    }


                    // read @android:string/profile
                    toolbarAndroidStringProfileViewModelUserName = toolbar.getResources().getString(R.string.profile, viewModelUserName);
                    // read (viewModel.user.name) + (' ')
                    viewModelUserNameChar = (viewModelUserName) + (' ');
                    if (viewModelUserCounters != null) {
                        // read viewModel.user.counters.photos
                        viewModelUserCountersPhotos = viewModelUserCounters.getPhotos();
                    }


                    // read ((viewModel.user.name) + (' ')) + (viewModel.user.surname)
                    viewModelUserNameCharViewModelUserSurname = (viewModelUserNameChar) + (viewModelUserSurname);
                    // read @android:plurals/photos
                    androidPluralsPhotosViewModelUserCountersPhotos = getRoot().getResources().getQuantityString(R.plurals.photos, viewModelUserCountersPhotos);
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isOnline
                        viewModelIsOnline = viewModel.isOnline;
                    }
                    updateRegistration(1, viewModelIsOnline);


                    if (viewModelIsOnline != null) {
                        // read viewModel.isOnline.get
                        viewModelIsOnlineGet = viewModelIsOnline.get();
                    }
                if((dirtyFlags & 0x182L) != 0) {
                    if(viewModelIsOnlineGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.isOnline.get ? @android:drawable/shape_online : @android:drawable/shape_empty
                    viewModelIsOnlineGetMboundView3AndroidDrawableShapeOnlineMboundView3AndroidDrawableShapeEmpty = ((viewModelIsOnlineGet) ? (getDrawableFromResource(mboundView3, R.drawable.shape_online)) : (getDrawableFromResource(mboundView3, R.drawable.shape_empty)));
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isFriend
                        viewModelIsFriend = viewModel.isFriend;
                    }
                    updateRegistration(2, viewModelIsFriend);


                    if (viewModelIsFriend != null) {
                        // read viewModel.isFriend.get
                        ViewModelIsFriendGet1 = viewModelIsFriend.get();
                    }


                    // read !viewModel.isFriend.get
                    viewModelIsFriendGet = !ViewModelIsFriendGet1;
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.status;
                    }
                    updateRegistration(3, viewModelStatus);
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.friendsCount
                        viewModelFriendsCount = viewModel.friendsCount;
                    }
                    updateRegistration(4, viewModelFriendsCount);


                    if (viewModelFriendsCount != null) {
                        // read viewModel.friendsCount.get()
                        viewModelFriendsCountGet = viewModelFriendsCount.get();
                    }


                    // read @android:plurals/friends
                    androidPluralsFriendsViewModelFriendsCount = getRoot().getResources().getQuantityString(R.plurals.friends, viewModelFriendsCountGet);
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.starsCount
                        viewModelStarsCount = viewModel.starsCount;
                    }
                    updateRegistration(5, viewModelStarsCount);


                    if (viewModelStarsCount != null) {
                        // read viewModel.starsCount.get()
                        viewModelStarsCountGet = viewModelStarsCount.get();
                    }


                    // read @android:plurals/stars
                    androidPluralsStarsViewModelStarsCount = getRoot().getResources().getQuantityString(R.plurals.stars, viewModelStarsCountGet);
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoaded
                        viewModelIsLoaded = viewModel.isLoaded;
                    }
                    updateRegistration(6, viewModelIsLoaded);


                    if (viewModelIsLoaded != null) {
                        // read viewModel.isLoaded.get
                        viewModelIsLoadedGet = viewModelIsLoaded.get();
                    }


                    // read !viewModel.isLoaded.get
                    ViewModelIsLoadedGet1 = !viewModelIsLoadedGet;
            }
        }
        // batch finished
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            com.troy379.databindingexample.binding.BindingAdapters.bindOnClick(this.fab, viewModelEditJavaLangRunnable);
            com.troy379.databindingexample.binding.BindingAdapters.bindOnClick(this.mboundView10, viewModelChangeFriendshipStatusJavaLangRunnable);
            com.troy379.databindingexample.binding.BindingAdapters.loadImage(this.mboundView2, viewModelUserPhoto);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelUserNameCharViewModelUserSurname);
            this.mboundView61.setTitle(androidPluralsPhotosViewModelUserCountersPhotos);
            this.mboundView61.setCount(viewModelUserCountersPhotos);
            com.troy379.databindingexample.binding.BindingAdapters.bindOnClick(this.mboundView7, viewModelShowDevMessageJavaLangRunnable);
            com.troy379.databindingexample.binding.BindingAdapters.bindOnClick(this.mboundView9, viewModelChangeFriendshipStatusJavaLangRunnable);
            this.toolbar.setTitle(toolbarAndroidStringProfileViewModelUserName);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(com.troy379.databindingexample.binding.BindingConversions.convertBooleanToVisibility(ViewModelIsFriendGet1));
            this.mboundView9.setVisibility(com.troy379.databindingexample.binding.BindingConversions.convertBooleanToVisibility(viewModelIsFriendGet));
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(com.troy379.databindingexample.binding.BindingConversions.convertBooleanToVisibility(ViewModelIsLoadedGet1));
            this.mboundView8.setVisibility(com.troy379.databindingexample.binding.BindingConversions.convertBooleanToVisibility(viewModelIsLoadedGet));
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView3, viewModelIsOnlineGetMboundView3AndroidDrawableShapeOnlineMboundView3AndroidDrawableShapeEmpty);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, com.troy379.databindingexample.binding.fields.ObservableString.convertToString(viewModelStatus));
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            this.mboundView62.setTitle(androidPluralsFriendsViewModelFriendsCount);
            this.mboundView62.setCount(viewModelFriendsCountGet);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            this.mboundView63.setTitle(androidPluralsStarsViewModelStarsCount);
            this.mboundView63.setCount(viewModelStarsCountGet);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            com.troy379.databindingexample.binding.fields.RecyclerConfiguration.configureRecyclerView(this.recycler, viewModelRecyclerConfiguration);
        }
        executeBindingsOn(mboundView61);
        executeBindingsOn(mboundView62);
        executeBindingsOn(mboundView63);
    }
    // Listener Stub Implementations
    public static class RunnableImpl implements java.lang.Runnable{
        private com.troy379.databindingexample.ui.activities.main.ProfileViewModel value;
        public RunnableImpl setValue(com.troy379.databindingexample.ui.activities.main.ProfileViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void run() {
            this.value.showDevMessage(); 
        }
    }
    public static class RunnableImpl1 implements java.lang.Runnable{
        private com.troy379.databindingexample.ui.activities.main.ProfileViewModel value;
        public RunnableImpl1 setValue(com.troy379.databindingexample.ui.activities.main.ProfileViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void run() {
            this.value.changeFriendshipStatus(); 
        }
    }
    public static class RunnableImpl2 implements java.lang.Runnable{
        private com.troy379.databindingexample.ui.activities.main.ProfileViewModel value;
        public RunnableImpl2 setValue(com.troy379.databindingexample.ui.activities.main.ProfileViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void run() {
            this.value.edit(); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.recyclerConfiguration
        flag 1 (0x2L): viewModel.isOnline
        flag 2 (0x3L): viewModel.isFriend
        flag 3 (0x4L): viewModel.status
        flag 4 (0x5L): viewModel.friendsCount
        flag 5 (0x6L): viewModel.starsCount
        flag 6 (0x7L): viewModel.isLoaded
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.isOnline.get ? @android:drawable/shape_online : @android:drawable/shape_empty
        flag 10 (0xbL): viewModel.isOnline.get ? @android:drawable/shape_online : @android:drawable/shape_empty
    flag mapping end*/
    //end
}