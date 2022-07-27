//package com.baeldung.algorithms.enumstatemachine;
// https://www.baeldung.com/java-enum-simple-state-machine

package datasupplychain;


//--------------------------------------
// Data Supply Chain States
// - Created
// - Ingested
// - Deduplicated
// - Deidenitfied
// - Packaged
// - Distributed

public enum SupplyChainStates {

    state_DataCreated {
        @Override
        public SupplyChainStates nextState() {
            System.out.println("state_DataCreated");
            return state_Ingested;
        }
       @Override
        public String currentState() {
            return "currentState: state_DataCreated";
    
        }

    },

    state_Ingested {
        @Override
        public SupplyChainStates nextState() {
            System.out.println("state_Ingested");
            return state_Deduplicated;
        }

       @Override
        public String currentState() {
            return "currentState: state_Ingested";
    
        }
    },
    state_Deduplicated {
        @Override
        public SupplyChainStates nextState() {
            System.out.println("state_Deduplicated");
            return state_Deidentified;
        }

       @Override
        public String currentState() {
            return "currentState: state_Deduplicated";
    
        }
    },
    state_Deidentified {
        @Override
        public SupplyChainStates nextState() {
            System.out.println("state_Deidentified");
            return state_Packaged;
        }

       @Override
        public String currentState() {
            return "currentState: state_Packaged";
    
        }
    },
    state_Packaged {
       @Override
       public SupplyChainStates nextState() {
            System.out.println("state_Packaged");
            return state_Distributed;
	   }

       @Override
        public String currentState() {
            return "currentState: state_Packaged";

        }
    },
   state_Distributed {
       @Override
       public SupplyChainStates nextState() {
            System.out.println("state_Distributed");
            return state_Distributed; //<-- This loops because it is the END STATE
	   }

       @Override
        public String currentState() {
            return "currentState: state_Distributed";

        }
    }
; //<-- END OF ENUM


//    public abstract String responsiblePerson();

    public abstract SupplyChainStates nextState();

    public abstract String currentState();

}
