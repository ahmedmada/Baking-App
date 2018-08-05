package com.qader.ahmed.bakingapp.listeners;


import com.qader.ahmed.bakingapp.models.Recipe;
import com.qader.ahmed.bakingapp.models.Step;

public interface StepListener {

    void setSelectedStep(Step step, Recipe recipe, int position);
}
