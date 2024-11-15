package com.pattern.design_patterns.creational_patterns.builder.after;

import com.pattern.design_patterns.creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        DefaultTourBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();

        TourPlanBuilder longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15));
    }
}
