public class TowerOfHanoi {

    static void solve(int n, char source, char auxiliary, char destination) {

        // Base case
        if (n == 1) {
            System.out.println(
                "Move disk 1 from " + source + " to " + destination
            );
            return;
        }

        // Move n-1 disks from source to auxiliary
        solve(n - 1, source, destination, auxiliary);

        // Move largest disk from source to destination
        System.out.println(
            "Move disk " + n + " from " + source + " to " + destination
        );

        // Move n-1 disks from auxiliary to destination
        solve(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {

        int n = 3;

        solve(n, 'A', 'B', 'C');
    }
}
