package com.jaydeep.FShare.view;

import com.jaydeep.FShare.fragment.EditableListFragment;
import com.jaydeep.FShare.widget.EditableListAdapter;

public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}
