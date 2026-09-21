public class LocationTester {
    public static void main(String[] args) {
        Location loc = new Location();
        System.out.println(loc.getLatitude());
        System.out.println(loc.getLongitude());
        loc.setLatitude(27.12);
        loc.setLongitude(52.0);
        System.out.println(loc.getLatitude());
        System.out.println(loc.getLongitude());

        Location loc2 = new Location(27.43, 57.65);
        System.out.println(loc2.getLatitude());
        System.out.println(loc2.getLongitude());
        System.out.println(loc.distanceFrom(loc2));
    }
}
