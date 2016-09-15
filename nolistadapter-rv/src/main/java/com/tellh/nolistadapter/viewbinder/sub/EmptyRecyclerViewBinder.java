package tellh.com.nolistadapter.viewbinder.sub;

import com.tellh.nolistadapter.IListAdapter;
import tellh.com.nolistadapter.viewbinder.base.RecyclerViewBinder;
import com.tellh.nolistadapter.IViewBinderProvider;

/**
 * Created by tlh on 2016/9/13 :)
 */
public abstract class EmptyRecyclerViewBinder<VH extends RecyclerViewBinder.ViewHolder> extends RecyclerViewBinder<IViewBinderProvider, VH> {
    @Override
    final public void bindView(IListAdapter adapter, VH holder, int position, IViewBinderProvider entity) {
        bindEmptyView(adapter, holder, position);
    }

    protected abstract void bindEmptyView(IListAdapter adapter, VH holder, int position);
}