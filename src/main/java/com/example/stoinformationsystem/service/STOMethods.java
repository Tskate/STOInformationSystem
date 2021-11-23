package com.example.stoinformationsystem.service;

import com.example.stoinformationsystem.entity.STO;
import com.example.stoinformationsystem.repository.STORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class STOMethods {

    @Autowired
    STORepository stoRepository;

    public List<STO> findByBrands(String brand){
        List<STO> sto_list = stoRepository.findAll();
        List<STO> new_list = new ArrayList<>();
        for (int i = 0; i < sto_list.size(); i++) {
            if (sto_list.get(i).getServiceInfo().getBrands().contains(brand)) {
                new_list.add(sto_list.get(i));
            };
        }
        return new_list;
    }
}
