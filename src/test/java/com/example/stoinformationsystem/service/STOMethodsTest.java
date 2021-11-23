package com.example.stoinformationsystem.service;

import com.example.stoinformationsystem.entity.STO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class STOMethodsTest {

    @Autowired
    STOMethods stoMethods;
    @Test
        public void findByBrands() throws Exception {
            List<STO> sto_list = stoMethods.findByBrands("Mazda");

            assertThat(sto_list).hasSize(2);
            assertThat(sto_list.get(0).getId()).isEqualTo(1);
            assertThat(sto_list.get(1).getId()).isEqualTo(6);
        }
}
