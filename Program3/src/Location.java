public class Location {
    private final double EARTH_RADIUS_MILES = 3963.1676;
    private double latitude;
    private double longitude;

    public Location()
    {
        latitude = 0;
        longitude = 0;
    }

    public Location(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    // Returns the distance in miles between this geo location and the given
    // other geo location
    public double distanceFrom(Location other) {
        // TODO:  First use Math.toRadians() convert this latitude & longitude, and
        //               the other latitude & longitude to radians
        double lat1 = Math.toRadians(this.getLatitude());
        double lon1 = Math.toRadians(this.getLongitude());

        double lat2 = Math.toRadians(other.getLatitude());
        double lon2 = Math.toRadians(other.getLongitude());

        // TODO:  Apply the spherical law of cosines with a triangle composed of
        //               the two locations and the North Pole

        double cosC = (Math.sin(lat1) * Math.sin(lat2)) + (Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
        double arcLenC = Math.acos(cosC);

        // Return the arcLenC times RADIUS
        return arcLenC * EARTH_RADIUS_MILES;
    }

    public String toString()
    {
        return "latitude:" + latitude + ",longitude:" + longitude;
    }

    public boolean equals(Location other)
    {
        if(this.getLatitude() == other.getLatitude() && this.getLongitude() == other.getLongitude())
        {
            return true;
        }
        return false;
    }
}