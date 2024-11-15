package com.pattern.design_patterns.creational_patterns.builder.after;

import com.pattern.design_patterns.creational_patterns.builder.before.DetailPlan;
import com.pattern.design_patterns.creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {
    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans;
    @Override
    public TourPlanBuilder title(String title) {
        return null;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        DetailPlan detailPlan = new DetailPlan(day, plan);
        this.plans.add(detailPlan);
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }

}
