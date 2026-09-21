public class PlaceTester {
    public static void main(String[] args) {
        Location fakeZoo = new Location();
        Location zoo = new Location(32.735316, 117.149046);
        Place p = new Place("Oakland Zoo", "Who knows? ", fakeZoo);
        System.out.println(p.getName());
        System.out.println(p.getDescription());
        System.out.println(p.getLocation());
        p.setDescription("2920 Zoo Drive");
        p.setName("San Diego Zoo");
        p.setLocation(zoo);
        System.out.println(p.getName());
        System.out.println(p.getDescription());
        System.out.println(p.getLocation());
        System.out.println(p.getID());

    }
}
