package com.example.pcpv.circleindicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ImageFragment extends Fragment {
    private int imageURL;

    public static ImageFragment newInstance(int imageURL) {
        ImageFragment imageFragment = new ImageFragment();
        imageFragment.imageURL = imageURL;
        return  imageFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        ImageView imageView =view.findViewById(R.id.imageView);
        imageView.setImageResource(imageURL);

        return view;

    }

}