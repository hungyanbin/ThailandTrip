package com.yanin.thailandtrip.images;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yanin.thailandtrip.R;
import com.yanin.thailandtrip.framework.BaseFragment;
import com.yanin.thailandtrip.framework.GridItemDecoration;
import com.yanin.thailandtrip.framework.MainActivity;
import com.yanin.thailandtrip.framework.WrapGridLayoutManager;
import com.yanin.thailandtrip.page.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ImagesFragment extends BaseFragment {

    private RecyclerView recycleImages;
    private GridLayoutManager layoutManager;
    private ImagesAdapter imagesAdapter;

    public static ImagesFragment newInstance() {

        Bundle args = new Bundle();

        ImagesFragment fragment = new ImagesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_images, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = ((MainActivity) getActivity()).getToolbar();
        setupMainToolbar(toolbar, R.string.images);

        findViews();
        setupRecycleView();
    }

    private void setupRecycleView() {
        imagesAdapter = new ImagesAdapter(getContext());
        imagesAdapter.setOnItemClickListener((url, view) -> {
            pageNavigator.openPage(new PageFactory.FullImagePage(url));
        });
        layoutManager = new WrapGridLayoutManager(getContext(), 2);
        recycleImages.setAdapter(imagesAdapter);
        recycleImages.setLayoutManager(layoutManager);
        recycleImages.addItemDecoration(new GridItemDecoration(2));
    }

    private void findViews() {
        recycleImages = (RecyclerView)findViewById(R.id.recycleImages);
    }

    @Override
    public void onStart() {
        super.onStart();
        List<String> urls = new ArrayList<>();
        urls.add("https://cloud.githubusercontent.com/assets/7949400/21091549/e61835ce-c081-11e6-9d54-db94c3fafd9a.gif");
        urls.add("https://cloud.githubusercontent.com/assets/7949400/21091592/2271e826-c082-11e6-8b03-da3fa50bb5e3.png");
        urls.add("https://cloud.githubusercontent.com/assets/7949400/21125998/8680f10c-c124-11e6-8cd8-e7b73f4255a5.jpg");
        imagesAdapter.setUsers(urls);
    }
}
