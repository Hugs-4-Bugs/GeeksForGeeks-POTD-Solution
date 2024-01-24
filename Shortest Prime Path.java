class Solution {
    boolean[] primeList;

    Solution() {
        this.primeList = fetchPrimeList();
    }

    int solve(int Num1, int Num2) {
        if (Num1 == Num2) return 0;

        boolean[] visitedForward = new boolean[10000];
        boolean[] visitedBackward = new boolean[10000];

        Queue<Integer> qForward = new LinkedList<>();
        Queue<Integer> qBackward = new LinkedList<>();

        qForward.add(Num1);
        visitedForward[Num1] = true;

        qBackward.add(Num2);
        visitedBackward[Num2] = true;

        int currLevel = 0;

        while (!qForward.isEmpty() && !qBackward.isEmpty()) {
            int sizeForward = qForward.size();
            int sizeBackward = qBackward.size();

            for (int k = 0; k < sizeForward; k++) {
                int currentForward = qForward.poll();

                String currString = "" + currentForward;
                for (int i = 0; i < 4; i++) {
                    int start = i == 0 ? 1 : 0;

                    for (int j = start; j <= 9; j++) {
                        String numFormedString = currString.substring(0, i) + "" + j + currString.substring(i + 1);
                        int num = Integer.parseInt(numFormedString);

                        if (visitedBackward[num])
                            return currLevel + 1;

                        if (primeList[num] && !visitedForward[num]) {
                            qForward.add(num);
                            visitedForward[num] = true;
                        }
                    }
                }
            }

            currLevel++;

            for (int k = 0; k < sizeBackward; k++) {
                int currentBackward = qBackward.poll();

                String currString = "" + currentBackward;
                for (int i = 0; i < 4; i++) {
                    int start = i == 0 ? 1 : 0;

                    for (int j = start; j <= 9; j++) {
                        String numFormedString = currString.substring(0, i) + "" + j + currString.substring(i + 1);
                        int num = Integer.parseInt(numFormedString);

                        if (visitedForward[num])
                            return currLevel + 1;

                        if (primeList[num] && !visitedBackward[num]) {
                            qBackward.add(num);
                            visitedBackward[num] = true;
                        }
                    }
                }
            }

            currLevel++;
        }

        return -1; // If no path is found
    }

    boolean[] fetchPrimeList() {
        boolean[] prime = new boolean[10000];
        for (int i = 0; i < 10000; i++)
            prime[i] = true;

        for (int i = 2; i * i <= 9999; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 9999; j += i) {
                    prime[j] = false;
                }
            }
        }

        return prime;
    }
}
