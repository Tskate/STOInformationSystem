package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.OnlyService;
import com.example.stoinformationsystem.entity.STO;
import com.example.stoinformationsystem.entity.STOImpl;
import com.example.stoinformationsystem.entity.TireFitting;


public class STODecoratorTest {
        public static void main(String[] args){
        STORepository sto1 = new OnlyService(new STOImpl());
        System.out.println(sto1.getTotalBenefits());

        STORepository sto2 = new TireFitting(new STOImpl());
        System.out.println(sto2.getTotalBenefits());




    }
}