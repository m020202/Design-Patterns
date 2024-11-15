package com.pattern.design_patterns.creational_patterns.builder.after;

import com.pattern.design_patterns.creational_patterns.builder.before.DetailPlan;
import com.pattern.design_patterns.creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);

    TourPlanBuilder nightAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);
    TourPlan getPlan();
}
