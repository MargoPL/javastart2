package pl.sda.javastart2.homework1;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Collections2Test {
    @Test
    void SalaryStats() {

    }

    @Test
    void nameSalaryStatsTest() {

        Map<String, Map<Double, Integer>> nameSalaryStats = Collections2.nameSalaryStats();

        Map<Double, Integer> innerMap = nameSalaryStats.get("Adam");
        Integer counter = innerMap.get(3333.0);
    }
}