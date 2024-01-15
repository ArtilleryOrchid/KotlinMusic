package com.artillery.musicbase.base;


import androidx.annotation.NonNull;

/**
 * Description：RecycleView多布局ItemViewModel是封装
 * @author ArtilleryOrchid
 */

public class MultiItemViewModel<VM extends BaseViewModel> extends ItemViewModel<VM> {
    protected Object multiType;

    public Object getItemType() {
        return multiType;
    }

    public void multiItemType(@NonNull Object multiType) {
        this.multiType = multiType;
    }

    public MultiItemViewModel(@NonNull VM viewModel) {
        super(viewModel);
    }
}
