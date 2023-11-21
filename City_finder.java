public class City_finder {
    Double avgsalrange;
    String climatereg;
    String beach;
    Double saltax;
    Double avgrent;
    String econgrowth;
    String diversity;


    City_finder() {
    }

    City_finder(Double c_avgsalrange, String c_climatereg, String c_beach, Double c_saltax, Double c_avgrent, String c_econgrowth, String c_diversity) {
        avgsalrange = c_avgsalrange;
        climatereg = c_climatereg;
        beach = c_beach;
        saltax = c_saltax;
        avgrent = c_avgrent;
        econgrowth = c_econgrowth;
        diversity = c_diversity;
    }

    static City_finder NewYorkCity = new City_finder(74000.00, "Temperate Continental", "Yes", .045, 2200.00, "High","High" );
    static City_finder Chicago = new City_finder(78000.00, "Temperate Continental", "Yes", .1025, 2309.00, "Medium","High" );
    static City_finder LasVegas = new City_finder(59000.00, "Subtropical Hot Desert", "No", .045, 1500.00, "Low","Medium" );
    static City_finder Richmond = new City_finder(70000.00, "Temperate Subtropical", "Yes", .06, 1184.00, "Low","High" );
    static City_finder GreenBay = new City_finder(47000.00, "Temperate Continental", "Yes", .055, 850.00, "Medium","Low" );
    static City_finder SanFrancisco = new City_finder(100000.00, "Temperate Continental", "Yes", .045, 3300.00, "High","Medium" );
    static City_finder Birmingham = new City_finder(60000.00, "Humid Subtropical", "Yes", .04, 1300.00, "Low","High" );
    static City_finder Miami = new City_finder(52000.00, "Humid Subtropical", "Yes", .07, 2400.00, "Medium","Medium" );
    static City_finder Portland = new City_finder(41000.00, "Temperate Continental", "Yes", .045, 2200.00, "High","High" );
    static City_finder Denver = new City_finder(70000.00, "Mountain Desert", "No", .0881, 2000.00, "Medium","Low" );





}
