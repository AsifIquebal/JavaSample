package com.company.enums;

/**
 * Created by user on 04-Jan-17.
 */


public enum EndPointEnums {
    POST_ESCALATION_ISSUETYPE("/escalation/issuetype"),
    GET_ESCALATION_ISSUETYPES("/escalation/issuetypes");

    String endPoint;

    EndPointEnums(String endPoints) {
        this.endPoint = endPoints;
    }

    public String getEndPoint() {
        return this.endPoint;
    }

    public static void main(String[] args) {
        System.out.println(EndPointEnums.POST_ESCALATION_ISSUETYPE.getEndPoint());
        System.out.println(EndPointEnums.GET_ESCALATION_ISSUETYPES.getEndPoint());
        System.out.println(Constants.GET_ESCALATION_ISSUETYPES);
        System.out.println(Constants.POST_ESCALATION_ISSUETYPE);
    }

}


