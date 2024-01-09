package aceyourcodinginterview.warmup.greedy;

import java.util.*;

public class CollectingSignatures {
    static List<Integer> optimalPoints(Segment[] segments) {
        Arrays.sort(segments, Comparator.comparingInt(s -> s.end));
        Set<Integer> commonPointsSet = new HashSet<>();
        int commonPoint = segments[0].end;

        for (Segment segment : segments) {
            if (segmentOverlaps(segment, commonPoint)) {
                commonPoint = segment.end;
            }
            commonPointsSet.add(commonPoint);
        }
        commonPointsSet.add(commonPoint);
        return commonPointsSet.stream().toList();
    }

    static boolean segmentOverlaps(Segment segment, int commonPoint) {
        return commonPoint < segment.start || commonPoint > segment.end;
    }

    static class Segment {
        int start;
        int end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
