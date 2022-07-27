//package com.baeldung.algorithms.enumstatemachine;
// https://www.baeldung.com/java-enum-simple-state-machine

package datasupplychain;


//--------------------------------------

public enum LeaveRequestState {


    state_Submitted {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("state_Submitted: Starting the Leave Request and sending to Team Leader for approval.");
            return state_Escalated;
        }

        @Override
        public String responsiblePerson() {
            return "state_Submitted: responsiblePerson(): Employee";
        }

       @Override
        public String currentState() {
            return "currentState: state_Submitted";
    
        }
    },
    //--------------------------------------
    state_Escalated {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("state_Escalated: Reviewing the Leave Request and escalating to Department Manager.");
            return state_Approved;
        }

        @Override
        public String responsiblePerson() {
            return "state_Escalated: responsiblePerson(): Team Leader";
        }
       @Override
        public String currentState() {
            return "currentState: state_Escalated";
        }

    },
    //--------------------------------------
    state_Approved {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("state_Approved: Approving the Leave Request.");
            return this;
        }

        @Override
        public String responsiblePerson() {
            return "state_Approved: responsiblePerson(): Department Manager";
        }
       @Override
        public String currentState() {
            return "currentState: state_Approved";
        }

    };

    public abstract String responsiblePerson();

    public abstract LeaveRequestState nextState();

    public abstract String currentState();

}
