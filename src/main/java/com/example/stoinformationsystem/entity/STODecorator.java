package com.example.stoinformationsystem.entity;

import com.example.stoinformationsystem.repository.STORepository;

public abstract class STODecorator implements STORepository {

    public abstract String getTypeService();
}
