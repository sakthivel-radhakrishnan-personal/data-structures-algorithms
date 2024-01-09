package aceyourcodinginterview.warmup.greedy;

public class CarFueling {

    static final int NO_REFILLS_REQUIRED = 0;
    static final int IMPOSSIBLE_TO_REACH_THE_DESTINATION = -1;

    static int computeMinRefills(int dist, int tank, int[] stops) {
        if (tankHasEnoughFuelToCoverDistance(tank, dist)) {
            return NO_REFILLS_REQUIRED;
        }

        if (noNearByPetrolStationAvailable(stops, tank)) {
            return IMPOSSIBLE_TO_REACH_THE_DESTINATION;
        }

        int stopsCount = stops.length;
        int tankCapacity = tank;
        int minNoOfRefillsRequired = NO_REFILLS_REQUIRED;

        for (int j = 0; j < stopsCount; j++) {
            if (j == 0) {
                tank -= stops[j];
                dist -= stops[j];
            } else {
                tank -= stops[j] - stops[j - 1];
                dist -= stops[j] - stops[j - 1];
            }

            if (j < stopsCount - 1 && tank < (stops[j + 1] - stops[j]) || j == stopsCount - 1 && tank < dist) {
                minNoOfRefillsRequired++;
                tank = tankCapacity;
            }
        }
        return tank >= dist ? minNoOfRefillsRequired : IMPOSSIBLE_TO_REACH_THE_DESTINATION;
    }

    static boolean tankHasEnoughFuelToCoverDistance(int tank, int dest) {
        return tank > dest;
    }

    static boolean noNearByPetrolStationAvailable(int[] petrolStations, int fuelTankCapacity) {
        for (int i = 0; i < petrolStations.length - 1; i++) {
            if ((petrolStations[i + 1] - petrolStations[i]) > fuelTankCapacity) {
                return true;
            }
        }
        return false;
    }
}
