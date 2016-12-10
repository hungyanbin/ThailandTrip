package com.yanin.thailandtrip.images;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yanin.thailandtrip.R;
import com.yanin.thailandtrip.framework.BaseFragment;
import com.yanin.thailandtrip.framework.GridItemDecoration;
import com.yanin.thailandtrip.framework.WrapGridLayoutManager;

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
        findViews();
        setupRecycleView();
    }

    private void setupRecycleView() {
        imagesAdapter = new ImagesAdapter(getContext());
        imagesAdapter.setOnItemClickListener((url, view) -> {

        });
        layoutManager = new WrapGridLayoutManager(getContext(), 2);
        recycleImages.setAdapter(imagesAdapter);
        recycleImages.setLayoutManager(layoutManager);
        recycleImages.addItemDecoration(new GridItemDecoration(2));
    }

    private void findViews() {
        recycleImages = (RecyclerView)findViewById(R.id.recycleImages);
    }

}
