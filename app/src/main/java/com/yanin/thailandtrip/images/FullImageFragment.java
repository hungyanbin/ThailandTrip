package com.yanin.thailandtrip.images;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yanin.thailandtrip.R;
import com.yanin.thailandtrip.framework.BaseFragment;

import uk.co.senab.photoview.PhotoViewAttacher;

public class FullImageFragment extends BaseFragment {

    private static final String ARG_URL = "url";

    private String url;
    private ImageView imageFull;
    private PhotoViewAttacher photoViewAttacher;


    public static FullImageFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString(ARG_URL, url);

        FullImageFragment fragment = new FullImageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        url = bundle.getString(ARG_URL);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_full_image, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        findViews();
        Glide.with(this)
                .load(url)
                .into(imageFull);
        photoViewAttacher = new PhotoViewAttacher(imageFull);
    }


    private void findViews() {
        imageFull = (ImageView)findViewById(R.id.imageFull);
    }
}
