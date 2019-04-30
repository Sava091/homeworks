package com.epam.training.javajunior.HW3.Task8State.States;

import com.epam.training.javajunior.HW3.Task8State.Grant;

public class DelayedState implements State {
    @Override
    public String createGrant(Grant grant) {
        return "Can`t do this on current state";
    }

    @Override
    public String viewGrant(Grant grant) {
        grant.changeState(new ViewedState());
        return "Grant " + grant.getName()+ "viewed ";
    }

    @Override
    public String delayGrant(Grant grant) {
        return "Can`t do this on current state";
    }

    @Override
    public String rejectGrant(Grant grant) {
        return "Can`t do this on current state";
    }

    @Override
    public String approveGrant(Grant grant) {
        return "Can`t do this on current state";
    }

    @Override
    public String recallGrant(Grant grant) {
        return "Can`t do this on current state";
    }
}