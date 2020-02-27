package com.nco.troli.env;

public class Constants {

    // ==== Database parameters ====
    // Qualifiers
    public static final String LOCATION_PSQL_QUALIFIER = "location-psql";
    public static final String PASSENGER_PSQL_QUALIFIER = "passenger-psql";
    public static final String STOP_PSQL_QUALIFIER = "stop-psql";
    public static final String COMPANY_PSQL_QUALIFIER = "company-psql";
    public static final String LINE_PSQL_QUALIFIER = "line-psql";
    public static final String BUS_PSQL_QUALIFIER = "bus-psql";
    // Source configuration
    public static final String POSTGRES_DATASOURCE_CONFIGURATION = "app.datasource";

    // ==== Routes ====
    // Base route
    private static final String BASE_API_PATH = "api/v1";
    public static final  String LOCATION_PATH = BASE_API_PATH + "/location";
    public static final  String PASSENGER_PATH = BASE_API_PATH + "/passenger";
    public static final  String STOP_PATH = BASE_API_PATH + "/stop";
    public static final  String COMPANY_PATH = BASE_API_PATH + "/company";
    public static final  String LINE_PATH = BASE_API_PATH + "/line";
    public static final  String BUS_PATH = BASE_API_PATH + "/bus";

}
