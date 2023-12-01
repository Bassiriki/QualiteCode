package com.groupeisi.QualiterCode.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepotDaoTest {

    private DepotDao depotDao ;

    @BeforeEach
    void setUp() {
        depotDao = new DepotDao();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void message(){

         assertEquals("hello",depotDao.message());
    }
}