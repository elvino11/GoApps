package com.example.goapps.ui.developper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.goapps.databinding.FragmentDevelopperBinding;
import com.example.goapps.databinding.FragmentGalleryBinding;

public class DevelopperFragment extends Fragment {

private @NonNull FragmentDevelopperBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        DevelopperViewModel developperViewModel =
                new ViewModelProvider(this).get(DevelopperViewModel.class);

    binding = FragmentDevelopperBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textDevelopper;
        developperViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}