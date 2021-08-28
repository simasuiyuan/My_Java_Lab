public class Main {
    public static void main(String[] args) throws Exception {
        // static = modifier. a single copy of a variable/ methods is created and shared
        // The class "owns" the static member

        Friend friend = new Friend("Sponge bob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        //System.out.println(Friend.numberOfFriends); // use Friend instead of friends to access static var/methods => static way
        Friend.displayFriends();

    }
}
