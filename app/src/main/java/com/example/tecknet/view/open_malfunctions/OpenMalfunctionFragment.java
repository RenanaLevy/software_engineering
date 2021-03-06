package com.example.tecknet.view.open_malfunctions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tecknet.R;
import com.example.tecknet.controller.TechnicianController;
import com.example.tecknet.databinding.FragmentOpenMalfunctionsBinding;
import com.example.tecknet.model.UserInt;
import com.example.tecknet.view.UserViewModel;


public class OpenMalfunctionFragment extends Fragment {
    private FragmentOpenMalfunctionsBinding binding;
    private View root;
    private ListView list;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentOpenMalfunctionsBinding.inflate(inflater, container, false);
        root = binding.getRoot();

        UserViewModel userView = new ViewModelProvider(requireActivity()).get(UserViewModel.class);
        UserInt user = userView.getItem().getValue();

        list = root.findViewById(R.id.listview);

        TechnicianController.load_open_malfunctions_list(user, root.getContext(), list);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}