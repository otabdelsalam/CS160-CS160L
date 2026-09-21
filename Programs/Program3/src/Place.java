/**
 *  Program 3
 *  Build a class called Place and use Location simultaneously
 *  CS160-4895
 *  9/21/2024
 *  @author Omar Abdelsalam
 */

public class Place {
    private String name;
    private String description;
    private Location location;

    public Place(String name, String description, double latitude, double longitude)
    {
        this.name = name;
        this.description = description;
        this.location = new Location(latitude, longitude);
    }

    public Place(String name, String description, Location location)
    {
        this.name = "";
        this.description = "";
        this.location = new Location();
    }

    public Place()
    {
        this.name = "";
        this.description = "";
        this.location = new Location();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setLocation(double latitude, double longitude)
    {
        location.setLatitude(latitude);
        location.setLongitude(longitude);
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }

    public Location getLocation()
    {
        return location;
    }

    public String toString()
    {
        return name + "," + description + "," + location;
    }

    public String getID()
    {
        return "Program 3b, " + "Omar Abdelsalam";
    }
}
